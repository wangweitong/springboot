package com.controller;

import com.Employee;
import com.dao.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/employee")
public class EmployeeController {
    @Autowired
    private EmployeeRepository employeeRepository;


    @RequestMapping("queryAll")
    @ResponseBody
    public String queryAll(){
        List<Employee> list = new ArrayList<Employee>();
        list = employeeRepository.findAll();
        return list.toArray().toString();
    }

}