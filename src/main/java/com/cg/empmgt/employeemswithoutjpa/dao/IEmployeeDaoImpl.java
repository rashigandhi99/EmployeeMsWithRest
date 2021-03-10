package com.cg.empmgt.employeemswithoutjpa.dao;


import java.util.*;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.cg.empmgt.employeemswithoutjpa.dao.*;
import com.cg.empmgt.employeemswithoutjpa.beans.*;
import com.cg.empmgt.employeemswithoutjpa.beans.*;

@Repository
public class IEmployeeDaoImpl implements IEmployeeDao {
	
	
	
	@Autowired
	private DataStore storeHolder;

	private Map<Integer, Employee> store;


	@PostConstruct
	public void afterInit(){
		store=storeHolder.getStore();
	}

	private int generatedId = 0;

	public int generateId() {
		generatedId++;
		return generatedId;
	}

	@Override
	public void add(Employee employee) {
		Map<Integer, Employee> store = DataStore.store;
		int id = generateId();
		employee.setId(id);
		store.put(id, employee);
	}

	@Override
	public Employee findById(int id) {
		Map<Integer, Employee> store = DataStore.store;
		Employee employee = store.get(id);
		return employee;
	}

	public void removeById(int id) {
		Map<Integer, Employee> store = DataStore.store;
		store.remove(id);
	}

	@Override
	public List<Employee> findAll() {
		Map<Integer, Employee> store = DataStore.store;
		Collection<Employee> employees = store.values();
		List<Employee> list = new ArrayList<>(employees);
		return list;
	}
	
	

}