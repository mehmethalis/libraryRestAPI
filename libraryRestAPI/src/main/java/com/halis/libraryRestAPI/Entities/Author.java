package com.halis.libraryRestAPI.Entities;

import javax.persistence.*;

@Entity
@Table(name="author")
public class Author {
	
	@Id
	@Column(name="id")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	
	
	@Column(name="surname")
	private String surname;
	
	@Column(name="name")
	private String name;
	
	
	

	public Author(int id, String name, String surname) {
		this.id = id;
		this.name = name;
		this.surname = surname;
	}
	
	public Author() {}

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
		return surname;
	}

	public void setLastName(String surname) {
		this.surname = surname;
	}
	

}
