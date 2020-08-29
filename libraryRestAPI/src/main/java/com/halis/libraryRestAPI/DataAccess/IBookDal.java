package com.halis.libraryRestAPI.DataAccess;

import java.util.List;

import com.halis.libraryRestAPI.Entities.Book;

public interface IBookDal {
	
	List<Book> GetAll();
	
	void add(Book book);
	
	void update(Book book);

	void delete(Book book);
	
	Book getById(int id);
	
	

}
