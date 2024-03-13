package com.cibertec.DAWIl_EF_YucraMamaniGerbertMichell.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.cibertec.DAWIl_EF_YucraMamaniGerbertMichell.Model.Kind;

@Repository
public interface KindRepository extends JpaRepository<Kind, Integer> {

	@Query("SELECT k FROM Kind k WHERE k.name LIKE %?1%")
    List<Kind> findByName(String name);
}
