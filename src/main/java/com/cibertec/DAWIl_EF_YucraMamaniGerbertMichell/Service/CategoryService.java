package com.cibertec.DAWIl_EF_YucraMamaniGerbertMichell.Service;

import java.util.List;

import com.cibertec.DAWIl_EF_YucraMamaniGerbertMichell.Model.Category;

public interface CategoryService {

	List<Category> findAll();

    List<Category> findByName(String name);

    Category findById(int id);

    Category save(Category category);

    void deleteById(int id);

    void deleteAll();
}
