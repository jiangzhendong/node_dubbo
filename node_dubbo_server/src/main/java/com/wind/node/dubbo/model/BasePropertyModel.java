package com.wind.node.dubbo.model;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * Created by IntelliJ IDEA.
 * User: hacker
 * Date: 5/30/16
 * Time: 3:03 PM
 * To change this template use File | Settings | File Templates.
 */
@Data
public class BasePropertyModel implements Serializable {
    static final long serialVersionUID = 20160530150458777L;
    long id;
    Date creatDate;
    Date modifyDate;

}
