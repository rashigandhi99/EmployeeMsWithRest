package com.cg.empmgt.employeemswithoutjpa.controllers;

import java.util.List;
import com.cg.empmgt.employeemswithoutjpa.dto.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.cg.empmgt.employeemswithoutjpa.beans.*;
import com.cg.empmgt.employeemswithoutjpa.service.*;
import com.cg.empmgt.employeemswithoutjpa.util.*;

@RequestMapping("/employees")
@RestController
public class EmployeeRestController {
	
	@Autowired
	private IEmployeeService service;
	
	@Autowired
	private EmployeeUtil util;
	
	@GetMapping(value = "/byId/{id}")
	public EmployeeDetails fetchEmpoyee(@PathVariable("id") Integer employeeId) {
		Employee employee = service.findById(employeeId);
		EmployeeDetails details=util.toDetails(employee);
		return details;
	}
	
	@GetMapping
	public List<EmployeeDetails> fetchAllEmployee(){
		List<Employee> list = service.findAll();
		List<EmployeeDetails>desiredList = util.toDetailsList(list);
		return desiredList;
	}
	
	@ResponseStatus(HttpStatus.CREATED)
	@PostMapping("/add")
    public String addEmployee(@RequestBody CreateEmployeeRequest requestData) {
        Employee create = service.addEmployee(requestData.getName(), requestData.getDepartment());
        return "Created employee with id=" + create.getId();
    }
	
	
	
	

}