package udemyapp.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import udemyapp.model.Course;
import udemyapp.model.Instructor;

@Component
public class InstructorDaoImpl implements InstructorDao{

	@Autowired
	private HibernateTemplate hibernateTemplate;
	
	@Transactional
	public void createInstructor(Instructor instructor) {
		this.hibernateTemplate.saveOrUpdate(instructor);
	}
	
	@Transactional
	public void deleteInstructor(int uid) {
		Instructor i = this.hibernateTemplate.load(Instructor.class, uid);
		this.hibernateTemplate.delete(i);
	}
	
	public Instructor getInstructor(int uid) {
		return this.hibernateTemplate.load(Instructor.class, uid);
	}

	public List<Course> searchAll(String title) {
		List<Course> Search =this.hibernateTemplate.loadAll(Course.class); 
		return Search;
	}

	public List<Course> getInstructorCourse(int id) {
		List<Course> allCourse=this.hibernateTemplate.loadAll(Course.class);
		return allCourse;
	}

	@Transactional
	public void addCourse(Course course) {
		this.hibernateTemplate.saveOrUpdate(course);
	}

	@Transactional
	public void removeCourse(int cid) {
		Course c=this.hibernateTemplate.load(Course.class, cid);
		this.hibernateTemplate.delete(c);
	}

}
