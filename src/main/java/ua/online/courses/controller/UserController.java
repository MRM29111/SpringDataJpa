package ua.online.courses.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import ua.online.courses.entity.User;
import ua.online.courses.service.UserService;

@Controller
@RequestMapping("/user")
public class UserController {
	
	@Autowired
	private UserService userService;
	
	@GetMapping("/add")
	public String showAddUserForm() {
		return "user/add-user";
	}
	
	@PostMapping("/add")
	public String saveUser(
			@RequestParam("firstName") String firstName,
			@RequestParam("lastName") String lastName,
			@RequestParam("age") Integer age,
			@RequestParam("email") String email
			) {
		User user = new User();
		user.setFirstName(firstName);
		user.setLastName(lastName);
		user.setAge(age);
		user.setEmail(email);
		
		userService.save(user);
		
		return "redirect:/user/list";
	}
	
	@GetMapping("/list")
	public String showUsersList() {
		return "user/users-list";
	}
	
	

}
