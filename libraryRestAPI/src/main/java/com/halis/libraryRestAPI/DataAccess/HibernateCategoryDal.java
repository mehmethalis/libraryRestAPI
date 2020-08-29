package com.halis.libraryRestAPI.DataAccess;

import java.util.List;

import javax.persistence.EntityManager;

import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.halis.libraryRestAPI.Entities.Category;

@Repository
public class HibernateCategoryDal implements ICategoryDal{

	private EntityManager entityManager;
	
	@Autowired
	public HibernateCategoryDal(EntityManager entityManager) {
		this.entityManager = entityManager;
	}

	@Override
	@Transactional
	public List<Category> GetAll() {
		Session session=entityManager.unwrap(Session.class);
		return session.createQuery("from Category",Category.class).getResultList();
	}

	@Override
	@Transactional
	public void add(Category category) {
		Session session=entityManager.unwrap(Session.class);
		session.save(category);		
	}

	@Override
	@Transactional
	public void update(Category category) {
		Session session=entityManager.unwrap(Session.class);
		session.saveOrUpdate(category);
		
	}

	@Override
	@Transactional
	public void delete(Category category) {
		Session session=entityManager.unwrap(Session.class);
		Category getCategory=session.get(Category.class,category.getId());
		session.delete(getCategory);
		
	}

	@Override
	@Transactional
	public Category getById(int id) {
		Session session=entityManager.unwrap(Session.class);
		return session.get(Category.class,id);
	}

}
