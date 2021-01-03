package com.vaibhavi.Model;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Transient;

@Entity
@Table(name = "Temp_table")
@NamedQuery(name="Temp.findUsingAnnotatinNamedQuery", query = "Select t From Temp t where id=:id")
// Table name will not be same as 
public class Temp {
  
	@Id
	private Integer id;
	
	@Column(name="Column_user_defined_name")
	private String name;
	
	@Transient
	// column not persisted in Database
	private String tempCode;
	
	public Temp(Integer id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	public Temp() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
}
