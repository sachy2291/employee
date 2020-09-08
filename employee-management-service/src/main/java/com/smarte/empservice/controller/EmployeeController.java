package com.smarte.empservice.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.smarte.empservice.service.IEmployeeService;
import com.smarte.empservice.vo.EmployeeDetailVO;


@CrossOrigin(origins = "*")
@RestController
@RequestMapping(value = "v1/api")
public class EmployeeController {
	
	private static final Logger logger = LoggerFactory.getLogger(EmployeeController.class);

	@Autowired
	private IEmployeeService iEmployeeService;
	
	@PostMapping(value="/employee")
	public String createEmployeeDetails( @RequestBody EmployeeDetailVO employeeDetailVO) {
		logger.info("Employee Detail request body "+employeeDetailVO);	
		return iEmployeeService.createEmployeeDetails(employeeDetailVO);
	}
}
