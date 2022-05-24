package udemyapp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import udemyapp.dao.InstructorDao;
import udemyapp.model.Course;
import udemyapp.model.Instructor;

@Controller
public class InstructorController {

	@Autowired
	private InstructorDao instructorDao;
	
	@RequestMapping("/instructorregister")
	public String addInstructor(@ModelAttribute Instructor instructor) {
		instructorDao.createInstructor(instructor);
		return "loginInstructor";
	}
	
	@RequestMapping("/deleteinstructor/{instructorId}")
	public String deleteInstructor(@PathVariable("instructorId") int instructorId,Model model) {
		this.instructorDao.deleteInstructor(instructorId);
		return "index";
	}
	
	@RequestMapping("/getinstructor/{instructorId}")
	public String getInstructor(@PathVariable("instructorId") int instructorId,Model model) {
		Instructor getDetail=this.instructorDao.getInstructor(instructorId);
		model.addAttribute("getInstructorDetail",getDetail);
		return "getInstructorDetail";
	}
	
	@RequestMapping("/instructorcourse/{instructorId}")
	public String instructorCourse(@PathVariable("instructorId") int instructorId,Model model) {
		List<Course> instructorCourse=this.instructorDao.getInstructorCourse(instructorId);
		model.addAttribute("instructorCourse",instructorCourse);
		return "instructorCourse";
	}
}
