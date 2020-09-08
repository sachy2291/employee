package com.smarte.empservice.vo;

import java.io.Serializable;
import java.util.Date;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;


@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class EmployeeVO implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
		
	@NotBlank(message = "Age is mandatory")
	private Integer age;
	
	@NotBlank(message = "Annual CTC is mandatory")
	private Long annualCtc;
	
	private Date joiningDate;
	
	@NotNull(message = "Status is mandatory")
	private Boolean status;
	@NotBlank(message = "User Name is mandatory")
	private String userName;
	
	@NotBlank(message = "Password is mandatory")
	private String password;
	

}
