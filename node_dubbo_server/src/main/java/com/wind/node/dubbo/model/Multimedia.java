package com.wind.node.dubbo.model;

import lombok.Data;

/**
 * Created by IntelliJ IDEA.
 * User: hacker
 * Date: 5/28/16
 * Time: 10:26 AM
 * To change this template use File | Settings | File Templates.
 */
@Data
public class Multimedia extends BasePropertyModel {
    private String path;//路径
    private String fileName;//名字
    private String extensionName; //扩展名
    private String operator;//操作人
    private String type;  //类型保存
    private String order;//排序规则 无数据库字段
}
