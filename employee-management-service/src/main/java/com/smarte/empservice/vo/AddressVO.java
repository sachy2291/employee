package com.smarte.empservice.vo;

import java.io.Serializable;

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
public class AddressVO implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private String city;
	@NotNull
	private Integer  pincode;
	@NotBlank(message = "State is mandatory")	
	private String state;
	@NotBlank(message = "Country is mandatory")
	private String country;

}
