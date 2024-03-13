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

import com.cibertec.DAWIl_EF_YucraMamaniGerbertMichell.Model.Category;
import com.cibertec.DAWIl_EF_YucraMamaniGerbertMichell.Service.CategoryService;

@CrossOrigin(origins = "*", allowedHeaders = "*")
@RestController
@RequestMapping("/api/category")
public class CategoryController {

	@Autowired
	private CategoryService categoryServi;
	
	 @GetMapping
	public List<Category> findAll() {
        return categoryServi.findAll();
    }

    @GetMapping("/{id}")
    public Category findById(@PathVariable("id") int id) {
        return categoryServi.findById(id);
    }

    @GetMapping(params = "name")
    public List<Category> findByName(@RequestParam("name") String name) {
        return categoryServi.findByName(name);
    }

    @PostMapping
    public Category save(@RequestBody Category category) {
        return categoryServi.save(category);
    }

    @PutMapping("/{id}")
    public Category update(@PathVariable("id") int id, @RequestBody Category category) {
    	category.setCategoryId(id);
        return categoryServi.save(category);
    }

    @DeleteMapping("/{id}")
    public void deleteById(@PathVariable("id") int id) {
    	categoryServi.deleteById(id);
    }

    @DeleteMapping
    public void deleteAll() {
    	categoryServi.deleteAll();
    }
}
