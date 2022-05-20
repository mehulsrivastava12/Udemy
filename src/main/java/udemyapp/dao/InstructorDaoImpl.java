package udemyapp.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import udemyapp.model.Course;
import udemyapp.model.Instructor;

@Component
public class InstructorDaoImpl implements InstructorDao{

	@Autowired
	private HibernateTemplate hibernateTemplate;
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	@Transactional
	public void createInstructor(Instructor instructor) {
		this.hibernateTemplate.saveOrUpdate(instructor);
	}
	
	@Transactional
	public void deleteInstructor(int id) {
		Instructor i = this.hibernateTemplate.load(Instructor.class, id);
		this.hibernateTemplate.delete(i);
	}
	
	public Instructor getInstructor(int id) {
		return this.hibernateTemplate.get(Instructor.class, id);
	}

	public List<Course> getInstructorCourse(int id) {
		String sql="select * from Course where id=?";
		RowMapper<Course> rowMapper=new CourseRowMapperImpl();
		List<Course> instructorCourse=this.jdbcTemplate.query(sql,rowMapper,id);
		return instructorCourse;
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
