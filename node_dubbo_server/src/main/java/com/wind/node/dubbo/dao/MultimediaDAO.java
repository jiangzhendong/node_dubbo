package com.wind.node.dubbo.dao;

import com.wind.node.dubbo.model.Multimedia;

import java.io.Serializable;
import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * User: hacker
 * Date: 5/30/16
 * Time: 2:50 PM
 * To change this template use File | Settings | File Templates.
 */
public interface MultimediaDAO extends BaseDAO<Multimedia,Long> {

    /**
     * 根据类型查看
     * @param multimedia
     * @return
     */
    public List<Multimedia> getMultimediaByType(Multimedia multimedia);

    /**
     * 排序查看
     * @param multimedia
     * @return
     */
    public List<Multimedia> getMultimediaOrderBy(Multimedia multimedia);

    public List<Multimedia> getMultimediaByFileName(Multimedia multimedia);

}
