package udemyapp.daoimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import udemyapp.dao.InstructorDaoHibernate;
import udemyapp.model.Course;
import udemyapp.model.Instructor;

@Component
public class InstructorDaoHibernateImpl implements InstructorDaoHibernate{


	@Autowired
	private HibernateTemplate hibernateTemplate;
	
	@Transactional
	public void createInstructor(Instructor instructor) {
		this.hibernateTemplate.saveOrUpdate(instructor);
	}
	
	public Instructor getInstructor(int id) {
		return this.hibernateTemplate.get(Instructor.class, id);
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
