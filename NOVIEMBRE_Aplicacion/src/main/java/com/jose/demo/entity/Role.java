package com.jose.demo.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.hibernate.annotations.GenericGenerator;

@Entity  // para que hibernate sepa que esto va a ser un entity
public class Role implements Serializable {

	private static final long serialVersionUID = -2969524610059270447L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO, generator="native")
	@GenericGenerator(name="native",strategy="native")   //autoincremento de mysql
	private Long id;
	
	@Column
	private String name;
	
	@Column
	private String description;
	       //Getters, Setters, HashCode, Equals & ToString Functions

	public Long getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public String getDescription() {
		return description;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setDescription(String description) {
		this.description = description;
	}
	
	
	
}