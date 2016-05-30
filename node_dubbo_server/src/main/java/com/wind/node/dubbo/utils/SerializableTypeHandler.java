package com.wind.node.dubbo.utils;

/**
 * Created by IntelliJ IDEA.
 * User: hacker
 * Date: 5/30/16
 * Time: 2:52 PM
 * To change this template use File | Settings | File Templates.
 */
import java.io.Serializable;
import java.sql.CallableStatement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import org.apache.ibatis.type.BaseTypeHandler;
import org.apache.ibatis.type.JdbcType;

public class SerializableTypeHandler extends BaseTypeHandler<Serializable> {
    public SerializableTypeHandler() {
    }

    public void setNonNullParameter(PreparedStatement ps, int i, Serializable parameter, JdbcType jdbcType) throws SQLException {
        ps.setObject(i, parameter);
    }

    public Serializable getNullableResult(ResultSet rs, String columnName) throws SQLException {
        return (Serializable)rs.getObject(columnName);
    }

    public Serializable getNullableResult(ResultSet rs, int columnIndex) throws SQLException {
        return (Serializable)rs.getObject(columnIndex);
    }

    public Serializable getNullableResult(CallableStatement cs, int columnIndex) throws SQLException {
        return (Serializable)cs.getObject(columnIndex);
    }
}
