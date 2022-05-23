package udemyapp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import udemyapp.dao.CourseDao;
import udemyapp.model.Course;

@Controller
public class CourseController {
	
	@Autowired
	private CourseDao courseDao;
	
	@RequestMapping("/course/{courseId}")
	public String getCourses(@PathVariable("courseId") int courseId,Model model) {
		Course course=courseDao.getCourse(courseId);
		model.addAttribute("course",course);
		return "course";
	}
	
	@RequestMapping("/createcourse")
	public String addCourse(@ModelAttribute Course course) {
		this.courseDao.createCourse(course);
		return "instructorCourse";
	}
	
	@RequestMapping("/deletecourse/{courseId}")
	public String removeCourse(@PathVariable("courseId") int courseId,Model model) {
		this.courseDao.deleteCourse(courseId);
		return "instructorCourses";
	}
}
