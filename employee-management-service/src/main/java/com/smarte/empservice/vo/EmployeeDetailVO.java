package com.smarte.empservice.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class EmployeeDetailVO {
	
	private EmployeeVO employeeVO;
	
	private AddressVO addressVO;
	
	private Long departmentId;

}
