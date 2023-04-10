package com.example.restservice;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

//package com.example.demo;


@RestController
public class EmployeeController {
    @GetMapping("/employee")
    public String getAllEmployee() {

        return "HELLO";
    }
    @GetMapping("emp")
    public List<Employee> getAllEmployees() {
        List<Employee> emp = new ArrayList<>();
        emp.add(new Employee(1,"pooja","mandal"));
        emp.add(new Employee(2,"kajal","das"));
        emp.add(new Employee(3,"BAad","poks"));
        return emp;
    }

    @GetMapping("emp/id")

    public Employee employeeVariable(int employee_id){
        return new Employee(employee_id,"pooja", "mandal");
    }
}
