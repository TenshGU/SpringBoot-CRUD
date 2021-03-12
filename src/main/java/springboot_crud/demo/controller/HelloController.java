package springboot_crud.demo.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import springboot_crud.demo.beans.Employee;
import springboot_crud.demo.service.EmpService;

import java.util.ArrayList;
import java.util.List;

/**
 * @description:
 * @author: Tensh
 * @createDate: 2021/3/11
 */
@Controller
public class HelloController {

    @Autowired
    EmpService empService;

    @GetMapping("/list/{pn}")
    public String listEmps(@PathVariable("pn") int pn, Model model) {
        PageHelper.startPage(pn,5);
        List<Employee> list = empService.getAllEmps();
        PageInfo<Employee> pageInfo = new PageInfo<>(list,5);
        model.addAttribute("pageInfo",pageInfo);
        return "list";
    }
}
