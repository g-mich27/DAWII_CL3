package com.cibertec.DAWIl_EF_YucraMamaniGerbertMichell.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.cibertec.DAWIl_EF_YucraMamaniGerbertMichell.Model.User;
import com.cibertec.DAWIl_EF_YucraMamaniGerbertMichell.Service.UserService;

@CrossOrigin(origins = "*", allowedHeaders = "*")
@RestController
@RequestMapping("/api/user")
public class UserController {

	@Autowired
	private UserService userServi;
	
	 @GetMapping
	public List<User> findAll() {
        return userServi.findAll();
    }

    @GetMapping("/{id}")
    public User findById(@PathVariable("id") int id) {
        return userServi.findById(id);
    }

    @GetMapping(params = "name")
    public List<User> findByName(@RequestParam("name") String name) {
        return userServi.findByName(name);
    }

    @PostMapping
    public User save(@RequestBody User user) {
        return userServi.save(user);
    }

    @PutMapping("/{id}")
    public User update(@PathVariable("id") int id, @RequestBody User user) {
    	user.setUserId(id);
        return userServi.save(user);
    }

    @DeleteMapping("/{id}")
    public void deleteById(@PathVariable("id") int id) {
    	userServi.deleteById(id);
    }

    @DeleteMapping
    public void deleteAll() {
    	userServi.deleteAll();
    }
    
    @GetMapping("/{username}")
    public User obtenerUsuario(@PathVariable("username") String username){
        return userServi.obtenerUsuario(username);
    }
    
    @PostMapping("/login")
    public ResponseEntity<?> login(@RequestBody User usuario) {
    	try {
            User usuarioAutenticado = userServi.autenticarUsuario(usuario.getUserName(), usuario.getPassword());
            return new ResponseEntity<>(usuarioAutenticado, HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>("Credenciales inválidas", HttpStatus.UNAUTHORIZED);
        }
    }
}
