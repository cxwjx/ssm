package com.ssm.service;

import java.util.List;
import com.ssm.model.Article;
import com.ssm.model.User;


public interface UserService{

	public User selectUserByID(int id);
	public List<User> selectUsers(String name);
	public void addUser(User user);
	public void updateUser(User user);
	public void deleteUser(int id);
	public List<Article> getUserArticles(int id);
	
}
