package com.monkata.auth.services;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Service;

import com.monkata.auth.Entity.Users;
import com.monkata.auth.repository.UserRepository;

import lombok.Data;

@Service
public class UserService implements IUserService{
    @Autowired 
    UserRepository userRepository; 
    

	public Users save(Users l) {
		return userRepository.save(l);
	}
	
	@Override
	public List<Users> findAll() {
		// TODO Auto-generated method stub
		return (List<Users>) userRepository.findAll();
	}

}

