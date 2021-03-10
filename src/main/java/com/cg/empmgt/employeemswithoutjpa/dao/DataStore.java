package com.cg.empmgt.employeemswithoutjpa.dao;

import java.util.*;

import com.cg.empmgt.employeemswithoutjpa.beans.*;

import org.springframework.stereotype.Component;

 @Component
 public class DataStore {

	public DataStore() {
	}
	

	public static Map<Integer, Employee> store = new HashMap<>();
	
	public Map<Integer, Employee> getStore() {
        return store;
    }

}