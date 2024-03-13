package com.cibertec.DAWIl_EF_YucraMamaniGerbertMichell.Service;

import java.util.List;

import com.cibertec.DAWIl_EF_YucraMamaniGerbertMichell.Model.Status;

public interface StatusService {

	List<Status> findAll();

    List<Status> findByName(String name);

    Status findById(int id);

    Status save(Status status);

    void deleteById(int id);

    void deleteAll();
}
