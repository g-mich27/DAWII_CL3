package com.cibertec.DAWIl_EF_YucraMamaniGerbertMichell.Service;

import java.util.List;

import com.cibertec.DAWIl_EF_YucraMamaniGerbertMichell.Model.Priority;

public interface PriorityService {

	List<Priority> findAll();

    List<Priority> findByName(String name);

    Priority findById(int id);

    Priority save(Priority priority);

    void deleteById(int id);

    void deleteAll();
}
