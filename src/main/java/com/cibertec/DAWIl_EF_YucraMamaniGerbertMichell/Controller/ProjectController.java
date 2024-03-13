package com.cibertec.DAWIl_EF_YucraMamaniGerbertMichell.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.cibertec.DAWIl_EF_YucraMamaniGerbertMichell.Model.Project;
import com.cibertec.DAWIl_EF_YucraMamaniGerbertMichell.Service.ProjectService;

@CrossOrigin(origins = "*", allowedHeaders = "*")
@RestController
@RequestMapping("/api/project")
public class ProjectController {

	@Autowired
	private ProjectService projectServi;
	
	 @GetMapping
	public List<Project> findAll() {
        return projectServi.findAll();
    }

    @GetMapping("/{id}")
    public Project findById(@PathVariable("id") int id) {
        return projectServi.findById(id);
    }

    @GetMapping(params = "name")
    public List<Project> findByName(@RequestParam("name") String name) {
        return projectServi.findByName(name);
    }

    @PostMapping
    public Project save(@RequestBody Project project) {
        return projectServi.save(project);
    }

    @PutMapping("/{id}")
    public Project update(@PathVariable("id") int id, @RequestBody Project project) {
    	project.setProjectId(id);
        return projectServi.save(project);
    }

    @DeleteMapping("/{id}")
    public void deleteById(@PathVariable("id") int id) {
    	projectServi.deleteById(id);
    }

    @DeleteMapping
    public void deleteAll() {
    	projectServi.deleteAll();
    }
}
