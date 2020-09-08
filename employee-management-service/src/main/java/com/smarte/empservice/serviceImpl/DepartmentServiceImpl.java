package com.smarte.empservice.serviceImpl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.smarte.empservice.eo.DepartmentEO;
import com.smarte.empservice.mapper.GlobalMapper;
import com.smarte.empservice.repository.DepartmentRepository;
import com.smarte.empservice.service.IDepartmentService;
import com.smarte.empservice.vo.DepartmentVO;
@Service
public class DepartmentServiceImpl implements IDepartmentService{
	
	private static final Logger logger = LoggerFactory.getLogger(DepartmentServiceImpl.class);

	@Autowired
	private DepartmentRepository departmentRepository;
	
	@Override
	public String createDepartment(DepartmentVO departmentVO) {
		logger.info("Start DepartmentServiceImpl createDepartment ");
		DepartmentEO departmentEO=GlobalMapper.INSTANCE.fromDepartmentVoToDepartmentVO(departmentVO);
		departmentRepository.save(departmentEO);
		String msg="Department created successfully";
		return msg;
	}

}
