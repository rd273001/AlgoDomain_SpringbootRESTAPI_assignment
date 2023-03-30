package com.cdac.service;

import com.cdac.model.Employee;

public interface EmployeeService {
	public Employee save(Employee employee);
	public Employee update(Employee employee);
	public  void delete(int id);
	public Employee getempbyid(int id);
	public Iterable<Employee> findall();	
}
