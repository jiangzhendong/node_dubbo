package com.allen.node.dubbo.service.impl;

import java.util.ArrayList;
import java.util.List;

import com.allen.node.dubbo.model.Person;
import com.allen.node.dubbo.service.PersonService;

public class PersonServiceImpl implements PersonService {

	List<Person> listPerson = new ArrayList<Person>();
	
	public void save(Person person) {
		// TODO Auto-generated method stub
		System.out.println("��ӳɹ�!");
		listPerson.add(person);
		
	}

	public Person getById(long id) {
		// TODO Auto-generated method stub
		return new Person(123L,"","�Ϻ�",false,"");
	}

	public List<Person> findAll() {
		// TODO Auto-generated method stub
		return listPerson;
	}

	public String deleteById(long id) {
		// TODO Auto-generated method stub
		System.out.println("ɾ��һ���ˣ�"+id);
		return "ɾ��һ��";
	}

}
