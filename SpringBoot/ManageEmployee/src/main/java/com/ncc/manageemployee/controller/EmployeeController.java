package com.ncc.manageemployee.controller;

import com.ncc.manageemployee.model.Employee;
import com.ncc.manageemployee.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.Banner;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class EmployeeController {
    @Autowired
    private EmployeeService employeeService;
//    @RequestMapping(method = RequestMethod.GET, value = "/employees")
//    public String showAllEmployee(Model m){
//        List<Employee> listEm = employeeService.getAllEmployee();
//        m.addAttribute("listEmployee",listEm);
//        return "index";
//    }
    //Lấy dữ liệu của employee mới nên dùng GetMapping
    @GetMapping("/create")
    public String createNewEmployee(Model m){
        Employee employee = new Employee();
        m.addAttribute("employee",employee);
        return "create";
    }

    @PostMapping("/post")
    public String postNewEmployee(@ModelAttribute("employee") Employee employee ){
        employeeService.save(employee);
        return "redirect:/";
    }

//    @GetMapping("/delete/{id}")
//    public String deleteEmployee(@PathVariable("id") Integer id){
//        employeeService.delete(id);
//        return "redirect:/";
//    }
}
