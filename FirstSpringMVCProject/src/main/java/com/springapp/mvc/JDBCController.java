//package com.springapp.mvc;
//
//import dao.EmployeeDao;
//import model.Employee;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestMethod;
//import org.springframework.web.servlet.ModelAndView;
//
//import javax.servlet.http.HttpServletRequest;
//import javax.servlet.http.HttpServletResponse;
//
///**
//* Created by user on 2014/12/03.
//*/
//public class JDBCController {
//    @Autowired
//    Employee employee;
//    EmployeeDao employeeDao;
//
//    @RequestMapping(value = "/insert",method = RequestMethod.GET)
//    public ModelAndView insert() {
//
//        ModelAndView model = new ModelAndView("insert");
//        return model;
//
//    }
//
//    @RequestMapping("/success")
//    public ModelAndView insertEmployee(HttpServletRequest request, HttpServletResponse response){
//
//        String id= request.getParameter("id");
//        String name = request.getParameter("name");
//        String salary = request.getParameter("salary");
//
//
//        employee.setId(Integer.parseInt(id));
//        employee.setName(name);
//        employee.setSalary(Float.parseFloat(salary));
//
//
//        employeeDao.saveEmployee(employee);
//        return new ModelAndView("success","message","insertion successful! congrats :)");
//    }
//}
