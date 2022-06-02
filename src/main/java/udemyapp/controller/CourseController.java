package udemyapp.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.view.RedirectView;

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
	
	@RequestMapping("/createcourse/{id}")
	public RedirectView addCourse(@PathVariable("id") int id,@ModelAttribute Course course,Model model,HttpServletRequest request) {
		System.out.println(course);
		this.courseDao.createCourse(course);
		model.addAttribute("cid",course.getCid());
		RedirectView redirectView = new RedirectView();
		redirectView.setUrl(request.getContextPath()+"/addvideoform/"+course.getCid());
		return redirectView;
	}
	
	@RequestMapping("/deletecourse/{courseId}")
	public String removeCourse(@PathVariable("courseId") int courseId,Model model) {
		this.courseDao.deleteCourse(courseId);
		return "instructorCourses";
	}
}
