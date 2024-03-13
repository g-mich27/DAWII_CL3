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

import com.cibertec.DAWIl_EF_YucraMamaniGerbertMichell.Model.Status;
import com.cibertec.DAWIl_EF_YucraMamaniGerbertMichell.Service.StatusService;

@CrossOrigin(origins = "*", allowedHeaders = "*")
@RestController
@RequestMapping("/api/status")
public class StatusController {

	@Autowired
	private StatusService statusServi;
	
	 @GetMapping
	public List<Status> findAll() {
        return statusServi.findAll();
    }

    @GetMapping("/{id}")
    public Status findById(@PathVariable("id") int id) {
        return statusServi.findById(id);
    }

    @GetMapping(params = "name")
    public List<Status> findByName(@RequestParam("name") String name) {
        return statusServi.findByName(name);
    }

    @PostMapping
    public Status save(@RequestBody Status status) {
        return statusServi.save(status);
    }

    @PutMapping("/{id}")
    public Status update(@PathVariable("id") int id, @RequestBody Status status) {
    	status.setStatusId(id);
        return statusServi.save(status);
    }

    @DeleteMapping("/{id}")
    public void deleteById(@PathVariable("id") int id) {
    	statusServi.deleteById(id);
    }

    @DeleteMapping
    public void deleteAll() {
    	statusServi.deleteAll();
    }
}
