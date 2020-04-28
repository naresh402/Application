package com.oasys.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.oasys.entity.Employee;
import com.oasys.repository.EmployeeRepository;

@Service
public class EmployeeService {

	@Autowired
	EmployeeRepository employeeRepository;

	public Employee addEmployee(Employee employeeEntity) {
		return employeeRepository.save(employeeEntity);
	}

	public List<Employee> addAll(List<Employee> employee) {

		return employeeRepository.saveAll(employee);
	}

	public Employee getEmployee(Integer id) {
		return employeeRepository.findById(id).orElse(null);
	}

	public List<Employee> getAllEmployee() {

		return employeeRepository.findAll();
	}

	
	
	  public Employee getEmployeeByName(String name) {
		  return  employeeRepository.findByName(name); 
		  }
	 
	 public Employee updateById(Employee employee) {
		 Employee emp=new Employee();
		 emp=employeeRepository.findById(employee.getId()).orElse(null);
		 emp.setName(employee.getName());
		 emp.setEmail(employee.getEmail());
		 emp.setAddress(employee.getAddress());
		 emp.setTelephone(employee.getTelephone());
		 return employeeRepository.save(emp);
	 }
	 
	 public String deleteEmployeeById(Integer id) {
		  employeeRepository.deleteById(id);
		  return "employee || " +id;
	 }
}
