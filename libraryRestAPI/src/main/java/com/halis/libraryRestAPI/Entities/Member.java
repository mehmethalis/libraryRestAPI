package com.halis.libraryRestAPI.Entities;

import javax.persistence.*;

@Entity
@Table(name="member")
public class Member {
	
	@Id
	@Column(name="id")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	
	@Column(name="name")
	private String name;
	
	@Column(name="lastName")
	private String lastName;
	
	@Column(name="birthDay")
	private String birthDay;
	
	@Column(name="dateMembership")
	private String dateMembership;
	
	@Column(name="email")
	private String email;
	
	@Column(name="idNumber")
	private String idNumber;
	
	@Column(name="phone")
	private String phone;
	
	

	public Member(int id, String name, String lastName, String birthDay, String dateMembership, String email,
			String idNumber, String phone) {
		this.id = id;
		this.name = name;
		this.lastName = lastName;
		this.birthDay = birthDay;
		this.dateMembership = dateMembership;
		this.email = email;
		this.idNumber = idNumber;
		this.phone = phone;
	}
	
	public Member() {}

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

	public String getBirthDay() {
		return birthDay;
	}

	public void setBirthDay(String birthDay) {
		this.birthDay = birthDay;
	}

	public String getDateMembership() {
		return dateMembership;
	}

	public void setDateMembership(String dateMembership) {
		this.dateMembership = dateMembership;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getIdNumber() {
		return idNumber;
	}

	public void setIdNumber(String idNumber) {
		this.idNumber = idNumber;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}
	

}
