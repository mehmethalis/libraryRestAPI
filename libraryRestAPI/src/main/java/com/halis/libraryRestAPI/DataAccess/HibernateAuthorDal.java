package com.halis.libraryRestAPI.DataAccess;

import java.util.List;

import javax.persistence.EntityManager;

import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.halis.libraryRestAPI.Entities.Author;

@Repository
public class HibernateAuthorDal implements IAuthorDal{
	
	private EntityManager entityManager;
	
	@Autowired
	public HibernateAuthorDal(EntityManager entityManager) {
		this.entityManager = entityManager;
	}

	@Override
	@Transactional
	public List<Author> GetAll() {
		Session session=entityManager.unwrap(Session.class);
		List<Author> authors=session.createQuery("from Author",Author.class).getResultList();
		return authors;
	}

	@Override
	public void add(Author author) {
		Session session=entityManager.unwrap(Session.class);
		session.saveOrUpdate(author);
		
	}

	@Override
	public void update(Author author) {
		Session session=entityManager.unwrap(Session.class);
		session.saveOrUpdate(author);
		
	}

	@Override
	public void delete(Author author) {
		Session session=entityManager.unwrap(Session.class);
		Author nauthor=session.get(Author.class, author.getId());
		session.delete(nauthor);
	}

	@Override
	public Author getById(int id) {
		Session session=entityManager.unwrap(Session.class);
		return session.get(Author.class, id);
	}

}
