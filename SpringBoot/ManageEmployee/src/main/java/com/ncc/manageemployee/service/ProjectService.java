package com.ncc.manageemployee.service;

import com.ncc.manageemployee.model.Employee;
import com.ncc.manageemployee.model.Project;
import com.ncc.manageemployee.repository.EmployeeRepository;
import com.ncc.manageemployee.repository.ProjectRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProjectService {
    @Autowired
    private ProjectRepo projectRepo;
    public List<Project> getAllProject(){
        return projectRepo.findAll();
    }

    //muốn tạo mới thì cần có một method để lưu vào database
    public Project save(Project project){
        return projectRepo.save(project);
    }

    public void delete(Integer id){
        projectRepo.deleteById(id);
    }
}

