package com.halis.libraryRestAPI.Entities;

import javax.persistence.*;


@Entity
@Table(name="employee")
public class Employee {
	
	@Id
	@Column(name="id")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	
	@Column(name="name")
	private String name;
	
	@Column(name="surname")
	private String surname;
	
	@Column(name="birth_day")
	private String birth_day;
	
	@Column(name="email")
	private String email;
	
	@Column(name="id_number")
	private String id_number;
	
	@Column(name="phone")
	private String phone;
	
	public Employee(int id, String name, String surname, String birth_day, String email, String id_number,
			String phone) {
		this.id = id;
		this.name = name;
		this.surname = surname;
		this.birth_day = birth_day;
		this.email = email;
		this.id_number = id_number;
		this.phone = phone;
	}

	public Employee() {}

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

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public String getBirth_day() {
		return birth_day;
	}

	public void setBirth_day(String birth_day) {
		this.birth_day = birth_day;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getId_number() {
		return id_number;
	}

	public void setId_number(String id_number) {
		this.id_number = id_number;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}
	
}
