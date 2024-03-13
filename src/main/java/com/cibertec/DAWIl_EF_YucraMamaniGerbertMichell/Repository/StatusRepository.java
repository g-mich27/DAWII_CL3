package com.cibertec.DAWIl_EF_YucraMamaniGerbertMichell.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.cibertec.DAWIl_EF_YucraMamaniGerbertMichell.Model.Status;

@Repository
public interface StatusRepository extends JpaRepository<Status, Integer> {

	@Query("SELECT s FROM Status s WHERE s.name LIKE %?1%")
    List<Status> findByName(String name);
}
