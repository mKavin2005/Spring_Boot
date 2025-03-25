package com.college.demo;


import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import com.college.demo.entity.User;
import java.util.List;
import java.util.ArrayList;

@Service
public class UserService {
	private  List<User> users= new ArrayList<>();

	public String sayAnto() {
		return "Hello, anto!";
	}


	public String UserCreation(User user) {
		users.add(user);
		return "User Created";
	}


	public List<User> getAll() {
		return users;
	}
}