package com.vaibhavi.Model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import com.fasterxml.jackson.annotation.JsonBackReference;

@Entity
public class Posts {
	
	@Id
	private Integer id;
	private Date postDate;
	
	@ManyToOne
	private Users user;
	private String Details;
	public Posts(Integer id, Date postDate, Users user, String details) {
		super();
		this.id = id;
		this.postDate = postDate;
		this.user = user;
		Details = details;
	}
	public Posts() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Date getPostDate() {
		return postDate;
	}
	public void setPostDate(Date postDate) {
		this.postDate = postDate;
	}
	
	@JsonBackReference
	public Users getUser() {
		return user;
	}
	public void setUser(Users user) {
		this.user = user;
	}
	public String getDetails() {
		return Details;
	}
	public void setDetails(String details) {
		Details = details;
	}
	
	
	
}
