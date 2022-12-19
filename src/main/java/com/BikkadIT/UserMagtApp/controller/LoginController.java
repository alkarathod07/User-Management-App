package com.BikkadIT.UserMagtApp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.BikkadIT.UserMagtApp.model.Login;
import com.BikkadIT.UserMagtApp.service.UserServiceI;

@RestController
public class LoginController {
	@Autowired
	private UserServiceI userServiceI;
	@PutMapping("/loginCheck")
	public ResponseEntity<String> loginCheck(@RequestBody Login login){
		String loginCheck = userServiceI.loginCheck(login);
		return new  ResponseEntity<String> (loginCheck,HttpStatus.CREATED);
	}


}