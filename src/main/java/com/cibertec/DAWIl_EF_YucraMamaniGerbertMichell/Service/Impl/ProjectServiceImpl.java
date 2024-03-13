package com.cibertec.DAWIl_EF_YucraMamaniGerbertMichell.Service.Impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cibertec.DAWIl_EF_YucraMamaniGerbertMichell.Model.Project;
import com.cibertec.DAWIl_EF_YucraMamaniGerbertMichell.Repository.ProjectRepository;
import com.cibertec.DAWIl_EF_YucraMamaniGerbertMichell.Service.ProjectService;

@Service
public class ProjectServiceImpl implements ProjectService {

	@Autowired
	ProjectRepository projectRepo;
	
	@Override
	public List<Project> findAll() {
		return projectRepo.findAll();
	}

	@Override
	public List<Project> findByName(String name) {
		return projectRepo.findByName(name);
	}

	@Override
	public Project findById(int id) {
		return projectRepo.findById(id).orElseThrow();
	}

	@Override
	public Project save(Project project) {
		return projectRepo.save(project);
	}

	@Override
	public void deleteById(int id) {
		projectRepo.deleteById(id);
	}

	@Override
	public void deleteAll() {
		projectRepo.deleteAll();
	}

}
