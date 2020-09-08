package com.smarte.empservice.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.smarte.empservice.service.IDepartmentService;
import com.smarte.empservice.vo.DepartmentVO;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping(value = "v1/api")
public class DepartmentController {
	
	private static final Logger logger = LoggerFactory.getLogger(DepartmentController.class);
	
	@Autowired
	private IDepartmentService iDepartmentService;
	
	@PostMapping(value="/department")
	public String createDepartment(@RequestBody DepartmentVO departmentVO) {
		logger.info("Department request body "+departmentVO);	
		return iDepartmentService.createDepartment(departmentVO);
	}

}
