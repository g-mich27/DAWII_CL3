package com.cibertec.DAWIl_EF_YucraMamaniGerbertMichell.Service;

import java.util.List;

import com.cibertec.DAWIl_EF_YucraMamaniGerbertMichell.Model.Project;

public interface ProjectService {

	List<Project> findAll();

    List<Project> findByName(String name);

    Project findById(int id);

    Project save(Project project);

    void deleteById(int id);

    void deleteAll();
}
