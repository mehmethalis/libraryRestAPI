package com.halis.libraryRestAPI.Business;

import java.util.List;

import com.halis.libraryRestAPI.Entities.Category;

public interface ICategoryService {

	List<Category> GetAll();
	
	void add(Category category);
	
	void update(Category category);

	void delete(Category category);
	
	Category getById(int id);
}
