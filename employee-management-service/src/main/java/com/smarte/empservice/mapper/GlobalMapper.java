package com.smarte.empservice.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import com.smarte.empservice.eo.AddressEO;
import com.smarte.empservice.eo.DepartmentEO;
import com.smarte.empservice.eo.EmployeeEO;
import com.smarte.empservice.vo.AddressVO;
import com.smarte.empservice.vo.DepartmentVO;
import com.smarte.empservice.vo.EmployeeVO;

@Mapper
public interface GlobalMapper {
	GlobalMapper INSTANCE= Mappers.getMapper(GlobalMapper.class);


	EmployeeEO fromEmployeeVOToEmployeEO(EmployeeVO employeeVO);


	AddressEO fromAddressVOtoAddressEO(AddressVO addressVO);

	DepartmentEO fromDepartmentVoToDepartmentVO(DepartmentVO departmentVO);

}
