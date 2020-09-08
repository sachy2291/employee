package com.smarte.empservice.exception;

import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
@Data
@AllArgsConstructor
@ToString
@NoArgsConstructor
public class IdNotFound extends Throwable{
	
	private static final long serialVersionUID = 1L;
	
	private Date timestamp;

	private String description;
	
	private String message;

	

}
