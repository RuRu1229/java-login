package com.example.Web;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;



@Entity
@Table(name="Web")
public class Web {
	
	@Id
	private String username;
//	@Id
	private String password;
	
	public Web() {
		
	}
	public Web(String username,String password) {
		//super();
		this.username=username;
		this.password=password;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username=username;
	}
	
	public String getPassword() {
		return  password;
	}
	public void setPassword(String password) {
		this.password=password;
	}
	

}
