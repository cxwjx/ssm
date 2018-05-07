package com.ssm.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ssm.dao.UserDao;
import com.ssm.model.Article;
import com.ssm.model.User;
import com.ssm.service.UserService;

@Service("userService")
public class UserServiceImpl implements UserService {

	@Autowired
	private UserDao userDao;

	public User selectUserByID(int id) {
		// TODO Auto-generated method stub
		return userDao.selectUserByID(id);
	}

	public List<User> selectUsers(String name) {
		// TODO Auto-generated method stub
		return userDao.selectUsers(name);
	}

	public void addUser(User user) {
		// TODO Auto-generated method stub
		userDao.addUser(user);
	}

	public void updateUser(User user) {
		// TODO Auto-generated method stub
		userDao.updateUser(user);
	}

	public void deleteUser(int id) {
		// TODO Auto-generated method stub
		userDao.deleteUser(id);
	}

	public List<Article> getUserArticles(int id) {
		// TODO Auto-generated method stub
		return userDao.getUserArticles(id);
	}
}
