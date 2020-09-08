package com.smarte.empservice.serviceImpl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCrypt;
import org.springframework.stereotype.Service;

import com.smarte.empservice.eo.AddressEO;
import com.smarte.empservice.eo.EmployeeDepartmentMappingEO;
import com.smarte.empservice.eo.EmployeeEO;
import com.smarte.empservice.mapper.GlobalMapper;
import com.smarte.empservice.repository.AddressRepository;
import com.smarte.empservice.repository.EmployeeDepartmentMappingRepo;
import com.smarte.empservice.repository.EmployeeRepository;
import com.smarte.empservice.service.IEmployeeService;
import com.smarte.empservice.vo.EmployeeDetailVO;

@Service
public class EmployeeServiceImpl implements IEmployeeService {

	private static final Logger logger = LoggerFactory.getLogger(EmployeeServiceImpl.class);

	@Autowired
	private EmployeeRepository employeeRepository;

	@Autowired
	private AddressRepository addressRepository;

	@Autowired
	private EmployeeDepartmentMappingRepo employeeDepartmentMappingRepo;

	@Override
	public String createEmployeeDetails(EmployeeDetailVO employeeDetailVO) {
		logger.info("Start EmployeeServiceImpl createEmployeeDetails service");
		EmployeeEO employeeEO = GlobalMapper.INSTANCE.fromEmployeeVOToEmployeEO(employeeDetailVO.getEmployeeVO());
		employeeEO.setPassword(encodePassword(employeeEO.getPassword()));
		EmployeeEO updatedEmployeeEO = employeeRepository.save(employeeEO);
		EmployeeDepartmentMappingEO employeeDepartmentMappingEO = new EmployeeDepartmentMappingEO();
		employeeDepartmentMappingEO.setDepartmentId(employeeDetailVO.getDepartmentId());
		employeeDepartmentMappingEO.setEmployeeId(updatedEmployeeEO.getEmployeeId());
		employeeDepartmentMappingRepo.save(employeeDepartmentMappingEO);
		String msg = addAddress(updatedEmployeeEO, employeeDetailVO);
		return msg;
	}

	private String addAddress(EmployeeEO updatedEmployeeEO, EmployeeDetailVO employeeDetailVO) {
		AddressEO addressEO = null;
		String msg = null;
		try {
			addressEO = new AddressEO();
			addressEO = GlobalMapper.INSTANCE.fromAddressVOtoAddressEO(employeeDetailVO.getAddressVO());
			addressRepository.save(addressEO);
			updatedEmployeeEO.setAddressId(addressEO.getId());
			employeeRepository.save(updatedEmployeeEO);
			msg = "Employee details added successfully";
		} catch (Exception e) {
			throw e;
		}

		return msg;
	}
	
	public static String encodePassword(String password) {
		password = BCrypt.hashpw(password, BCrypt.gensalt());
		return password;
	}

}
