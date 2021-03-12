package springboot_crud.demo.handler;

import org.apache.ibatis.type.JdbcType;
import org.apache.ibatis.type.MappedJdbcTypes;
import org.apache.ibatis.type.MappedTypes;
import org.apache.ibatis.type.TypeHandler;
import springboot_crud.demo.beans.SexEnum;

import java.sql.CallableStatement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * @description:
 * @author: Tensh
 * @createDate: 2021/3/11
 */
@MappedTypes(SexEnum.class)
@MappedJdbcTypes(JdbcType.CHAR)
public class SexEnumTypeHandler implements TypeHandler<SexEnum> {
    @Override
    public void setParameter(PreparedStatement preparedStatement, int i, SexEnum sexEnum, JdbcType jdbcType) throws SQLException {
        Integer num = sexEnum.getNum();
        if (num==1) {
            preparedStatement.setString(i,"M");
        } else {
            preparedStatement.setString(i,"F");
        }
    }

    @Override
    public SexEnum getResult(ResultSet resultSet, String s) throws SQLException {
         String str = resultSet.getString(s);
         if ("M".equals(str)) {
             return SexEnum.male;
         } else {
             return SexEnum.female;
         }
    }

    @Override
    public SexEnum getResult(ResultSet resultSet, int i) throws SQLException {
        String str = resultSet.getString(i);
        if ("M".equals(str)) {
            return SexEnum.male;
        } else {
            return SexEnum.female;
        }
    }

    @Override
    public SexEnum getResult(CallableStatement callableStatement, int i) throws SQLException {
        String str = callableStatement.getString(i);
        if ("M".equals(str)) {
            return SexEnum.male;
        } else {
            return SexEnum.female;
        }
    }
}
