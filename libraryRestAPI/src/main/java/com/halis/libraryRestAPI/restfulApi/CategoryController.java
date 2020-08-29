package com.halis.libraryRestAPI.restfulApi;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


import com.halis.libraryRestAPI.Business.ICategoryService;
import com.halis.libraryRestAPI.Entities.Category;

@RestController
@RequestMapping("/api/category")
public class CategoryController {
	
	private ICategoryService categoryManager;
	
	@Autowired
	public CategoryController(ICategoryService categoryManager) {
		this.categoryManager = categoryManager;
	}
	
	@GetMapping("/categories")
	public List<Category> get(){
		return categoryManager.GetAll();
	}
	
	@GetMapping("/categories/{id}")
	public Category getById(@PathVariable int id){
		return categoryManager.getById(id);
	}
	
	@PostMapping("/add")
	public void add(@RequestBody Category category) {
		categoryManager.add(category);
	}
	
	@PutMapping("/update")
	public void update(@RequestBody Category category) {
		categoryManager.update(category);
	}
	
	@DeleteMapping("/delete")
	public void delete(@RequestBody Category category) {
		categoryManager.delete(category);
	}
	
	

}
