package com.cg.empmgt.employeemswithoutjpa.util;

import java.util.*;
import java.util.stream.Collectors;

import org.springframework.stereotype.Component;

import com.cg.empmgt.employeemswithoutjpa.dto.*;
import com.cg.empmgt.employeemswithoutjpa.beans.*;

@Component
public class EmployeeUtil {
	
	public EmployeeDetails toDetails(Employee employee) {
		EmployeeDetails details = new EmployeeDetails(employee.getId(),employee.getName(),employee.getDepartment());
		return details;
	}
	
	public List<EmployeeDetails> toDetailsList(Collection<Employee> employees){
		List<EmployeeDetails> desiredList = employees.stream().map(emp -> toDetails(emp)).collect(Collectors.toList());
		return desiredList;
	}

}