package springboot_crud.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import springboot_crud.demo.beans.Employee;
import springboot_crud.demo.dao.EmployeeMapper;

import java.util.List;

/**
 * @description:
 * @author: Tensh
 * @createDate: 2021/3/11
 */
@Service
public class EmpService {
    @Autowired
    EmployeeMapper employeeMapper;

    public List<Employee> getAllEmps() {
        return employeeMapper.selectAllEmps();
    }
}
