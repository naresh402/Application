package com.oasys.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.oasys.entity.Employee;
import com.oasys.service.EmployeeService;

@RestController
public class EmployeeController {

	@Autowired
	EmployeeService employeeService;

	@PostMapping("/add")
	public Employee create(@RequestBody Employee employeeentity) {

		return employeeService.addEmployee(employeeentity);
	}

	@PostMapping("/addAll")
	public List<Employee> createAll(@RequestBody List<Employee> employee) {

		return employeeService.addAll(employee);
	}

	@GetMapping("/get/{id}")
	public Employee get(@PathVariable Integer id) {
		return employeeService.getEmployee(id);
	}

	@GetMapping("/getAll")
	public List<Employee> getAll() {
		return employeeService.getAllEmployee();
	}

	
	
	  @GetMapping("/employee/{name}") 
	  public Employee getEmployee(@PathVariable String name) {
		  return employeeService.getEmployeeByName(name);
		  }
	  
	  @PutMapping("/update")
	  public Employee updateEmployee(@RequestBody Employee employee) {
		 return employeeService.updateById(employee);
	  }
	 
	  @DeleteMapping("/delete/{id}")
	  public String deleteById(@PathVariable Integer id) {
		  return employeeService.deleteEmployeeById(id);
	  }
	 
}
