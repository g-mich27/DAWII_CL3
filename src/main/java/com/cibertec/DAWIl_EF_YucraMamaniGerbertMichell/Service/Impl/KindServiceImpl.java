package com.cibertec.DAWIl_EF_YucraMamaniGerbertMichell.Service.Impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cibertec.DAWIl_EF_YucraMamaniGerbertMichell.Model.Kind;
import com.cibertec.DAWIl_EF_YucraMamaniGerbertMichell.Repository.KindRepository;
import com.cibertec.DAWIl_EF_YucraMamaniGerbertMichell.Service.KindService;

@Service
public class KindServiceImpl implements KindService {

	@Autowired
	KindRepository kindRepo;
	
	@Override
	public List<Kind> findAll() {
		return kindRepo.findAll();
	}

	@Override
	public List<Kind> findByName(String name) {
		return kindRepo.findByName(name);
	}

	@Override
	public Kind findById(int id) {
		return kindRepo.findById(id).orElseThrow();
	}

	@Override
	public Kind save(Kind kind) {
		return kindRepo.save(kind);
	}

	@Override
	public void deleteById(int id) {
		kindRepo.deleteById(id);
	}

	@Override
	public void deleteAll() {
		kindRepo.deleteAll();
	}

}
