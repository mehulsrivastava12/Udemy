package udemyapp.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.view.RedirectView;

import udemyapp.dao.CourseDao;
import udemyapp.dao.InstructorDao;
import udemyapp.dao.InstructorDaoHibernate;
import udemyapp.dao.UserDao;
import udemyapp.model.Course;

@Controller
public class MainController {
	@Autowired
	UserDao userDao;
	@Autowired
	InstructorDao instructorDao;
	@Autowired
	InstructorDaoHibernate instructorDaoHibernate;
	@Autowired
	CourseDao courseDao;
	@Autowired
	JdbcTemplate jdbcTemplate;
	
	@RequestMapping("/")
	private String login() {
		return "login";
	}
	
	@RequestMapping("/signup")
	private String signup() {
		return "signup";
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
			List<Course> instructorCourse=this.instructorDao.getInstructorCourse(loginFlag);
			m.addAttribute("instructorCourse",instructorCourse);
			return "instructorhome";
		}
		else {
			m.addAttribute("msg","Invalid Username Or Password");
			return "loginInstructor";
		}
	}
	
	@PostMapping("/userhome")
	private String userPage(@RequestParam("email") String email,@RequestParam("password") String password,Model model) {
		int loginFlag1=userDao.validateUser(email, password);
		if(loginFlag1 > 0) {
			model.addAttribute("uid",loginFlag1);
			List<Course> allCourses=userDao.getCourses(); 
			model.addAttribute("allCourses",allCourses);
			return "userhome";
		}
		else {
			model.addAttribute("msg","Invalid Username Or Password");
			return "login";
		}
	}
	
	@RequestMapping("/search/{uid}")
	private RedirectView searchinstructor(@PathVariable("uid") int uid,@RequestParam("instructor") String firstName,Model m,HttpServletRequest request) {
		try {
			int count=jdbcTemplate.queryForObject("select count(*) from Instructor where firstName=?",Integer.class,firstName);
			int c=jdbcTemplate.queryForObject("select count(*) from Course where title=?",Integer.class,firstName);
			if(count>=1) {
				String url="searchinstructor/"+uid+"/"+firstName;
				RedirectView redirectView=new RedirectView();
				redirectView.setUrl(request.getContextPath()+"/"+url);
				return redirectView;
			}
			else if(c>=1){
				String url="search/"+uid+"/"+firstName;
				RedirectView redirectView=new RedirectView();
				redirectView.setUrl(request.getContextPath()+"/"+url);
				return redirectView;
			}
			else {
				String url="nodata";
				RedirectView redirectView=new RedirectView();
				redirectView.setUrl(request.getContextPath()+"/"+url);
				return redirectView;
			}
			
		} catch (Exception e) {
			String url="nodata";
			RedirectView redirectView=new RedirectView();
			redirectView.setUrl(request.getContextPath()+"/"+url);
			return redirectView;
		}
	}
	
	@RequestMapping("/nodata")
	private String nodata() {
		return "nodata";
	}

}