package com.halis.libraryRestAPI.DataAccess;

import java.util.List;

import com.halis.libraryRestAPI.Entities.Member;

public interface IMemberDal {

	List<Member> GetAll();
	
	void add(Member member);
	
	void update(Member member);

	void delete(Member member);
	
	Member getById(int id);
}
