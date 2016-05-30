package com.wind.node.dubbo.dao;

import com.wind.node.dubbo.model.Person;

import java.io.Serializable;

/**
 * Created by IntelliJ IDEA.
 * User: hacker
 * Date: 5/30/16
 * Time: 2:42 PM
 * To change this template use File | Settings | File Templates.
 */
public interface PersonDAO extends BaseDAO<Person,Long> {

    //用于登录验证
    public String getPasswordByName(String userName);
}
