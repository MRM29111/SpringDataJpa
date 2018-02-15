package ua.online.courses.service;

import java.util.List;

import ua.online.courses.entity.User;

public interface UserService {

	void save(User user);
	
	List<User> findAllUsers();
	
	User findById(int id);
	
}
