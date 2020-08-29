package com.halis.libraryRestAPI.DataAccess;

import java.util.List;

import javax.persistence.EntityManager;

import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.halis.libraryRestAPI.Entities.Member;

@Repository
public class HibernateMemberDal implements IMemberDal{

	private EntityManager entityManager;
	
	@Autowired
	public HibernateMemberDal(EntityManager entityManager) {
		this.entityManager = entityManager;
	}

	@Override
	@Transactional
	public List<Member> GetAll() {
		Session session=entityManager.unwrap(Session.class);
		return session.createQuery("from Member",Member.class).getResultList();
	}

	@Override
	@Transactional
	public void add(Member member) {
		Session session=entityManager.unwrap(Session.class);
		session.save(member);
		
	}

	@Override
	@Transactional
	public void update(Member member) {
		Session session=entityManager.unwrap(Session.class);
		session.saveOrUpdate(member);
		
	}

	@Override
	@Transactional
	public void delete(Member member) {
		Session session=entityManager.unwrap(Session.class);
		Member getMember=session.get(Member.class, member.getId());
		session.delete(getMember);
		
	}

	@Override
	@Transactional
	public Member getById(int id) {
		Session session=entityManager.unwrap(Session.class);
		return session.get(Member.class, id);
	}

}
