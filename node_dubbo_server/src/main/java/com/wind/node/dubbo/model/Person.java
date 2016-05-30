package com.wind.node.dubbo.model;

import lombok.Data;

import java.util.Date;

@Data
public class Person extends BasePropertyModel {

    private String userName;
    private String password;
    private String address;
    private boolean gender; //性别
    private String phone;
    private String eMail;
    private Date loginDate;
    private String loginIp;

    public Person() {

    }


    public Person(Long id, String userName, String password, String address,
                  boolean gender, String phone, String eMail, Date loginDate, String loginIp) {
        super();
        this.id = id;
        this.userName = userName;
        this.address = address;
        this.gender = gender;
        this.phone = phone;
        this.password = password;
        this.eMail = eMail;
        this.loginDate = loginDate;
        this.loginIp = loginIp;
    }


}
