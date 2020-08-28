package com.halis.libraryRestAPI.Business;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.halis.libraryRestAPI.DataAccess.IAuthorDal;
import com.halis.libraryRestAPI.Entities.Author;

@Service
public class AuthorManager implements IAuthorService{
	
	private  IAuthorDal authorDal;
	
	@Autowired
	public AuthorManager(IAuthorDal authorDal) {
		this.authorDal = authorDal;
	}

	@Override
	@Transactional
	public List<Author> GetAll() {
		return this.authorDal.GetAll();
	}

	@Override
	@Transactional
	public void add(Author author) {
		this.authorDal.add(author);
	}

	@Override
	@Transactional
	public void update(Author author) {
		this.authorDal.update(author);
	}

	@Override
	@Transactional
	public void delete(Author author) {
		this.authorDal.delete(author);
	}

	@Override
	@Transactional
	public Author getById(int id) {
		return this.authorDal.getById(id);
	}

}
