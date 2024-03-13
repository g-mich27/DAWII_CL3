package com.cibertec.DAWIl_EF_YucraMamaniGerbertMichell.Service.Impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cibertec.DAWIl_EF_YucraMamaniGerbertMichell.Model.Asigned;
import com.cibertec.DAWIl_EF_YucraMamaniGerbertMichell.Repository.AsignedRepository;
import com.cibertec.DAWIl_EF_YucraMamaniGerbertMichell.Service.AsignedService;

@Service
public class AsignedServiceImpl implements AsignedService {

	@Autowired
	AsignedRepository asignedRepo;
	
	@Override
	public List<Asigned> findAll() {
		return asignedRepo.findAll();
	}

	@Override
	public List<Asigned> findByName(String name) {
		return asignedRepo.findByName(name);
	}

	@Override
	public Asigned findById(int id) {
		return asignedRepo.findById(id).orElseThrow();
	}

	@Override
	public Asigned save(Asigned asigned) {
		return asignedRepo.save(asigned);
	}

	@Override
	public void deleteById(int id) {
		asignedRepo.deleteById(id);
	}

	@Override
	public void deleteAll() {
		asignedRepo.deleteAll();
	}

}
