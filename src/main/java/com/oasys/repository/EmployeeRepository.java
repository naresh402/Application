package com.oasys.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.oasys.entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {
	Employee findByName(String name);

}
