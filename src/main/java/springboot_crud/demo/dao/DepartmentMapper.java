package springboot_crud.demo.dao;

import org.apache.ibatis.annotations.Mapper;
import springboot_crud.demo.beans.Department;

@Mapper
public interface DepartmentMapper {
    Department getDeptById(Integer id);
}
