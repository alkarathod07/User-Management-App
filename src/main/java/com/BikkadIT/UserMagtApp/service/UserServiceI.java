package com.BikkadIT.UserMagtApp.service;

import java.util.List;

import com.BikkadIT.UserMagtApp.entites.City;
import com.BikkadIT.UserMagtApp.entites.Country;
import com.BikkadIT.UserMagtApp.entites.State;
import com.BikkadIT.UserMagtApp.model.Login;
import com.BikkadIT.UserMagtApp.model.User;


public interface UserServiceI {
	public List<Country> getAllCountries();
	public List<State> getAllStates(int countryId);
	public List<City> getAllCities(int stateId);
	public boolean SaveUser(User user);
	public String loginCheck(Login login);
	
	
	

}
