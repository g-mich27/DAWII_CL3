package com.cibertec.DAWIl_EF_YucraMamaniGerbertMichell.Service.Impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cibertec.DAWIl_EF_YucraMamaniGerbertMichell.Model.Priority;
import com.cibertec.DAWIl_EF_YucraMamaniGerbertMichell.Repository.PriorityRepository;
import com.cibertec.DAWIl_EF_YucraMamaniGerbertMichell.Service.PriorityService;

@Service
public class PriorityServiceImpl implements PriorityService {

	@Autowired
	PriorityRepository priorityRepo;
	
	@Override
	public List<Priority> findAll() {
		return priorityRepo.findAll();
	}

	@Override
	public List<Priority> findByName(String name) {
		return priorityRepo.findByName(name);
	}

	@Override
	public Priority findById(int id) {
		return priorityRepo.findById(id).orElseThrow();
	}

	@Override
	public Priority save(Priority priority) {
		return priorityRepo.save(priority);
	}

	@Override
	public void deleteById(int id) {
		priorityRepo.deleteById(id);
	}

	@Override
	public void deleteAll() {
		priorityRepo.deleteAll();
	}

}
