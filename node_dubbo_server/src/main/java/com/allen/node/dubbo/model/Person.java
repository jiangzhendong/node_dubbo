package com.allen.node.dubbo.model;

import lombok.Data;

import java.io.Serializable;

@Data
public class Person implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private Long id;
	private String name;
	private String address;
	private boolean gender;
	private String phone;
	
	public Person(){
		
	}
	
	
	public Person(Long id, String name, String address, boolean gender,String phone) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;
		this.gender = gender;
		this.phone = phone;
	}

	
}
