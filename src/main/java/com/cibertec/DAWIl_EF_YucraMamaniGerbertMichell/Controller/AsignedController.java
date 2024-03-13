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

import com.cibertec.DAWIl_EF_YucraMamaniGerbertMichell.Model.Asigned;
import com.cibertec.DAWIl_EF_YucraMamaniGerbertMichell.Service.AsignedService;

@CrossOrigin(origins = "*", allowedHeaders = "*")
@RestController
@RequestMapping("/api/asigned")
public class AsignedController {

	@Autowired
	private AsignedService asignedServi;
	
	 @GetMapping
	public List<Asigned> findAll() {
        return asignedServi.findAll();
    }

    @GetMapping("/{id}")
    public Asigned findById(@PathVariable("id") int id) {
        return asignedServi.findById(id);
    }

    @GetMapping(params = "name")
    public List<Asigned> findByName(@RequestParam("name") String name) {
        return asignedServi.findByName(name);
    }

    @PostMapping
    public Asigned save(@RequestBody Asigned asigned) {
        return asignedServi.save(asigned);
    }

    @PutMapping("/{id}")
    public Asigned update(@PathVariable("id") int id, @RequestBody Asigned asigned) {
    	asigned.setAsignedId(id);
        return asignedServi.save(asigned);
    }

    @DeleteMapping("/{id}")
    public void deleteById(@PathVariable("id") int id) {
    	asignedServi.deleteById(id);
    }

    @DeleteMapping
    public void deleteAll() {
    	asignedServi.deleteAll();
    }
}
