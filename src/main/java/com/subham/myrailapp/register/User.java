package com.subham.myrailapp.register;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.NotEmpty;
import org.springframework.data.annotation.Transient;

@Entity
@Table(name = "user")
public class User {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id")
	private Long id;
	
	
	@Column(name = "firstname")
	@NotEmpty(message = "Please Provide your First Name")
	private String firstname;
	
	
	@Column(name = "lastname")
	@NotEmpty(message = "Please Provide your Last Name")
	private String lastname;
	
	@Column(name = "email", nullable = false , unique = true)
	@Email(message = "Please Provide a Valid email")
	@NotEmpty(message = "Please Provide an email")
	private String email;
	
	@Column(name = "password")
	@Transient
	private String password;
	
	@Column(name = "enabled")
	private boolean enabled;
	
	@Column(name = "confirmation-token")
	private String confirmationToken;
	
	public String getConfirmationToken(){
		return  confirmationToken;
	}
	
	public void setConfirmationToken(String confirmationToken){
		this.confirmationToken = confirmationToken;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
}
