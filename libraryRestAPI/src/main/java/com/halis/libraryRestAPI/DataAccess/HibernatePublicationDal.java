package com.halis.libraryRestAPI.DataAccess;

import java.util.List;

import javax.persistence.EntityManager;

import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.halis.libraryRestAPI.Entities.Publication;

@Repository
public class HibernatePublicationDal implements IPublicationDal{

	private EntityManager entityManager;
	
	@Autowired
	public HibernatePublicationDal(EntityManager entityManager) {
		this.entityManager = entityManager;
	}

	@Override
	@Transactional
	public List<Publication> GetAll() {
		Session session=entityManager.unwrap(Session.class);
		return session.createQuery("from Publication",Publication.class).getResultList();
	}

	@Override
	@Transactional
	public void add(Publication publication) {
		Session session=entityManager.unwrap(Session.class);
		session.save(publication);
	}

	@Override
	@Transactional
	public void update(Publication publication) {
		Session session=entityManager.unwrap(Session.class);
		session.saveOrUpdate(publication);

	}

	@Override
	@Transactional
	public void delete(Publication publication) {
		Session session=entityManager.unwrap(Session.class);
		Publication getPublication=session.get(Publication.class, publication.getId());
		session.delete(getPublication);

	}

	@Override
	@Transactional
	public Publication getById(int id) {
		Session session=entityManager.unwrap(Session.class);
		return session.get(Publication.class, id);
	}

}
