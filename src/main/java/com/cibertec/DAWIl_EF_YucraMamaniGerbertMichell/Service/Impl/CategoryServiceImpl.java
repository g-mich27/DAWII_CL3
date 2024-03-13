package com.cibertec.DAWIl_EF_YucraMamaniGerbertMichell.Service.Impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cibertec.DAWIl_EF_YucraMamaniGerbertMichell.Model.Category;
import com.cibertec.DAWIl_EF_YucraMamaniGerbertMichell.Repository.CategoryRepository;
import com.cibertec.DAWIl_EF_YucraMamaniGerbertMichell.Service.CategoryService;

@Service
public class CategoryServiceImpl implements CategoryService {

	@Autowired
	CategoryRepository categoryRepo;
	
	@Override
	public List<Category> findAll() {
		return categoryRepo.findAll();
	}

	@Override
	public List<Category> findByName(String name) {
		return categoryRepo.findByName(name);
	}

	@Override
	public Category findById(int id) {
		return categoryRepo.findById(id).orElseThrow();
	}

	@Override
	public Category save(Category category) {
		return categoryRepo.save(category);
	}

	@Override
	public void deleteById(int id) {
		categoryRepo.deleteById(id);
	}

	@Override
	public void deleteAll() {
		categoryRepo.deleteAll();
	}

}
