package com.cg.empmgt.employeemswithoutjpa.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import com.cg.empmgt.employeemswithoutjpa.exception.*;

@RestControllerAdvice
public class CentralizedExceptionHandler {
	
	
	
	@ResponseStatus(HttpStatus.BAD_REQUEST)
	@ExceptionHandler(InvalidNameException.class)
	public String handleInvalidEmployeeName(InvalidNameException e) {
		return e.getMessage();
	}
	
	@ResponseStatus(HttpStatus.BAD_REQUEST)
	@ExceptionHandler(InvalidDeptException.class)
	public String handleInvalidDepartmentName(InvalidDeptException e) {
		return e.getMessage();
	}

}