package udemyapp.main;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import udemyapp.dao.CourseDao;
import udemyapp.dao.EnrollmentDao;
import udemyapp.dao.InstructorDao;
import udemyapp.dao.InstructorDaoHibernate;
import udemyapp.dao.UserDao;
import udemyapp.dao.UserDaoHibernate;
import udemyapp.model.Course;
import udemyapp.model.Instructor;
import udemyapp.model.User;
import udemyapp.model.UserEnrollment;
import udemyapp.viewobjects.EnrollViewObject;

public class App {
		
	public static void main(String [] args) {
		System.out.println("Program Started.......!!!");
		ApplicationContext context=new ClassPathXmlApplicationContext("udemyapp/main/config.xml");
		
		InstructorDao instructorDao = context.getBean(InstructorDao.class);
		
		InstructorDaoHibernate instructorDaoHibernate = context.getBean(InstructorDaoHibernate.class);
		
		UserDaoHibernate userDaoHibernate = context.getBean(UserDaoHibernate.class);
		
		UserDao userDao = context.getBean(UserDao.class);
		
		CourseDao courseDao = context.getBean(CourseDao.class);
		
		EnrollmentDao enrollmentDao=context.getBean(EnrollmentDao.class);
		
		User user=new User(1,"Mehul","Srivastava","12/12/2000","mhsri.1212@gmail.com","mehul");
		userDaoHibernate.createUser(user);
		
		UserEnrollment enrolluser=new UserEnrollment(1,1,2,"10/05/2017",2);
		userDaoHibernate.enroll(enrolluser);
		
		User us=userDao.getUser(1);
		System.out.println(us);
		
		List<Course> cs=userDao.getCourses();
		System.out.println(cs);
		
		List<EnrollViewObject> ue=userDao.getMyCourse(1);
		System.out.println(ue);
		
		List<Course> co=userDao.searchCourse("Java Core");
		System.out.println(co);
		
		List<Instructor> ci=userDao.searchInstructor("Sharad");
		System.out.println(ci);
		
		Instructor i=new Instructor(2,"Raj","Patel","01/06/1982","mnm891@gmail.com","raj");
		instructorDaoHibernate.createInstructor(i);
		
		Instructor instruct=instructorDaoHibernate.getInstructor(2);
		System.out.println(instruct);
		
		List<Course> instructorCourse=instructorDao.getInstructorCourse(2);
		System.out.println(instructorCourse);
		
		Course course=new Course(1,"Java Core","Core Java is used for developing computing or desktop applications. Advance Java is used for developing enterprise applications. It is the first step, to begin with, Java.",1500,3);
		instructorDaoHibernate.addCourse(course);
		System.out.println("Program Ended.......!!!");

	}
}
