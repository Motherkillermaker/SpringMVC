package com.atguigu.mvc;

import bean.Employee;
import dao.EmployeeDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.Collection;

/**
 * @author CJYong
 * @create 2021-08-19 19:56
 */
@Controller
public class EmployeeController {

    @Autowired
    private EmployeeDao employeeDao;

    //查看所有员工信息
    @RequestMapping( value = "/employee", method = RequestMethod.GET)
    public String getAllEmployee(Model model){
        //获取所有员工信息
        Collection<Employee> employeesList = employeeDao.getAll();
        //将信息放入请求域中，发送给客户端(域对象共享数据)
        model.addAttribute("employeesList", employeesList);
        System.out.println(model.getAttribute("employeesList"));
        return "employees";
    }

    //删除员工信息
    @RequestMapping(value = "/employee/{id}", method = RequestMethod.DELETE)
    public String deleteEmployee(@PathVariable("id") Integer id){
        employeeDao.delete(id);
        return "redirect:/employee";
    }

    //添加员工信息
    @RequestMapping(value = "/employee", method = RequestMethod.POST)
    //使用实体类获取请求参数会自动填充属性（要求属性名和请求参数名保持一致）
    public String addEmployee(Employee employee){
        employeeDao.save(employee);
        return "redirect:/employee";
    }

    //根据id查询员工信息用于回显（先回显，在修改）
    @RequestMapping(value = "/employee/{id}", method = RequestMethod.GET)
    public String getEmployeeById(@PathVariable("id") Integer id, Model model){
        Employee employee = employeeDao.get(id);
        model.addAttribute("employee", employee);
        return "employee_update";
    }

    //修改员工信息
    @RequestMapping(value = "/employee", method = RequestMethod.PUT)
    public String updateEmployee(Employee employee){
        employeeDao.save(employee);
        return "redirect:/employee";
    }




}
