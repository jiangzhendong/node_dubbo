package com.wind.node.dubbo.service.impl;

import java.util.ArrayList;
import java.util.List;

import com.wind.node.dubbo.dao.PersonDAO;
import com.wind.node.dubbo.model.Person;
import com.wind.node.dubbo.service.PersonService;
import com.wind.node.dubbo.utils.ExecuteResult;
import lombok.Getter;
import lombok.Setter;

public class PersonServiceImpl implements PersonService {

//	List<Person> listPerson = new ArrayList<Person>();

    @Getter
    @Setter
    private PersonDAO personDAO;

    public ExecuteResult<Person> save(Person person) {
        ExecuteResult<Person> result = new ExecuteResult<Person>();
        personDAO.save(person);
        return result;
    }

    public Person getById(long id) {
//		return new Person(123L,"","",false,"","","","");
        return personDAO.get(id);
    }

    public List<Person> findAll() {
        return personDAO.getAll();
    }

    public ExecuteResult<Person> deleteById(long id) {
        ExecuteResult<Person> result = new ExecuteResult<Person>();
        System.out.println("删除" + id);
        return result;
    }

}
