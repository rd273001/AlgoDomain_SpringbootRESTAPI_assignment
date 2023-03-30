package com.cdac.service;

import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.cdac.dao.EmployeeDao;
import com.cdac.model.Employee;

@Service
public class EmployeeServiceImple implements EmployeeService{
	@Autowired
	EmployeeDao employeeDao;
	
	@Override
	public Employee save(Employee employee) {
		return employeeDao.save(employee);
	}

	@Override
	public Employee update(Employee employee) {
		return employeeDao.save(employee);
	}

	@Override
	public void delete(int id) {
		employeeDao.deleteById(id);
	}

	@Override
	public Employee getempbyid(int id) {
		Optional<Employee> opt=employeeDao.findById(id);
		
		return opt.get();
	}

	@Override
	public Iterable<Employee> findall() {
		return employeeDao.findAll();
	}

}
