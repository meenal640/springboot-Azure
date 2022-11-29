package com.example.springbootAzureproject;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.springbootAzureproject.Entity.Employee;
import com.example.springbootAzureproject.Repository.EmployeeRepository;

@SpringBootApplication
@RestController
public class SpringbootAzureprojectApplication {

	@Autowired
	private EmployeeRepository repository;
	
	@PostMapping("/Addemployee")
	public Employee addEmployee(@RequestBody Employee employee){
		return repository.save(employee);
	}
	
	@GetMapping("getAllEmployees")
	public List<Employee> getEmployees(){
		return repository.findAll();
	}
	public static void main(String[] args) {
		SpringApplication.run(SpringbootAzureprojectApplication.class, args);
	}

}
