package com.ncc.manageemployee.controller;

import com.ncc.manageemployee.model.Employee;
import com.ncc.manageemployee.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class TestController {

    @Autowired
    private EmployeeService employeeService;

    @PostMapping
    public ResponseEntity<Employee> creatNewEmployee (@RequestBody Employee employee){
        return new ResponseEntity<>(employeeService.save(employee), HttpStatus.OK);
    }

    @GetMapping("/employees")
    public List<Employee> getEmployee() {
        return employeeService.getAllEmployee();
    }

    @DeleteMapping("/delete/{id}")
    public List<Employee> deleteEmployeeId(@PathVariable("id") Integer id){
        employeeService.delete(id);
        return employeeService.getAllEmployee();
    }
}
