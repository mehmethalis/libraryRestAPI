package com.halis.libraryRestAPI.DataAccess;

import java.util.List;

import com.halis.libraryRestAPI.Entities.Author;

public interface IAuthorDal {
	
	List<Author> GetAll();
	
	void add(Author author);
	
	void update(Author author);

	void delete(Author author);


}
