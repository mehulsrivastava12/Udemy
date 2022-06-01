package udemyapp.controller;

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
import udemyapp.model.Instructor;

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
	
	@RequestMapping("/userenroll/{uid}/{cid}/{id}")
	private String userenroll(@PathVariable("uid") int uid,@PathVariable("cid") int cid,@PathVariable("id") int id,Model m) {
		m.addAttribute("uid",uid);
		m.addAttribute("cid",cid);
		Course course=courseDao.getCourse(cid);
		m.addAttribute("title",course.getTitle());
		Instructor instructor=instructorDaoHibernate.getInstructor(id);
		m.addAttribute("firstName",instructor.getFirstName());
		m.addAttribute("lastName",instructor.getLastName());
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
			model.addAttribute("msg","Invalid Username Or Password");
			return "login";
		}
	}
	
	@RequestMapping("/search")
	private RedirectView searchinstructor(@RequestParam("instructor") String firstName,Model m) {
		try {
			int count=jdbcTemplate.queryForObject("select count(*) from Instructor where firstName=?",Integer.class,firstName);
			int c=jdbcTemplate.queryForObject("select count(*) from Course where title=?",Integer.class,firstName);
			if(count>=1) {
				String url="searchinstructor/"+firstName;
				RedirectView redirectView=new RedirectView();
				redirectView.setUrl(url);
				return redirectView;
			}
			else if(c>=1){
				String url="search/"+firstName;
				RedirectView redirectView=new RedirectView();
				redirectView.setUrl(url);
				return redirectView;
			}
			else {
				String url="nodata";
				RedirectView redirectView=new RedirectView();
				redirectView.setUrl(url);
				return redirectView;
			}
			
		} catch (Exception e) {
			String url="nodata";
			RedirectView redirectView=new RedirectView();
			redirectView.setUrl(url);
			return redirectView;
		}
	}
	
	@RequestMapping("/nodata")
	private String nodata() {
		return "nodata";
	}

}