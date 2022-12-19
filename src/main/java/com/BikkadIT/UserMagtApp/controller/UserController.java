package com.BikkadIT.UserMagtApp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.BikkadIT.UserMagtApp.entites.City;
import com.BikkadIT.UserMagtApp.entites.Country;
import com.BikkadIT.UserMagtApp.entites.State;
import com.BikkadIT.UserMagtApp.model.User;
import com.BikkadIT.UserMagtApp.service.UserServiceI;

@RestController
public class UserController {
	@Autowired
private UserServiceI userServiceI;
	@GetMapping(value="/getAllCountry" ,produces="application/json")
	public ResponseEntity<List<Country>> getAllCountry(){
		List<Country> allCountries = userServiceI.getAllCountries();
		return new ResponseEntity<List<Country>>(allCountries,HttpStatus.OK);
		
	}
	@GetMapping(value="/getAllState/{countryId}" ,produces="application/json")
	public ResponseEntity<List<State>> getAllState( @PathVariable int countryId){
		List<State> allStates = userServiceI.getAllStates(countryId);
		return new ResponseEntity<List<State>>(allStates,HttpStatus.OK);
		
}
	@GetMapping(value="/getAllCity/{stateId}" ,produces="application/json")
	public ResponseEntity<List<City>> getAllCity( @PathVariable int stateId){
		 List<City> allCities = userServiceI.getAllCities(stateId);
		return new ResponseEntity<List<City>>(allCities ,HttpStatus.OK);
}
	
	@PostMapping(value = "/saveUser", consumes = "application/json")
	public ResponseEntity<String> saveUser(@RequestBody User user) {

		boolean saveUser = userServiceI.SaveUser(user);

	
		if (saveUser) {
			String msg = "User Saved";
			return new ResponseEntity<String>(msg, HttpStatus.CREATED);
		} else {
			String msg="User Not Saved";
		
			return new ResponseEntity<String>(msg, HttpStatus.CREATED);

		}
}
}