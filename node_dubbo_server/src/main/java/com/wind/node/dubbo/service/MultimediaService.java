package com.wind.node.dubbo.service;

import com.wind.node.dubbo.model.Multimedia;
import com.wind.node.dubbo.utils.ExecuteResult;

import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * User: hacker
 * Date: 5/28/16
 * Time: 10:27 AM
 * To change this template use File | Settings | File Templates.
 */
public interface MultimediaService {

    public List<Multimedia> getAll();

    public List<Multimedia> getMultimediaByType(Multimedia multimedia);

    public List<Multimedia> getMultimediaByFileName(Multimedia multimedia);

    public List<Multimedia> getMultimediaOrderBy(Multimedia multimedia);

    public ExecuteResult<Multimedia> creatMultimedia(Multimedia multimedia);

    public ExecuteResult<Multimedia> deleteMultimedia(Long id);

    public ExecuteResult<Multimedia> updateMultimedia(Multimedia multimedia);


}
