package com.halis.libraryRestAPI.restfulApi;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
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
	
	@GetMapping("/authors/{id}")
	public Author getById(@PathVariable int id){
		return authorService.getById(id);
	}
	
	@PostMapping("/add")
	public void add(@RequestBody Author author) {
		authorService.add(author);
	}
	
	@PutMapping("/update")
	public void update(@RequestBody Author author) {
		authorService.update(author);
	}
	
	@DeleteMapping("/delete")
	public void delete(@RequestBody Author author) {
		authorService.delete(author);
	}
	

}
