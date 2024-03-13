package com.cibertec.DAWIl_EF_YucraMamaniGerbertMichell.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.cibertec.DAWIl_EF_YucraMamaniGerbertMichell.Model.Category;

@Repository
public interface CategoryRepository extends JpaRepository<Category, Integer> {

	@Query("SELECT c FROM Category c WHERE c.name LIKE %?1%")
    List<Category> findByName(String name);
}
