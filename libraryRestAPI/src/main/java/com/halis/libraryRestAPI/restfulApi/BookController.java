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

import com.halis.libraryRestAPI.Business.IBookService;
import com.halis.libraryRestAPI.Entities.Book;

@RestController
@RequestMapping("/api/book")
public class BookController {
	
	private IBookService bookManager;

	@Autowired
	public BookController(IBookService bookManager) {
		this.bookManager = bookManager;
	}
	
	@GetMapping("/books")
	public List<Book> get(){
		return bookManager.GetAll();
	}
	
	@GetMapping("/books/{id}")
	public Book getById(@PathVariable int id){
		return bookManager.getById(id);
	}
	
	@PostMapping("/add")
	public void add(@RequestBody Book book) {
		bookManager.add(book);
	}
	
	@PutMapping("/update")
	public void update(@RequestBody Book book) {
		bookManager.update(book);
	}
	
	@DeleteMapping("/delete")
	public void delete(@RequestBody Book book) {
		bookManager.delete(book);
	}
	

}
