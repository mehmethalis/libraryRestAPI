package com.halis.libraryRestAPI.restfulApi;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.halis.libraryRestAPI.Business.IEmployeeService;
import com.halis.libraryRestAPI.Entities.Employee;

@RestController
@RequestMapping("/api/employee")
public class EmployeeController {
	
	private IEmployeeService employeManager;

	@Autowired
	public EmployeeController(IEmployeeService employeManager) {
		this.employeManager = employeManager;
	}
	
	@GetMapping("/employees")
	public List<Employee> get(){
		return employeManager.GetAll();
	}
	
	@GetMapping("/employees/{id}")
	public Employee getById(@PathVariable int id){
		return employeManager.getById(id);
	}
	
	@PostMapping("/add")
	public void add(@RequestBody Employee employee) {
		employeManager.add(employee);
	}
	
	@PutMapping("/update")
	public void update(@RequestBody Employee employee) {
		employeManager.update(employee);
	}
	
	@DeleteMapping("/delete")
	public void delete(@RequestBody Employee employee) {
		employeManager.delete(employee);
	}
	
}
