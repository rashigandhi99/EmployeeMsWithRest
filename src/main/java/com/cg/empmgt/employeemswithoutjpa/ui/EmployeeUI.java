package com.cg.empmgt.employeemswithoutjpa.ui;

import com.cg.empmgt.employeemswithoutjpa.beans.*;

import com.cg.empmgt.employeemswithoutjpa.service.*;
import com.cg.empmgt.employeemswithoutjpa.exception.*;
import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class EmployeeUI {
	
	@Autowired
	private IEmployeeService service;
	
	public void start() {
		
		try {
			Employee rashi = service.addEmployee("Rashi", "Developer");
			Employee jhalak = service.addEmployee("Jhalak", "Tester");
			Employee shivi = service.addEmployee("Shivi", "Developer");
			
			
			List<Employee>list = service.findAll();
			displayAll(list);
			
		}catch(InvalidIdException e) {
			System.out.println(e.getMessage());
		}catch(InvalidNameException e) {
			System.out.println(e.getMessage());
		}catch(InvalidDeptException e) {
			System.out.println(e.getMessage());
		}catch(Exception e) {
			System.out.println("Something went wrong");
		}
		
		
	}
	
	public void display(Employee employee) {
		System.out.println(employee.getId()+" "+employee.getName()+" "+employee.getDepartment());
	}
	
	public void displayAll(Collection<Employee>employees) {
		for(Employee employee : employees) {
			display(employee);
		}
	}

}