package com.halis.libraryRestAPI.Entities;

import javax.persistence.*;

@Entity
@Table(name="book")
public class Book {
	
	@Id
	@Column(name="id")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	
	@Column(name="name")
	private String name;
	
	@Column(name="lastName")
	private String lastName;
	
	@Column(name="authorId")
	private int authorId;
	
	@Column(name="categoryId")
	private int categoryId;
	
	@Column(name="isbn")
	private String isbn;
	
	@Column(name="isShelf")
	private boolean isShelf;
	
	@Column(name="locationNumber")
	private String locationNumber;
	
	@Column(name="publicationId")
	private int publicationId;
	
	@Column(name="whoHasId")
	private int whoHasId;
	
	@Column(name="yearPrinting")
	private int yearPrinting;


	public Book(String name, String lastName, int authorId, int categoryId, String isbn, boolean isShelf,
			String locationNumber, int publicationId, int whoHasId, int yearPrinting,int id) {
		this.name = name;
		this.lastName = lastName;
		this.authorId = authorId;
		this.categoryId = categoryId;
		this.isbn = isbn;
		this.isShelf = isShelf;
		this.locationNumber = locationNumber;
		this.publicationId = publicationId;
		this.whoHasId = whoHasId;
		this.yearPrinting = yearPrinting;
		this.id=id;
	}
	
	public Book() {}

	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public int getAuthorId() {
		return authorId;
	}

	public void setAuthorId(int authorId) {
		this.authorId = authorId;
	}

	public int getCategoryId() {
		return categoryId;
	}

	public void setCategoryId(int categoryId) {
		this.categoryId = categoryId;
	}

	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	public boolean isShelf() {
		return isShelf;
	}

	public void setShelf(boolean isShelf) {
		this.isShelf = isShelf;
	}

	public String getLocationNumber() {
		return locationNumber;
	}

	public void setLocationNumber(String locationNumber) {
		this.locationNumber = locationNumber;
	}

	public int getPublicationId() {
		return publicationId;
	}

	public void setPublicationId(int publicationId) {
		this.publicationId = publicationId;
	}

	public int getWhoHasId() {
		return whoHasId;
	}

	public void setWhoHasId(int whoHasId) {
		this.whoHasId = whoHasId;
	}

	public int getYearPrinting() {
		return yearPrinting;
	}

	public void setYearPrinting(int yearPrinting) {
		this.yearPrinting = yearPrinting;
	}

	
}
