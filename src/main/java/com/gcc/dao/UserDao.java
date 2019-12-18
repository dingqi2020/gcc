package com.gcc.dao;

import com.gcc.entity.User;

public interface UserDao {
	User findByUsername(String username, String password);

	void registerByUsername(String username);

	int countUser(String username);
}
