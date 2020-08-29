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
	
	@Column(name="author_id")
	private int author_id;
	
	@Column(name="category_id")
	private int category_id;
	
	@Column(name="isbn")
	private String isbn;
	
	@Column(name="is_shelf")
	private boolean is_shelf;
	
	@Column(name="location_number")
	private String location_number;
	
	@Column(name="publication_id")
	private int publication_id;
	
	@Column(name="whose_id")
	private int whose_id;
	
	@Column(name="year_printing")
	private int year_printing;

	public Book(int id, String name, int author_id, int category_id, String isbn, boolean is_shelf,
			String location_number, int publication_id, int whose_id, int year_printing) {
		this.id = id;
		this.name = name;
		this.author_id = author_id;
		this.category_id = category_id;
		this.isbn = isbn;
		this.is_shelf = is_shelf;
		this.location_number = location_number;
		this.publication_id = publication_id;
		this.whose_id = whose_id;
		this.year_printing = year_printing;
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

	public int getAuthor_id() {
		return author_id;
	}

	public void setAuthor_id(int author_id) {
		this.author_id = author_id;
	}

	public int getCategory_id() {
		return category_id;
	}

	public void setCategory_id(int category_id) {
		this.category_id = category_id;
	}

	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	public boolean isIs_shelf() {
		return is_shelf;
	}

	public void setIs_shelf(boolean is_shelf) {
		this.is_shelf = is_shelf;
	}

	public String getLocation_number() {
		return location_number;
	}

	public void setLocation_number(String location_number) {
		this.location_number = location_number;
	}

	public int getPublication_id() {
		return publication_id;
	}

	public void setPublication_id(int publication_id) {
		this.publication_id = publication_id;
	}

	public int getWhose_id() {
		return whose_id;
	}

	public void setWhose_id(int whose_id) {
		this.whose_id = whose_id;
	}

	public int getYear_printing() {
		return year_printing;
	}

	public void setYear_printing(int year_printing) {
		this.year_printing = year_printing;
	}
	
}
