package springboot_crud.demo.dao;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import springboot_crud.demo.beans.Department;

/**
 * @description:
 * @author: Tensh
 * @createDate: 2021/3/11
 */
@SpringBootTest
public class DepartmentMapperTest {
    @Autowired
    DepartmentMapper departmentMapper;

    @Test
    void testGetDeptById() {
        Department department = departmentMapper.getDeptById(1);
        System.out.println(department);
    }
}
