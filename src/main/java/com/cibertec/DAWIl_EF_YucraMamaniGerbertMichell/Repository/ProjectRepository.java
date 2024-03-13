package com.cibertec.DAWIl_EF_YucraMamaniGerbertMichell.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.cibertec.DAWIl_EF_YucraMamaniGerbertMichell.Model.Project;

@Repository
public interface ProjectRepository extends JpaRepository<Project, Integer> {

	@Query("SELECT pr FROM Project pr WHERE pr.name LIKE %?1%")
    List<Project> findByName(String name);
}
