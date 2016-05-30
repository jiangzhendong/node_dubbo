package com.wind.node.dubbo.dao;

import java.io.Serializable;
import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * User: hacker
 * Date: 5/30/16
 * Time: 3:26 PM
 * To change this template use File | Settings | File Templates.
 */
public interface BaseDAO<T, PK extends Serializable> {
    void save(T var1);

    void update(T var1);

    T get(PK var1);

    T load(PK var1);

    void delete(T var1);

    List<T> getAll();

    void delete(PK var1);

    T findUniqueBy(String var1, Object var2);

}