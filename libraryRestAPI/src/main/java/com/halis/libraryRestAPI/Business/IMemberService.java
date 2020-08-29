package com.halis.libraryRestAPI.Business;

import java.util.List;

import com.halis.libraryRestAPI.Entities.Member;

public interface IMemberService {

	List<Member> GetAll();
	
	void add(Member member);
	
	void update(Member member);

	void delete(Member member);
	
	Member getById(int id);

}
