package udemyapp.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.view.RedirectView;

import udemyapp.dao.CourseDao;
import udemyapp.dao.InstructorDao;
import udemyapp.dao.UdemyDao;
import udemyapp.model.Course;
import udemyapp.model.Instructor;
import udemyapp.model.User;

@Controller
public class MainController {

	@Autowired
	private UdemyDao udemyDao;
	@Autowired
	private InstructorDao instructorDao;
	@Autowired
	private CourseDao courseDao;
	
	@RequestMapping("/")
	public String index(Model m) {
		List<Course> courses = courseDao.getAllCourse();
		m.addAttribute("courses",courses);
		return "index";
	}
	
	@RequestMapping("/sign-up")
	public String login(Model m) {
		m.addAttribute("title","SignUp");
		return "signup";
	}
	
	@RequestMapping("/log-in")
	public String signUp(Model mo) {
		mo.addAttribute("title","LogIn");
		return "login";
	}
	
	@RequestMapping("/log-instructor")
	public String loginstructor(Model mod) {
		mod.addAttribute("title","LogIn");
		return "login_instructor";
	}
	
	@RequestMapping("/login-user")
	public String loginUser(Model mod) {
		mod.addAttribute("title","Home");
		List<Course> courses = courseDao.getAllCourse();
		mod.addAttribute("courses",courses);
		return "home";
	}
	
	@RequestMapping("/sign-instructor")
	public String signInstructor(Model model) {
		model.addAttribute("title","SignIn");
		return "sign_instructor";
	}
	
	@RequestMapping("/login-instructor")
	public String logInstructor(Model model) {
		model.addAttribute("title","LogIn");
		return "login_instructor";
	}
	
	@RequestMapping("/courses-Data")
	public String coursesdata(Model model) {
		model.addAttribute("title","Courses");
		return "coursesData";
	}

	@RequestMapping("/signup-instructor")
	public String signupInstructor(Model modelm) {
		modelm.addAttribute("title","LogIn");
		return "login_instructor";
	}
	
	@PostMapping("/login-user")
	public String checkUser(@RequestParam("email") String email,@RequestParam("password") String password) {
		
	}
	
	@RequestMapping(value="/signup-user",method=RequestMethod.POST)
	public RedirectView handleUser(@ModelAttribute User user,HttpServletRequest request) {
		udemyDao.createUser(user);
		RedirectView redirectView = new RedirectView();
		redirectView.setUrl(request.getContextPath()+"/log-in");
		return redirectView;
	}
	
	@RequestMapping(value="/signup-instructor",method=RequestMethod.POST)
	public RedirectView handleInstructor(@ModelAttribute Instructor instructor,HttpServletRequest request) {
		instructorDao.createInstructor(instructor);
		RedirectView redirectView = new RedirectView();
		redirectView.setUrl(request.getContextPath()+"/login-instructor");
		return redirectView;
	}
	
	@RequestMapping(value="/courses",method=RequestMethod.POST)
	public RedirectView handleCourse(@ModelAttribute Course course,HttpServletRequest request) {
		courseDao.createCourse(course);
		RedirectView redirectView = new RedirectView();
		redirectView.setUrl(request.getContextPath()+"/");
		return redirectView;
	} 
}
