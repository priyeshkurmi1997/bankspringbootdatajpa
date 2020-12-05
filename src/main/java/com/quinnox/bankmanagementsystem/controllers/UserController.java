package com.quinnox.bankmanagementsystem.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.quinnox.bankmanagementsystem.dao.UsersRepository;
import com.quinnox.bankmanagementsystem.dto.ResponseData;
import com.quinnox.bankmanagementsystem.entities.User;

@RestController
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class UserController {
	
	
	@Autowired
	UsersRepository userRepo;
	
	@PostMapping("/user")
	public String addEmployee(@RequestBody User user) {
		userRepo.save(user);
		return "User Added Successfully";
	}
	
	
	@GetMapping("/user")
	public ResponseData findAll() {
		ResponseData response = new ResponseData();
		response.setMsg("User data Recived Successfully");
		response.setData(userRepo.findAll());
		return response;
		
		
	}


	


}
