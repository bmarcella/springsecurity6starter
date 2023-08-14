package com.monkata.auth.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.monkata.auth.Entity.Loans;
import com.monkata.auth.Entity.Users;
import com.monkata.auth.Feign.LoansFeignClient;
import com.monkata.auth.services.IUserService;
import com.monkata.auth.services.UserServiceConfig;

import dto.Config;
import io.github.resilience4j.circuitbreaker.annotation.CircuitBreaker;

@RestController
public class UserController {
 	
	@Autowired
	IUserService userService;
	
	

	 @GetMapping(path="")
	 public String Home(){
		 return "Home page";
	 }
	
}
