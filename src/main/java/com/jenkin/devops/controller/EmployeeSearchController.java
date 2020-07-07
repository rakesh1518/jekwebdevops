package com.jenkin.devops.controller;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jenkin.devops.entity.Employee;
import com.jenkin.devops.services.EmployeeServices;

@RestController
public class EmployeeSearchController {


	   @Autowired
	   EmployeeServices employeeSearchService;
	   
	   
	   
	   @RequestMapping("/employee/find/{id}")
	   public Employee findById(@PathVariable Long id){
	      return employeeSearchService.findById(id);
	   }
	   @RequestMapping("/employee/findall")
	   public Collection<Employee> findAll(){
	      return employeeSearchService.findAll();
	   
}}
