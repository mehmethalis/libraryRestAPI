package com.halis.libraryRestAPI.restfulApi;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.halis.libraryRestAPI.Business.IAuthorService;
import com.halis.libraryRestAPI.Entities.Author;

@RestController
@RequestMapping("/api")
public class AuthorController {
	
	private IAuthorService authorService;

	@Autowired
	public AuthorController(IAuthorService authorService) {
		this.authorService = authorService;
	}
	
	@GetMapping("/authors")
	public List<Author> get(){
		return authorService.GetAll();
	}
	
	

}
