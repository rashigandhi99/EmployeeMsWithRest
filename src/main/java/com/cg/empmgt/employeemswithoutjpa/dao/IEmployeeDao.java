package com.cg.empmgt.employeemswithoutjpa.dao;

import com.cg.empmgt.employeemswithoutjpa.beans.*;
import java.util.List;

public interface IEmployeeDao {
	void add(Employee employee);

	Employee findById(int id);

	void removeById(int id);

	List<Employee> findAll();

}