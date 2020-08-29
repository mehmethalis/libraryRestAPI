package com.halis.libraryRestAPI.Business;

import java.util.List;

import com.halis.libraryRestAPI.Entities.Book;

public interface IBookService {
	
	List<Book> GetAll();
	
	void add(Book author);
	
	void update(Book author);

	void delete(Book author);
	
	Book getById(int id);

}
