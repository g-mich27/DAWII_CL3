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

import com.cibertec.DAWIl_EF_YucraMamaniGerbertMichell.Model.Kind;
import com.cibertec.DAWIl_EF_YucraMamaniGerbertMichell.Service.KindService;

@CrossOrigin(origins = "*", allowedHeaders = "*")
@RestController
@RequestMapping("/api/kind")
public class KindController {

	@Autowired
	private KindService kindServi;
	
	 @GetMapping
	public List<Kind> findAll() {
        return kindServi.findAll();
    }

    @GetMapping("/{id}")
    public Kind findById(@PathVariable("id") int id) {
        return kindServi.findById(id);
    }

    @GetMapping(params = "name")
    public List<Kind> findByName(@RequestParam("name") String name) {
        return kindServi.findByName(name);
    }

    @PostMapping
    public Kind save(@RequestBody Kind kind) {
        return kindServi.save(kind);
    }

    @PutMapping("/{id}")
    public Kind update(@PathVariable("id") int id, @RequestBody Kind kind) {
    	kind.setKindId(id);
        return kindServi.save(kind);
    }

    @DeleteMapping("/{id}")
    public void deleteById(@PathVariable("id") int id) {
    	kindServi.deleteById(id);
    }

    @DeleteMapping
    public void deleteAll() {
    	kindServi.deleteAll();
    }
}
