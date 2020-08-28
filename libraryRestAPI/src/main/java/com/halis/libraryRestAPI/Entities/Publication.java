package com.halis.libraryRestAPI.Entities;

import javax.persistence.*;

@Entity
@Table(name="publication")
public class Publication {
	
	@Id
	@Column(name="id")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	
	@Column(name="name")
	private String name;
	

	public Publication(int id, String name) {
		
		this.id = id;
		this.name = name;
	}
	
	public Publication() {}

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

}
