package udemyapp.daoimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import udemyapp.dao.CourseDao;
import udemyapp.model.Course;

@Component
public class CourseDaoImpl implements CourseDao {

	@Autowired
	private HibernateTemplate hibernateTemplate;
	
	@Transactional
	public void createCourse(Course course) {
		this.hibernateTemplate.saveOrUpdate(course);
	}
	
	@Transactional
	public void deleteCourse(int cid) {
		Course c = this.hibernateTemplate.load(Course.class, cid);
		this.hibernateTemplate.delete(c);
	}
	
	public Course getCourse(int cid) {
		return this.hibernateTemplate.get(Course.class, cid);
	}
}
