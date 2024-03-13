package com.cibertec.DAWIl_EF_YucraMamaniGerbertMichell.Service.Impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cibertec.DAWIl_EF_YucraMamaniGerbertMichell.Model.Status;
import com.cibertec.DAWIl_EF_YucraMamaniGerbertMichell.Repository.StatusRepository;
import com.cibertec.DAWIl_EF_YucraMamaniGerbertMichell.Service.StatusService;

@Service
public class StatusServiceImpl implements StatusService {

	@Autowired
	StatusRepository statusRepo;
	
	@Override
	public List<Status> findAll() {
		return statusRepo.findAll();
	}

	@Override
	public List<Status> findByName(String name) {
		return statusRepo.findByName(name);
	}

	@Override
	public Status findById(int id) {
		return statusRepo.findById(id).orElseThrow();
	}

	@Override
	public Status save(Status status) {
		return statusRepo.save(status);
	}

	@Override
	public void deleteById(int id) {
		statusRepo.deleteById(id);
	}

	@Override
	public void deleteAll() {
		statusRepo.deleteAll();
	}

}
