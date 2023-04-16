package com.ncc.manageemployee.service;

import com.ncc.manageemployee.model.Employee;
import com.ncc.manageemployee.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EmployeeService {

    @Autowired
    private EmployeeRepository employeeRepository;


    public List<Employee> getAllEmployee(){
        return employeeRepository.findAll();
    }

    //muốn tạo mới thì cần có một method để lưu vào database
    public Employee save(Employee employee){
       return employeeRepository.save(employee);
    }

    public void delete(Integer id){
        employeeRepository.deleteById(id);
    }
}
