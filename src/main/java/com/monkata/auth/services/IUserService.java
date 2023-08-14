package com.monkata.auth.services;

import java.util.List;

import com.monkata.auth.Entity.Users;

public interface IUserService {

 public Users save(Users l);

 public List<Users> findAll();
}
