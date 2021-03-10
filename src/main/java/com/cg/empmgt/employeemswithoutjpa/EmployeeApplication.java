package com.cg.empmgt.employeemswithoutjpa;

import com.cg.empmgt.employeemswithoutjpa.ui.EmployeeUI;



import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class EmployeeApplication {

    public static void main(String[] args){
       ConfigurableApplicationContext context= SpringApplication.run(EmployeeApplication.class, args);
       EmployeeUI employeeUI=context.getBean(EmployeeUI.class);
       employeeUI.start();

    }

}