package com.example.springbootAzureproject.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.springbootAzureproject.Entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Integer>{
	
}
