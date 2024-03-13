package com.cibertec.DAWIl_EF_YucraMamaniGerbertMichell.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.cibertec.DAWIl_EF_YucraMamaniGerbertMichell.Model.Asigned;

@Repository
public interface AsignedRepository extends JpaRepository<Asigned, Integer> {

	@Query("SELECT a FROM Asigned a WHERE a.name LIKE %?1%")
    List<Asigned> findByName(String name);
}
