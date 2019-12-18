package com.gcc.dao;

import com.gcc.entity.User;

public interface UserDao {
	User findByUsername(String username);

	void registerByUsername(String username);
}
