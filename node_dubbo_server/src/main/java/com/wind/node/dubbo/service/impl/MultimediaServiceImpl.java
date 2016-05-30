package com.wind.node.dubbo.service.impl;

import com.wind.node.dubbo.dao.MultimediaDAO;
import com.wind.node.dubbo.model.Multimedia;
import com.wind.node.dubbo.service.MultimediaService;
import com.wind.node.dubbo.utils.ExecuteResult;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * User: hacker
 * Date: 5/28/16
 * Time: 10:28 AM
 * To change this template use File | Settings | File Templates.
 */
public class MultimediaServiceImpl implements MultimediaService {

    @Getter
    @Setter
    private MultimediaDAO multimediaDAO;

    public List<Multimedia> getAll() {
        return multimediaDAO.getAll();
    }

    public List<Multimedia> getMultimediaByType(Multimedia multimedia) {
        return multimediaDAO.getMultimediaByType(multimedia);
    }

    public List<Multimedia> getMultimediaByFileName(Multimedia multimedia) {
        return multimediaDAO.getMultimediaByFileName(multimedia);
    }

    public List<Multimedia> getMultimediaOrderBy(Multimedia multimedia) {
        return multimediaDAO.getMultimediaOrderBy(multimedia);
    }

    public ExecuteResult<Multimedia> creatMultimedia(Multimedia multimedia) {

        ExecuteResult<Multimedia> result = new ExecuteResult<Multimedia>();
        multimediaDAO.save(multimedia);
        return result;
    }

    public ExecuteResult<Multimedia> deleteMultimedia(Long id) {
        ExecuteResult<Multimedia> result = new ExecuteResult<Multimedia>();
        multimediaDAO.delete(id);
        return result;
    }


    public ExecuteResult<Multimedia> updateMultimedia(Multimedia multimedia) {
        ExecuteResult<Multimedia> result = new ExecuteResult<Multimedia>();
        multimediaDAO.update(multimedia);
        return result;
    }
}
