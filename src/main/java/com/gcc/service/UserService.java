package com.gcc.service;

import com.gcc.entity.User;

public interface UserService {
	// 检验用户登录
	User checkLogin(String username, String password);
	void regist(User user);
	// 检查是否已经注册
	int checkRegisted(String username);
}
