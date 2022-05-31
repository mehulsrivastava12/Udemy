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
	
	public void deleteInstructor(int id) {
		String sql1="DELETE from Course where id=?";
		String sql2="DELETE from Instructor where id=?";
		this.jdbcTemplate.update(sql1, id);
		this.jdbcTemplate.update(sql2, id);
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
	
	public int validateInstructor(String email,String password) {
		try {
			int count=jdbcTemplate.queryForObject("select count(*) from Instructor where email=? and password=?",Integer.class,email,password);
			int id=jdbcTemplate.queryForObject("select id from Instructor where email=? and password=?",Integer.class,email,password);
			if(count==1) {
				return id;
			}
			else {
				return 0;
			}
		} catch (Exception e) {
			return 0;
		}
	}

}
