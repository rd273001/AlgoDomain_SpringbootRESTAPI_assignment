package com.cdac.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.cdac.model.Employee;
import com.cdac.service.EmployeeService;

@RestController
@RequestMapping("/home")
public class HomeController {
	
	@Autowired
	EmployeeService employeeService;
	
	@GetMapping("/emp")
	public Iterable<Employee> getEmp() {
		return employeeService.findall();
	}
	
    // RequestBody used to bind your pojo object with method parameter
	@PostMapping("/add")
	public String postEmp(@RequestBody Employee emp) {
	System.out.println(emp);
	employeeService.save(emp);
	return "Employee data inserted successfully.";
	}
	@PutMapping("/update")
	public String updateEmp(@RequestBody Employee emp) {	
	System.out.println(emp);
	employeeService.update(emp);
	return "Employee data updated successfully.";
	}
	
	@DeleteMapping("/emp/{id}")
	public String deleteEmp(@PathVariable("id")int id) {
	employeeService.delete(id);
	return "Employee data deleted successfully.";
	}
}
