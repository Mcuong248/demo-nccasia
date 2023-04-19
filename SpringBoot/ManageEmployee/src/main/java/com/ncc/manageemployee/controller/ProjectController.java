package com.ncc.manageemployee.controller;

import com.ncc.manageemployee.model.Project;
import com.ncc.manageemployee.service.ProjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/project")
public class ProjectController {
    @Autowired
    private ProjectService projectService;

    @PostMapping
    public ResponseEntity<Project> creatNewProject (@RequestBody Project project){
        return new ResponseEntity<>(projectService.save(project), HttpStatus.OK);
    }

    @GetMapping("/projects")
    public List<Project> getProject() {
        return projectService.getAllProject();
    }

    @DeleteMapping("/delete/{id}")
    public List<Project> deleteProjectId(@PathVariable("id") Integer id){
        projectService.delete(id);
        return projectService.getAllProject();
    }
}
