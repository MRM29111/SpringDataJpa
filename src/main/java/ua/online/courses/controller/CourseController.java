package ua.online.courses.controller;

import java.math.BigDecimal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import ua.online.courses.entity.Course;
import ua.online.courses.service.CourseService;

@Controller
@RequestMapping("/course")
public class CourseController {

	@Autowired
	private CourseService courseService;
	
	@GetMapping("/add") // localhost:8080/ROOT/course/add
	public String showAddCourseForm() {
		return "course/add-course";
	}
	
	@PostMapping("/add")
	public String saveCourse(
			@RequestParam("title") String title,
			@RequestParam("description") String description,
			@RequestParam("price") BigDecimal price
			) {
		
		Course course = new Course();
		course.setTitle(title);
		course.setDescription(description);
		course.setPrice(price);
		
		courseService.saveCourse(course);
		
		return "redirect:/course/list";
	}
	
	@GetMapping("/list") // localhost:8080/ROOT/course/list
	public String showUsersList(Model model) {
		model.addAttribute("coursesList", courseService.findAllCourses());
		return "course/courses-list";
	}
	
	@GetMapping("/{courseId}/info")
	public String getCourseById(@PathVariable("courseId") int id) {
		Course course = courseService.findCourseById(id);
		System.out.println(course);
		return "";
	}
	
}
