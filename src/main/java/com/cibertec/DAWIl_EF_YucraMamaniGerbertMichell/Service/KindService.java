package com.cibertec.DAWIl_EF_YucraMamaniGerbertMichell.Service;

import java.util.List;

import com.cibertec.DAWIl_EF_YucraMamaniGerbertMichell.Model.Kind;

public interface KindService {

	List<Kind> findAll();

    List<Kind> findByName(String name);

    Kind findById(int id);

    Kind save(Kind kind);

    void deleteById(int id);

    void deleteAll();
}
