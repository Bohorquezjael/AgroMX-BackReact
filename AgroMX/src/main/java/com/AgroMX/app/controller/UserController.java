package com.AgroMX.app.controller;
import com.AgroMX.app.model.User;
import com.AgroMX.app.service.UserService;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
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

@CrossOrigin(origins = "*")
@RestController 
@RequestMapping("/api/users") 
public class UserController {

	UserService userService;

	public UserController(UserService userService) {
		this.userService = userService;
	}
	
	
	@GetMapping("{id}") 
	User getUserById(@PathVariable("id") Long id){
		User existingUser = userService.getUserById(id);
		return existingUser;
	}
	
	@GetMapping 

	@PostMapping 
	ResponseEntity<User> createUser(@RequestBody User newUser) {
	   User registeredUser = userService.createUser(newUser);
	   return ResponseEntity.status(201).body(registeredUser);
	}
		
	@PutMapping("{id}") 
	ResponseEntity<User> updateUser(@PathVariable("id") Long id ,@RequestBody User user) {
		User updatedUser = userService.updateUser(user, id);
		return ResponseEntity.ok(updatedUser);
	}
	
	@DeleteMapping("{id}") 
	ResponseEntity<Void> deleteUser(@PathVariable("id") Long id){
		userService.deleteUser(id);
		return ResponseEntity.noContent().build(); // Status 204
		// Como no hay cuerpo en la respuesta, 
		// se debe llamar a .build() para finalizar la construcción del ResponseEntity.

	}
}