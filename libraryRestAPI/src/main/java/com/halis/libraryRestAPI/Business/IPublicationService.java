package com.halis.libraryRestAPI.Business;

import java.util.List;

import com.halis.libraryRestAPI.Entities.Publication;

public interface IPublicationService {

	List<Publication> GetAll();
	
	void add(Publication publication);
	
	void update(Publication publication);

	void delete(Publication publication);
	
	Publication getById(int id);
}
