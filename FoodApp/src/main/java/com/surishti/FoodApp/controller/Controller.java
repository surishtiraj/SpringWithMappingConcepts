package com.surishti.FoodApp.controller;

import com.surishti.FoodApp.model.Employee;
import com.surishti.FoodApp.service.EmployeeServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/foodApp")
public class Controller {
    @Autowired
    EmployeeServices employeeServices;
    @PostMapping("/employee")
    public Employee insertEmployee(@RequestBody Employee employee)
    {
        return employeeServices.insertEmployee(employee);
    }
    @GetMapping("/employee")
    public List<Employee> getAllEmployee(){
        return employeeServices.getAllEmployee();
    }
    @GetMapping("/employee/{empid}")
    public Optional<Employee> getByid(@PathVariable("empid") Long empId){
        return employeeServices.getById(empId);
    }
    @PutMapping("/employee")
    public Employee update(@RequestBody Employee employee){
        return employeeServices.insertEmployee(employee);
    }
    @PostMapping("/employee/list")
    public List<Employee>insertList(@RequestBody List<Employee> employees){
        return employeeServices.insertAll(employees);
    }
}
