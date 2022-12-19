package com.BikkadIT.UserMagtApp.service;

import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.BikkadIT.UserMagtApp.entites.City;
import com.BikkadIT.UserMagtApp.entites.Country;
import com.BikkadIT.UserMagtApp.entites.State;
import com.BikkadIT.UserMagtApp.entites.UserAccountEntity;
import com.BikkadIT.UserMagtApp.model.Login;
import com.BikkadIT.UserMagtApp.model.User;
import com.BikkadIT.UserMagtApp.repository.CityRepository;
import com.BikkadIT.UserMagtApp.repository.CountryRepository;
import com.BikkadIT.UserMagtApp.repository.StateRepository;
import com.BikkadIT.UserMagtApp.repository.UserRepository;

import ch.qos.logback.core.joran.util.beans.BeanUtil;

@Service
public class UserServiceImpl implements UserServiceI {
	@Autowired
 private UserRepository userRepository;
	
	@Autowired
	private CountryRepository countryRepository;
	
	@Autowired
	private StateRepository stateRepository;
	
	@Autowired
	private CityRepository cityRepository;

	@Override
	public List<Country> getAllCountries() {
		List<Country> findAll = countryRepository.findAll();
		return findAll;
	}


	@Override
	public List<State> getAllStates(int countryId) {
		List<State> findAll = stateRepository.findAll();
		return findAll;
	}


	@Override
	public List<City> getAllCities(int stateId) {
		List<City> findAll = cityRepository.findAll();
		return findAll;
	}


	@Override
	public boolean SaveUser(User user) {
		user.setAccStatus("LOCKED");
		user.setPassword(genrateRandomPassword());
		
		UserAccountEntity userAccountEntity =new UserAccountEntity ();
		BeanUtils.copyProperties(user, userAccountEntity);
		UserAccountEntity entity = userRepository.save(userAccountEntity);
		if(entity !=null) {
			return true;
		}
		
	return false;
	}


	private String genrateRandomPassword() {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public String loginCheck(Login login) {
		String email= login.getEmail();
		String password=login.getPassword();
		UserAccountEntity userAccountEntity= userRepository.findByEmailAndPassword(email,  password);
		if(userAccountEntity!=null) {
			if(userAccountEntity.getAccStatus().equals("LOKED")){
				return "Your Account is LOKED";
			} 
			else
			{
			return "Login Successful";
			}
		}
		else {
				return" Invalid Creditionals";
			}
		
		
		
	}


	}

	

