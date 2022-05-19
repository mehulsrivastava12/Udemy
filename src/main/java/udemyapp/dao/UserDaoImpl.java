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
import udemyapp.model.User;

@Component
public class UserDaoImpl implements UserDao{

	@Autowired
	private HibernateTemplate hibernateTemplate;
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	@Transactional
	public void createUser(User user) {
		this.hibernateTemplate.saveOrUpdate(user);
	}
	
	@Transactional
	public void deleteUser(int uid) {
		User u = this.hibernateTemplate.load(User.class, uid);
		this.hibernateTemplate.delete(u);
	}
	
	public User getUser(int uid) {
		return this.hibernateTemplate.load(User.class, uid);
	}

	public List<Course> getCourses() {
		List<Course> courses=this.hibernateTemplate.loadAll(Course.class);
		return courses;
	}

	public List<Course> getMyCourse(int uid) {
		String sql="select * from Course c JOIN UserEnrollment e ON c.cid=e.courseId AND e.userId=?";
		RowMapper<Course> rowMapper=new CourseRowMapperImpl();
		List<Course> myCourse=this.jdbcTemplate.query(sql,rowMapper,uid);
		return myCourse;
	}

	public List<Course> searchCourse(String title) {
		String sql="select * from Course where title=?";
		RowMapper<Course> rowMapper=new CourseRowMapperImpl();
		List<Course> allCourses=this.jdbcTemplate.query(sql,rowMapper,title);
		return allCourses;
	}

	public List<Instructor> searchInstructor(String instructor) {
		String sql="select firstName,lastname from Instructor where firstName=?";
		RowMapper<Instructor> rowMapper=new InstructorRowMapperImpl();
		List<Instructor> inst=this.jdbcTemplate.query(sql,rowMapper,sql);
		return inst;
	}
}
