package com.BikkadIT.UserMagtApp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.BikkadIT.UserMagtApp.entites.UserAccountEntity;
@Repository
public interface UserRepository  extends JpaRepository<UserAccountEntity , Integer>{
public  UserAccountEntity findByEmailAndPassword(String email,String password);


}
