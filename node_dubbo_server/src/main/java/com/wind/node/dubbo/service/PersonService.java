package com.wind.node.dubbo.service;

import java.util.List;

import com.wind.node.dubbo.model.Person;
import com.wind.node.dubbo.utils.ExecuteResult;

public interface PersonService {

	public ExecuteResult<Person> save(Person person);
	
	Person getById(long id);
	
	List<Person> findAll();

	public ExecuteResult<Person>  deleteById(long id);
}
