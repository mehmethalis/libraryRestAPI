package com.halis.libraryRestAPI.Business;

import java.util.List;

import com.halis.libraryRestAPI.Entities.Employee;

public interface IEmployeeService {

	List<Employee> GetAll();
	
	void add(Employee employee);
	
	void update(Employee employee);

	void delete(Employee employee);
	
	Employee getById(int id);
}
