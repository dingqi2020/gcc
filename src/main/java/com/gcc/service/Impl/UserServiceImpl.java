package com.gcc.service.Impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import com.gcc.dao.UserDao;
import com.gcc.entity.User;
import com.gcc.service.UserService;

@Service
@Repository
public class UserServiceImpl implements UserService{

	@Autowired
	private UserDao userDao;

	public User checkLogin(String userid, String password) {
		User user = userDao.findByUsername(userid, password);
		if(user != null){
			return user;
		}
		return null;
	}

	@Override
	public void regist(User user) {
		userDao.registerByUsername(user.getUserid(), user.getUsername());
	}

	@Override
	public int checkRegisted(String userid) {
		return userDao.countUser(userid);
	}
}
