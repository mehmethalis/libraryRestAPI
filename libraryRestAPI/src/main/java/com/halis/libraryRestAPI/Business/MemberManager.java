package com.halis.libraryRestAPI.Business;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.halis.libraryRestAPI.DataAccess.IMemberDal;
import com.halis.libraryRestAPI.Entities.Member;

@Service
public class MemberManager implements IMemberService{
	
	private IMemberDal memberDal;
	
	@Autowired
	public MemberManager(IMemberDal memberDal) {
		this.memberDal = memberDal;
	}

	@Override
	@Transactional
	public List<Member> GetAll() {
		return memberDal.GetAll();
	}

	@Override
	@Transactional
	public void add(Member member) {
		memberDal.add(member);		
	}

	@Override
	@Transactional
	public void update(Member member) {
		memberDal.update(member);	
	}

	@Override
	@Transactional
	public void delete(Member member) {
		memberDal.delete(member);
	}

	@Override
	@Transactional
	public Member getById(int id) {
		return memberDal.getById(id);
	}

}
