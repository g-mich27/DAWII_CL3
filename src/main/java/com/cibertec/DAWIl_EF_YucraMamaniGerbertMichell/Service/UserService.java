package com.cibertec.DAWIl_EF_YucraMamaniGerbertMichell.Service;

import java.util.List;

import com.cibertec.DAWIl_EF_YucraMamaniGerbertMichell.Model.User;

public interface UserService{

	List<User> findAll();
    List<User> findByName(String name);
    User findById(int id);
    User save(User user);
    void deleteById(int id);
    void deleteAll();
    
    public User obtenerUsuario(String username);
    public User autenticarUsuario(String username, String password) throws Exception;
    
	List<UserCategoryProjection> getUsersByCategory();
    
   
}
