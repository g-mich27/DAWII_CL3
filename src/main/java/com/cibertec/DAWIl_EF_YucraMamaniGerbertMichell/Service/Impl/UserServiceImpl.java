package com.cibertec.DAWIl_EF_YucraMamaniGerbertMichell.Service.Impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cibertec.DAWIl_EF_YucraMamaniGerbertMichell.Model.User;
import com.cibertec.DAWIl_EF_YucraMamaniGerbertMichell.Repository.UserRepository;
import com.cibertec.DAWIl_EF_YucraMamaniGerbertMichell.Service.UserCategoryProjection;
import com.cibertec.DAWIl_EF_YucraMamaniGerbertMichell.Service.UserService;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	UserRepository userRepo;
	
	@Override
	public List<User> findAll() {
		return userRepo.findAll();
	}

	@Override
	public List<User> findByName(String name) {
		return userRepo.findByName(name);
	}

	@Override
	public User findById(int id) {
		return userRepo.findById(id).orElseThrow();
	}

	@Override
	public User save(User user) {
		return userRepo.save(user);
	}

	@Override
	public void deleteById(int id) {
		userRepo.deleteById(id);
	}

	@Override
	public void deleteAll() {
		userRepo.deleteAll();
	}

	@Override
	public List<UserCategoryProjection> getUsersByCategory() {
		return userRepo.getUsersByCategory();
	}
	
	@Override
	public User obtenerUsuario(String username) {
		return userRepo.findByUserName(username);
	}

	@Override
	public User autenticarUsuario(String username, String password) throws Exception {
		User usuario = obtenerUsuario(username);

        if (usuario != null && usuario.getPassword().equals(password)) {
            return usuario;
        } else {
            throw new Exception("Credenciales inválidas");
        }
	}

	


}
