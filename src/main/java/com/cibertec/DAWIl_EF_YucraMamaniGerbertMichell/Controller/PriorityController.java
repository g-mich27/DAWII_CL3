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

import com.cibertec.DAWIl_EF_YucraMamaniGerbertMichell.Model.Priority;
import com.cibertec.DAWIl_EF_YucraMamaniGerbertMichell.Service.PriorityService;

@CrossOrigin(origins = "*", allowedHeaders = "*")
@RestController
@RequestMapping("/api/priority")
public class PriorityController {

	@Autowired
	private PriorityService priorityServi;
	
	 @GetMapping
	public List<Priority> findAll() {
        return priorityServi.findAll();
    }

    @GetMapping("/{id}")
    public Priority findById(@PathVariable("id") int id) {
        return priorityServi.findById(id);
    }

    @GetMapping(params = "name")
    public List<Priority> findByName(@RequestParam("name") String name) {
        return priorityServi.findByName(name);
    }

    @PostMapping
    public Priority save(@RequestBody Priority priority) {
        return priorityServi.save(priority);
    }

    @PutMapping("/{id}")
    public Priority update(@PathVariable("id") int id, @RequestBody Priority priority) {
    	priority.setPriorityId(id);
        return priorityServi.save(priority);
    }

    @DeleteMapping("/{id}")
    public void deleteById(@PathVariable("id") int id) {
    	priorityServi.deleteById(id);
    }

    @DeleteMapping
    public void deleteAll() {
    	priorityServi.deleteAll();
    }
}
