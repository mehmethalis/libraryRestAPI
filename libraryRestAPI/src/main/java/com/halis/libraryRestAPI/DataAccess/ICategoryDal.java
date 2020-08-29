package com.halis.libraryRestAPI.DataAccess;

import java.util.List;

import com.halis.libraryRestAPI.Entities.Category;

public interface ICategoryDal {

	List<Category> GetAll();
	
	void add(Category category);
	
	void update(Category category);

	void delete(Category category);
	
	Category getById(int id);
}
