package com.lk.mapper;

import com.lk.UserEntity;

import java.util.HashMap;
import java.util.List;
import java.util.Map;


public interface UserMapper {

    List<UserEntity> getAll();
	
	UserEntity getOne(Long id);

	void insert(UserEntity user);

	void update(UserEntity user);

	void delete(Long id);

	HashMap getLimitQuatoBaseInfo1(Map map);

}