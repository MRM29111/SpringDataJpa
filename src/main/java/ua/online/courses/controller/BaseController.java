package ua.online.courses.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class BaseController {


	@GetMapping("/")
	public String showHome(Model model) {
		return "home";
	}

	@GetMapping("/info")
	public String userInfo(Model model) {
		
		return "info";
	}
	
	@GetMapping("/admin/dashboard")
	public String showAdminDashboard() {
		return "admin/dashboard";
	}
	
	@GetMapping("/admin")
	public String showAdminPage(){
		return "admin";
	}
	
	@GetMapping("/user")
	public String showUserPage(){
		return "user";
	}
	
	@GetMapping("/login")
	public String showLoginPage(){
		return "user";
	}
	
	@GetMapping("/register")
	public String showRegisterPage(){
		return "user";
	}
	
	@GetMapping("/item")
	public String showItemPage(){
		return "item";
	}
}
