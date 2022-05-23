package udemyapp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import udemyapp.dao.UserDao;
import udemyapp.model.Course;
import udemyapp.model.Instructor;
import udemyapp.model.User;
import udemyapp.model.UserEnrollment;

@Controller
public class UserController {
	@Autowired
	private UserDao userDao; 

	
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
		model.addAttribute("myCourse",myCourse);
		return "myCourse";
	}
	
	@RequestMapping("/allCourses")
	public String allCourse(Model model) {
		List<Course> allCourses=userDao.getCourses(); 
		model.addAttribute("allCourses",allCourses);
		return "allCourses";
	}
	
	@RequestMapping("/search/{title}")
	public String search(@PathVariable("title") String title,Model model) { 
		List<Course> searchCourses=userDao.searchCourse(title);
		model.addAttribute("searchCourses",searchCourses);
		return "searchCourses";
	}
	
	@RequestMapping("/searchinstructor/{instructor}")
	public String searchInstructor(@PathVariable("instructor") String firstname,Model model) {
		List<Instructor> searchInstructor=userDao.searchInstructor(firstname);
		model.addAttribute("searchInstructor",searchInstructor);
		return "searchInstructor";
	}
	
	@RequestMapping("/delete/{userId}")
	public String deleteUser(@PathVariable("userId") int userId) {
		this.userDao.deleteUser(userId);
		return "index";
	}
	
}
