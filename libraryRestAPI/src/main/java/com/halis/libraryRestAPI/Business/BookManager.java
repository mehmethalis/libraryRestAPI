package com.halis.libraryRestAPI.Business;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.halis.libraryRestAPI.DataAccess.IBookDal;
import com.halis.libraryRestAPI.Entities.Book;

@Service
public class BookManager implements IBookService{
	
	private IBookDal bookDal;
	
	@Autowired
	public BookManager(IBookDal bookDal) {
		this.bookDal = bookDal;
	}

	@Override
	@Transactional
	public List<Book> GetAll() {
		return bookDal.GetAll();
	}

	@Override
	@Transactional
	public void add(Book book) {
		bookDal.add(book);
		
	}

	@Override
	@Transactional
	public void update(Book book) {
		bookDal.update(book);		
	}

	@Override
	@Transactional
	public void delete(Book book) {
		bookDal.delete(book);
		
	}

	@Override
	@Transactional
	public Book getById(int id) {
		return bookDal.getById(id);
	}

}
