package com.dp.petshome.persistence.dao;

import java.util.List;

import com.dp.petshome.persistence.model.User;

public interface UserMapper {

	int insertSelective(User record);

	int updateByPrimaryKeySelective(User record);

	List<User> selectUsers();
}