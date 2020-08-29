package com.halis.libraryRestAPI.restfulApi;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.halis.libraryRestAPI.Business.IMemberService;
import com.halis.libraryRestAPI.Entities.Member;

@RestController
@RequestMapping("/api/member")
public class MemberController {
	
	private IMemberService memberManager;
	
	@Autowired
	public MemberController(IMemberService memberManager) {
		this.memberManager = memberManager;
	}
	
	@GetMapping("/members")
	public List<Member> get(){
		return memberManager.GetAll();
	}
	
	@GetMapping("/members/{id}")
	public Member getById(@PathVariable int id){
		return memberManager.getById(id);
	}
	
	@PostMapping("/add")
	public void add(@RequestBody Member member) {
		memberManager.add(member);
	}
	
	@PutMapping("/update")
	public void update(@RequestBody Member member) {
		memberManager.update(member);
	}
	
	@DeleteMapping("/delete")
	public void delete(@RequestBody Member member) {
		memberManager.delete(member);
	}
	

}
