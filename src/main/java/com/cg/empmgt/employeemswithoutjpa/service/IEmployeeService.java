package com.cg.empmgt.employeemswithoutjpa.service;

import com.cg.empmgt.employeemswithoutjpa.beans.*;
import java.util.List;

public interface IEmployeeService {

	Employee addEmployee(String name, String department);

	Employee findById(int id);

	List<Employee> findAll();
	
    
}