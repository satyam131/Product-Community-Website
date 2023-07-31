package com.exittest.backend.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.exittest.backend.model.User;

@Repository
public interface UserDao  extends JpaRepository<User, Integer>{
	public User findByUsernameAndPassword(String username,String password);
	//Here, we give it username, it will return the user of given username
	public User findByUsername(String userName); 
}
