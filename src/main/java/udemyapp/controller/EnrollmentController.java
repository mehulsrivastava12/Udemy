package udemyapp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import udemyapp.dao.EnrollmentDao;
import udemyapp.model.UserEnrollment;

@Controller
public class EnrollmentController {

	@Autowired
	private EnrollmentDao enrollmentDao;
	
	@RequestMapping("/enroll")
	public String enrollUser(@ModelAttribute UserEnrollment userEnrollment) {
		this.enrollmentDao.enroll(userEnrollment);
		return "myCourse";
	}
}