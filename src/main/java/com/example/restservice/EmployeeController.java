package com.example.restservice;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
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

//    @GetMapping("emp/{id}")
//    public Employee employeeVariable(@PathVariable("id") int employee_id){
//        return new Employee(employee_id,"pooja", "mandal");
//    }

//    @GetMapping("emp/{id}")
//    public Employee employeeVariable(@PathVariable int id){
//        return new Employee(id,"pooja", "mandal");
//  }
    //Spring Boot API with PathVariable
    //http://localhost:8080/emp/2/poo/mand
    @GetMapping("emp/{id}/{firstname}/{lastname}")
    public Employee employeeVariable(@PathVariable("id") int employee_id, @PathVariable("firstname") String first_name, @PathVariable("lastname") String last_name){
        return new Employee(employee_id,first_name,last_name);

    }
    //Spring Boot API with RequestParam
    //http://localhost:8080/emp/query?id=1&firstname=poo&lastname=man
    @GetMapping("emp/query")
    public Employee employeeRequest(@RequestParam int id, @RequestParam String firstname, String lastname){
        return new Employee(id,firstname, lastname);

    }
}
