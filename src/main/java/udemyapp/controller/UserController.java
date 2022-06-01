package udemyapp.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.view.RedirectView;

import udemyapp.dao.UserDao;
import udemyapp.dao.UserDaoHibernate;
import udemyapp.model.Course;
import udemyapp.model.Instructor;
import udemyapp.model.User;
import udemyapp.viewobjects.EnrollViewObject;

@Controller
public class UserController {
	@Autowired
	private UserDao userDao;
	@Autowired
	private UserDaoHibernate userDaoHibernate;
	
	@RequestMapping("/register")
	public String addUser(@ModelAttribute User user) {
		userDaoHibernate.createUser(user);
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
		List<EnrollViewObject> myCourse=userDao.getMyCourse(userId);
		model.addAttribute("myCourse",myCourse);
		return "myCourse";
	}
	
	@RequestMapping("/allCourses/{uid}")
	public String allCourse(@PathVariable("uid") int uid,Model model) {
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
		if(searchInstructor.size()==0) {
			return null;
		}
		else {
			model.addAttribute("searchInstructor",searchInstructor);
			return "searchInstructor";
			}
	}
	
	@RequestMapping("/delete/{uid}")
	public RedirectView deleteUser(@PathVariable("uid") int uid,HttpServletRequest request) {
		this.userDao.deleteUser(uid);
		RedirectView redirectView = new RedirectView();
		redirectView.setUrl(request.getContextPath()+"/");
		return redirectView;
	}
	
	@RequestMapping("/update/{uid}")
	public String updateUser(@PathVariable("uid") int uid,Model model) {
		User user=this.userDao.getUser(uid);
		model.addAttribute("user",user);
		return "update_form";
	}
	
	@RequestMapping(value="update",method = RequestMethod.POST)
	public String update(@ModelAttribute User user) {
		userDaoHibernate.createUser(user);
		return "userDetail";
	}
}
