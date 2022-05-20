package udemyapp.main;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import udemyapp.dao.InstructorDao;
import udemyapp.model.Course;

public class App {
		
	public static void main(String [] args) {
		System.out.println("Program Started.......!!!");
		ApplicationContext context=new ClassPathXmlApplicationContext("udemyapp/main/config.xml");
		InstructorDao userDao=context.getBean(InstructorDao.class);
		List<Course> users=userDao.getInstructorCourse(3);
		System.out.println(users);
		System.out.println("Program Ended.......!!!");

	}
}
