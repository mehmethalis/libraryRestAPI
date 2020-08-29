package com.halis.libraryRestAPI.Business;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.halis.libraryRestAPI.DataAccess.IEmployeeDal;
import com.halis.libraryRestAPI.Entities.Employee;

@Service
public class EmployeeManager implements IEmployeeService{
	
	private IEmployeeDal employeeDal;
	
	@Autowired
	public EmployeeManager(IEmployeeDal employeeDal) {
		this.employeeDal = employeeDal;
	}

	@Override
	@Transactional
	public List<Employee> GetAll() {
		return employeeDal.GetAll();
	}

	@Override
	@Transactional
	public void add(Employee employee) {
		employeeDal.add(employee);
	}

	@Override
	@Transactional
	public void update(Employee employee) {
		employeeDal.update(employee);
	}

	@Override
	@Transactional
	public void delete(Employee employee) {
		employeeDal.delete(employee);
		
	}

	@Override
	@Transactional
	public Employee getById(int id) {
		return employeeDal.getById(id);
	}

}
