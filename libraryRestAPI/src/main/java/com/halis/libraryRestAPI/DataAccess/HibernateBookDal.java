package com.halis.libraryRestAPI.DataAccess;

import java.util.List;

import javax.persistence.EntityManager;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.halis.libraryRestAPI.Entities.Book;
import org.hibernate.Session;

@Repository
public class HibernateBookDal implements IBookDal {
	
	private EntityManager entityManager;

	@Autowired
	public HibernateBookDal(EntityManager entityManager) {
		this.entityManager = entityManager;
	}

	@Override
	@Transactional
	public List<Book> GetAll() {
		Session session=entityManager.unwrap(Session.class);
		List<Book> books=session.createQuery("from Book",Book.class).getResultList();
		return books;
	}

	@Override
	@Transactional
	public void add(Book book) {
		Session session=entityManager.unwrap(Session.class);
		session.save(book);
	}

	@Override
	@Transactional
	public void update(Book book) {
		Session session=entityManager.unwrap(Session.class);
		session.saveOrUpdate(book);
		
	}

	@Override
	@Transactional
	public void delete(Book book) {
		Session session=entityManager.unwrap(Session.class);
		Book getBook=session.get(Book.class, book.getId());
		session.delete(getBook);
	}

	@Override
	@Transactional
	public Book getById(int id) {
		Session session=entityManager.unwrap(Session.class);
		return session.get(Book.class, id);
	}

}
