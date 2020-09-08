package com.smarte.empservice.vo;

import java.io.Serializable;

import javax.validation.constraints.NotBlank;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class DepartmentVO implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@NotBlank(message = "Deprtment Name is mandatory")
	private String depatmentName;
	@NotBlank(message = "Department Region is mandatory")	
	private String departmentRegion;
}
