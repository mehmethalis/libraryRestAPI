package com.halis.libraryRestAPI.Business;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.halis.libraryRestAPI.DataAccess.IPublicationDal;
import com.halis.libraryRestAPI.Entities.Publication;

@Service
public class PublicationManager implements IPublicationService{
	
	private IPublicationDal publicationDal;
	
	@Autowired
	public PublicationManager(IPublicationDal publicationDal) {
		this.publicationDal = publicationDal;
	}

	@Override
	@Transactional
	public List<Publication> GetAll() {
		return publicationDal.GetAll();
	}

	@Override
	@Transactional
	public void add(Publication publication) {
		publicationDal.add(publication);		
	}

	@Override
	@Transactional
	public void update(Publication publication) {
		publicationDal.update(publication);		
	}

	@Override
	@Transactional
	public void delete(Publication publication) {
		publicationDal.delete(publication);		
	}

	@Override
	@Transactional
	public Publication getById(int id) {
		return publicationDal.getById(id);
	}

}
