package com.monkata.auth.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.monkata.auth.Entity.Users;


public interface UserRepository extends CrudRepository<Users, Long>  {
	
}
