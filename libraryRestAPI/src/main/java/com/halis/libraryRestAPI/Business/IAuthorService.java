package com.halis.libraryRestAPI.Business;

import java.util.List;

import com.halis.libraryRestAPI.Entities.Author;

public interface IAuthorService {
	
	List<Author> GetAll();
	
	void add(Author author);
	
	void update(Author author);

	void delete(Author author);
	
	Author getById(int id);

}
