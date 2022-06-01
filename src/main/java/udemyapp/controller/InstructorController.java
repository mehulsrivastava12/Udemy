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

import udemyapp.dao.InstructorDao;
import udemyapp.dao.InstructorDaoHibernate;
import udemyapp.model.Course;
import udemyapp.model.Instructor;

@Controller
public class InstructorController {

	@Autowired
	private InstructorDao instructorDao;
	@Autowired
	private InstructorDaoHibernate instructorDaoHibernate;
	
	@RequestMapping("/instructorregister")
	public String addInstructor(@ModelAttribute Instructor instructor) {
		instructorDaoHibernate.createInstructor(instructor);
		return "loginInstructor";
	}
	
	@RequestMapping("/deleteinstructor/{instructorId}")
	public RedirectView deleteInstructor(@PathVariable("instructorId") int instructorId,HttpServletRequest request) {
		this.instructorDao.deleteInstructor(instructorId);
		RedirectView redirectView = new RedirectView();
		redirectView.setUrl(request.getContextPath()+"/");
		return redirectView;
	}
	
	@RequestMapping("/getinstructor/{instructorId}")
	public String getInstructor(@PathVariable("instructorId") int instructorId,Model model) {
		Instructor getDetail=this.instructorDaoHibernate.getInstructor(instructorId);
		model.addAttribute("instructor",getDetail);
		return "getInstructorDetail";
	}
	
	@RequestMapping("/instructorcourse/{instructorId}")
	public String instructorCourse(@PathVariable("instructorId") int instructorId,Model model) {
		List<Course> instructorCourse=this.instructorDao.getInstructorCourse(instructorId);
		model.addAttribute("instructorCourse",instructorCourse);
		return "instructorCourse";
	}
	
	@RequestMapping("/updateinstructor/{id}")
	public String Instructor(@PathVariable("id") int id,Model model) {
		Instructor instructor=this.instructorDaoHibernate.getInstructor(id);
		model.addAttribute("instructor",instructor);
		return "update_instructor";
	}
	
	@RequestMapping(value="updateinstructor",method = RequestMethod.POST)
	public String updateInstructor(@ModelAttribute Instructor instructor) {
		instructorDaoHibernate.createInstructor(instructor);
		return "getInstructorDetail";
	}
}
