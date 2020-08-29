package com.halis.libraryRestAPI.Business;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.halis.libraryRestAPI.DataAccess.ICategoryDal;
import com.halis.libraryRestAPI.Entities.Category;

@Service
public class CategoryManager implements ICategoryService {
	
	private ICategoryDal categoryDal;

	@Autowired
	public CategoryManager(ICategoryDal categoryDal) {
		this.categoryDal = categoryDal;
	}

	@Override
	@Transactional
	public List<Category> GetAll() {
		
		return categoryDal.GetAll();
	}

	@Override
	@Transactional
	public void add(Category category) {
		categoryDal.add(category);
		
	}

	@Override
	@Transactional
	public void update(Category category) {
		categoryDal.update(category);
	}

	@Override
	@Transactional
	public void delete(Category category) {
		categoryDal.delete(category);
		
	}

	@Override
	@Transactional
	public Category getById(int id) {
		return categoryDal.getById(id);
	}

}
