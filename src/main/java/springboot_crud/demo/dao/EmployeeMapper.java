package springboot_crud.demo.dao;

import org.apache.ibatis.annotations.Mapper;
import springboot_crud.demo.beans.Employee;

import java.util.List;

/**
 * @description:
 * @author: Tensh
 * @createDate: 2021/3/11
 */
@Mapper
public interface EmployeeMapper {
    List<Employee> selectAllEmps();
}
