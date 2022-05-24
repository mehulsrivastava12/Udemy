package udemyapp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import udemyapp.dao.InstructorDao;
import udemyapp.dao.UserDao;

@Controller
public class MainController {
	@Autowired
	UserDao userDao;
	@Autowired
	InstructorDao instructorDao;
	
	@RequestMapping("/")
	private String login() {
		return "login";
	}
	
	@RequestMapping("/signup")
	private String signup() {
		return "signup";
	}
	
	@RequestMapping("/userenroll/{uid}/{cid}")
	private String userenroll(@PathVariable("uid") int uid,@PathVariable("cid") int cid,Model m) {
		m.addAttribute("uid",uid);
		m.addAttribute("cid",cid);
		return "userenroll";
	}
	
	@RequestMapping("/addcourse/{id}")
	private String course(@PathVariable("id") String instructorId,Model m) {
		m.addAttribute("id",instructorId);
		return "addcourse";
	}
	
	@RequestMapping("/loginInstructor")
	private String loginInstructor() {
		return "loginInstructor";
	}
	
	@RequestMapping("/signupInstructor")
	private String signupInstructor() {
		return "signupInstructor";
	}
	
	@PostMapping("/instructorhome")
	private String instructorPage(@RequestParam("email") String email,@RequestParam("password") String password,Model m) {
		int loginFlag=instructorDao.validateInstructor(email, password);
		if(loginFlag > 0) {
			m.addAttribute("id",loginFlag);
			return "instructorhome";
		}
		else {
			return "loginInstructor";
		}
	}
	
	@PostMapping("/userhome")
	private String userPage(@RequestParam("email") String email,@RequestParam("password") String password,Model model) {
		int loginFlag1=userDao.validateUser(email, password);
		if(loginFlag1 > 0) {
			model.addAttribute("uid",loginFlag1);
			return "userhome";
		}
		else {
			return "login";
		}
	}
}
