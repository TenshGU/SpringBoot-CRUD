package springboot_crud.demo.dao;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import springboot_crud.demo.beans.Employee;

import java.util.List;

@SpringBootTest
public class EmployeeMapperTest {
    @Autowired
    EmployeeMapper employeeMapper;

    @Test
    void testSelectAllEmps() {
        List<Employee> list = employeeMapper.selectAllEmps();
        System.out.println(list);
    }
}
