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

import com.halis.libraryRestAPI.Business.IPublicationService;
import com.halis.libraryRestAPI.Entities.Publication;

@RestController
@RequestMapping("/api/publication")
public class PublicationController {
	
	private IPublicationService publicationManager;

	@Autowired
	public PublicationController(IPublicationService publicationManager) {
		this.publicationManager = publicationManager;
	}
	
	@GetMapping("/publications")
	public List<Publication> get(){
		return publicationManager.GetAll();
	}
	
	@GetMapping("/publications/{id}")
	public Publication getById(@PathVariable int id){
		return publicationManager.getById(id);
	}
	
	@PostMapping("/add")
	public void add(@RequestBody Publication publication) {
		publicationManager.add(publication);
	}
	
	@PutMapping("/update")
	public void update(@RequestBody Publication publication) {
		publicationManager.update(publication);
	}
	
	@DeleteMapping("/delete")
	public void delete(@RequestBody Publication publication) {
		publicationManager.delete(publication);
	}
	

}
