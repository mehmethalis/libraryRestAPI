package com.halis.libraryRestAPI.DataAccess;

import java.util.List;

import javax.persistence.EntityManager;

import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.halis.libraryRestAPI.Entities.Employee;


@Repository
public class HibernateEmployeeDal implements IEmployeeDal{
	
	private EntityManager entityManager;

	@Autowired
	public HibernateEmployeeDal(EntityManager entityManager) {
		this.entityManager = entityManager;
	}

	@Override
	@Transactional
	public List<Employee> GetAll() {
		Session session=entityManager.unwrap(Session.class);
		return session.createQuery("from Employee",Employee.class).getResultList();
	}

	@Override
	@Transactional
	public void add(Employee employee) {
		Session session=entityManager.unwrap(Session.class);
		session.save(employee);
	}

	@Override
	@Transactional
	public void update(Employee employee) {
		Session session=entityManager.unwrap(Session.class);
		session.saveOrUpdate(employee);
		
	}

	@Override
	@Transactional
	public void delete(Employee employee) {
		Session session=entityManager.unwrap(Session.class);
		Employee getEmployee=session.get(Employee.class,employee.getId());
		session.delete(getEmployee);
		
	}

	@Override
	@Transactional
	public Employee getById(int id) {
		Session session=entityManager.unwrap(Session.class);
		return session.get(Employee.class, id);
	}

}
