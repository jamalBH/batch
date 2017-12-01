package me.jamaltech.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="User")
public class User {
	@Id
	@GeneratedValue(strategy= GenerationType.AUTO)
	private int id;
	@Column(name="LASTNAME")
	private String lastname;
	@Column(name="FIRSTNAME")
	private String firstname;
	@Column(name="CIVILITE")
	private String civilite;
	
	
	public User() {
		super();
	}
	public User(int id, String lastname, String firstname, String civilite) {
		super();
		this.id = id;
		this.lastname = lastname;
		this.firstname = firstname;
		this.civilite = civilite;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getCivilite() {
		return civilite;
	}
	public void setCivilite(String civilite) {
		this.civilite = civilite;
	}
	
	
	
	
}
