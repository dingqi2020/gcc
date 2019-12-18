package com.gcc.service;

import com.gcc.entity.User;

public interface UserService {
	//检验用户登录
	User checkLogin(String username);
	void regist(User user);
}
