package com.surishti.FoodApp.service;

import com.surishti.FoodApp.model.Employee;
import com.surishti.FoodApp.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EmployeeServices {
    @Autowired
    EmployeeRepository employeeRepository;
    //insert
    public Employee insertEmployee(Employee emp)
    {
        return employeeRepository.save(emp);
    }
    public List<Employee> insertAll(List<Employee>employees){
        return employeeRepository.saveAll(employees);
    }
    //get All employee
    public List<Employee> getAllEmployee()
    {
        return employeeRepository.findAll();
    }
    //get Employee by Id
    public Optional<Employee> getById(Long empId){
        return employeeRepository.findById(empId);
    }
    //delete Employee
    public void deleteEmployeeById(Long empId){
        employeeRepository.deleteById(empId);
    }
}
