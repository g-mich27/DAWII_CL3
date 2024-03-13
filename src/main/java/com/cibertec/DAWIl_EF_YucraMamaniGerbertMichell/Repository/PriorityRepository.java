package com.cibertec.DAWIl_EF_YucraMamaniGerbertMichell.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.cibertec.DAWIl_EF_YucraMamaniGerbertMichell.Model.Priority;

@Repository
public interface PriorityRepository extends JpaRepository<Priority, Integer> {

	@Query("SELECT p FROM Priority p WHERE p.name LIKE %?1%")
    List<Priority> findByName(String name);
}
