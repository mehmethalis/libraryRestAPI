package com.halis.libraryRestAPI.DataAccess;

import java.util.List;

import com.halis.libraryRestAPI.Entities.Publication;

public interface IPublicationDal {

	List<Publication> GetAll();
	
	void add(Publication publication);
	
	void update(Publication publication);

	void delete(Publication publication);
	
	Publication getById(int id);
}
