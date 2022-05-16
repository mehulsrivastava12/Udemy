package udemyapp.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import udemyapp.model.Course;

@Component
public class CourseDao {

	@Autowired
	private HibernateTemplate hibernateTemplate;
	
	@Transactional
	public void createCourse(Course course) {
		this.hibernateTemplate.saveOrUpdate(course);
	}
	
	public List<Course> getAllCourse(){
		List<Course> courses=this.hibernateTemplate.loadAll(Course.class);
		return courses;
	}
	
	@Transactional
	public void deleteCourse(int cid) {
		Course c = this.hibernateTemplate.load(Course.class, cid);
		this.hibernateTemplate.delete(c);
	}
	
	public Course getCourse(int cid) {
		return this.hibernateTemplate.load(Course.class, cid);
	}
}
