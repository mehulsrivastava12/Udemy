package udemyapp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import udemyapp.dao.UserDaoImpl;
import udemyapp.model.Course;
import udemyapp.model.User;
import udemyapp.model.UserEnrollment;

@Controller
public class UserController {
	@Autowired
	private UserDaoImpl userDao; 
	
	@RequestMapping("/register")
	public String addUser(@ModelAttribute User user) {
		userDao.createUser(user);
		return "login";
	}
	
	@RequestMapping("/detail/{userId}")
	public String userDetail(@PathVariable("userId") int userId,Model model) {
		User detail=this.userDao.getUser(userId);
		model.addAttribute("user",detail);
		return "userDetail";
	}
	
	@RequestMapping("/mycourses/{userId}")
	public String myCourse(@PathVariable("userId") int userId,Model model) {
		List<UserEnrollment> myCourse=userDao.getMyCourse(userId); 
		model.addAttribute(myCourse);
		return "myCourse";
	}
	
	@RequestMapping("/allCourses")
	public String allCourse(Model model) {
		List<Course> allCourses=userDao.getCourses(); 
		model.addAttribute(allCourses);
		return "allCourse";
	}
	
}
