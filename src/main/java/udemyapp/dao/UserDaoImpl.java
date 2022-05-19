package udemyapp.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import com.spring.jdbc.dao.RowMapperImpl;
import com.spring.jdbc.entities.Student;

import udemyapp.model.Course;
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
		String sql="select * from Course wehre cid=?";
		List<Course> courses = this.jdbcTemplate.query(sql,new CourseRowMapperImpl());
		return courses;
	}

	public List<Course> searchCourse(String title) {
		String sql="select * from Course where title=?";
		List<Course> allCourses=this.jdbcTemplate.query(sql,new CourseRowMapperImpl());
		return allCourses;
	}

	public List<Course> searchInstructorCourse(String instructor) {
		String sql="select * from Course";
		List<Course> instructorCourses=this.jdbcTemplate.query(sql,new CourseRowMapperImpl());
		return instructorCourses;
	}
}
