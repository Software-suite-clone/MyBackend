package com.example.usersmanagementsystem.entity;

import jakarta.persistence.*;

@Entity
@Table(name="joinclass")
public class JoinClass {
	 @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private Long id;
	 private String loginuser;
	 private String classCode;
	 private String email;
	 
	
	 
	 
	
	@Override
	public String toString() {
		return "JoinClass [id=" + id + ", loginuser=" + loginuser + ", classCode=" + classCode + ", email=" + email
				+ "]";
	}
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getLoginuser() {
		return loginuser;
	}
	public void setLoginuser(String loginuser) {
		this.loginuser = loginuser;
	}

	public String getClassCode() {
		return classCode;
	}
	public void setClassCode(String classCode) {
		this.classCode = classCode;
	}

	
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	 
	 
	 

}
