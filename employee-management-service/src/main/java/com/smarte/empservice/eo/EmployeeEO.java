package com.smarte.empservice.eo;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
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
@Entity
@Table(name="tbl_employee")
public class EmployeeEO implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long employeeId;
	
	@NotNull
	private Integer age;
	
	@NotNull
	private Long annualCtc;
	
	private Date joiningDate;
	
	@NotNull(message = "Status is mandatory")
	private Boolean status;
	@NotBlank(message = "User Name is mandatory")
	private String userName;
	
	@NotBlank(message = "Password is mandatory")
	private String password;
	
    private Long addressId;
	
	
}
