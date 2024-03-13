package com.cibertec.DAWIl_EF_YucraMamaniGerbertMichell.Service;

import java.util.List;

import com.cibertec.DAWIl_EF_YucraMamaniGerbertMichell.Model.Asigned;;

public interface AsignedService {

	List<Asigned> findAll();

    List<Asigned> findByName(String name);

    Asigned findById(int id);

    Asigned save(Asigned asigned);

    void deleteById(int id);

    void deleteAll();
}
