package com.halis.libraryRestAPI.Entities;

import javax.persistence.*;

@Entity
@Table(name="author")
public class Author {
	
	@Id
	@Column(name="id")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	
	@Column(name="name")
	private String name;
	
	@Column(name="lastName")
	private String lastName;
	

	public Author(int id, String name, String lastName) {
		super();
		this.id = id;
		this.name = name;
		this.lastName = lastName;
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
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	

}
