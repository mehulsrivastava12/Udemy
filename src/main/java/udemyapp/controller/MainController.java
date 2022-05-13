package udemyapp.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.view.RedirectView;

import udemyapp.dao.InstructorDao;
import udemyapp.dao.UdemyDao;
import udemyapp.model.Instructor;
import udemyapp.model.User;

@Controller
public class MainController {

	@Autowired
	private UdemyDao udemyDao;
	@Autowired
	private InstructorDao instructorDao;
	
	@RequestMapping("/")
	public String home() {
		return "index";
	}
	
	@RequestMapping("/signup")
	public String login(Model m) {
		m.addAttribute("title","SignUp");
		return "signup";
	}
	
	@RequestMapping("/login")
	public String signUp(Model mo) {
		mo.addAttribute("title","LogIn");
		return "login";
	}
	
	@RequestMapping("/log-instructor")
	public String loginstructor(Model mod) {
		mod.addAttribute("title","LogIn");
		return "login-instructor";
	}
	
	@RequestMapping("/sign_instructor")
	public String signinstructor(Model mode) {
		mode.addAttribute("title","SignUp");
		return "sign_instructor";
	}
	
	@RequestMapping(value="/login",method=RequestMethod.POST)
	public RedirectView handleUser(@ModelAttribute User user,HttpServletRequest request) {
		udemyDao.createUser(user);
		RedirectView redirectView = new RedirectView();
		redirectView.setUrl(request.getContextPath()+"/login");
		return redirectView;
	}
	
	@RequestMapping(value="/login-instructor",method=RequestMethod.POST)
	public RedirectView handleInstructor(@ModelAttribute Instructor instructor,HttpServletRequest request) {
		instructorDao.createInstructor(instructor);
		RedirectView redirectView = new RedirectView();
		redirectView.setUrl(request.getContextPath()+"/coursesData");
		return redirectView;
	}
}
