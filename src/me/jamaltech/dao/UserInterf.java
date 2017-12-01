package me.jamaltech.dao;

import me.jamaltech.entities.User;

public interface UserInterf {
	
	public User getUser(int id);
	public void addUser(User user);

}
