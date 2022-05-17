package udemyapp.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.view.RedirectView;

import udemyapp.dao.CourseDao;
import udemyapp.dao.ILoginDao;
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
	@Autowired
	ILoginDao loginDao;
	
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
	public String logOut(Model mo) {
		mo.addAttribute("title","Index");
		return "login";
	}
	
	@RequestMapping("/log-out")
	public String signUp(Model mo) {
		mo.addAttribute("title","LogIn");
		List<Course> courses = courseDao.getAllCourse();
		mo.addAttribute("courses",courses);
		return "index";
	}
	
	@RequestMapping("/log-instructor")
	public String loginstructor(Model mod) {
		mod.addAttribute("title","LogIn");
		return "login_instructor";
	}
	
	@RequestMapping("/login-user")
	public String loginUser() {
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
	
	@RequestMapping("/my-profile")
	public String myProfile(Model model) {
		model.addAttribute("title","MyProfile");
		return "myprofile";
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
	
	@PostMapping("/login-user")
	public String checkUser(@RequestParam("email") String email,@RequestParam("password") String password,Model mod) {
		boolean loginFlag=loginDao.validateUser(email, password);
		if(loginFlag==true) {
			mod.addAttribute("title","Home");
			List<Course> courses = courseDao.getAllCourse();
			mod.addAttribute("courses",courses);
			return "home";
		}
		else {
			return "login";
		}
	}
	
	@PostMapping("/courses-Data")
	public String checkInstructor(@RequestParam("email") String email,@RequestParam("password") String password,Model mod) {
		boolean loginFlag1=loginDao.validateInstructor(email, password);
		if(loginFlag1==true) {
			mod.addAttribute("title","Courses");
			return "coursesData";
		}
		else {
			return "login_instructor";
		}
	}
	
	@RequestMapping("/update/{productId}")
	public String updateForm() {

		return "update_form";
	}
}
