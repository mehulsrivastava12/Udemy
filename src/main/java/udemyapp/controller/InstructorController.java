package udemyapp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import udemyapp.dao.InstructorDaoImpl;
import udemyapp.model.Course;
import udemyapp.model.Instructor;

@Controller
public class InstructorController {

	@Autowired
	private InstructorDaoImpl instructorDao;
	
	@RequestMapping("/instructorRegister")
	public String addInstructor(@ModelAttribute Instructor instructor) {
		instructorDao.createInstructor(instructor);
		return "insturctorLogin";
	}
	
	@RequestMapping("/deleteInstructor/{instructorId}")
	public String deleteInstructorAccount(@PathVariable("instructorId") int instructorId,Model model) {
		this.instructorDao.deleteInstructor(instructorId);
		return "index";
	}
	
	@RequestMapping("/getInstructorDetails/{instructorId}")
	public String getInstructorDetails(@PathVariable("instructorId") int instructorId,Model model) {
		Instructor getDetail=this.instructorDao.getInstructor(instructorId);
		model.addAttribute("getInstructorDetail",getDetail);
		return "getInstructorDetail";
	}
	
	@RequestMapping("/instructorCourse/{instructorId}")
	public String instructorCourse(@PathVariable("instructorId") int instructorId,Model model) {
		List<Course> instructorCourse=this.instructorDao.getInstructorCourse(instructorId);
		model.addAttribute("instructorCourse",instructorCourse);
		return "instrcutorCourse";
	}
}
