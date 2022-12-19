package com.BikkadIT.UserMagtApp.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.BikkadIT.UserMagtApp.entites.Country;

public interface CountryRepository extends JpaRepository<Country, Integer> {

}
