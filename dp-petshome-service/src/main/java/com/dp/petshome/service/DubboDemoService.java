package com.dp.petshome.service;

import java.util.List;

import com.dp.petshome.persistence.model.User;

public interface DubboDemoService {
	
	Boolean insertUser(User user);
	
	List<User> selectUsers();
}
