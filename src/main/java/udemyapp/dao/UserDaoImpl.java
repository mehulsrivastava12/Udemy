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
import udemyapp.model.UserEnrollment;

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
	public void enroll(UserEnrollment userEnrollment) {
		this.hibernateTemplate.saveOrUpdate(userEnrollment);
	}
	
	@Transactional
	public void deleteUser(int uid) {
		User u = this.hibernateTemplate.load(User.class, uid);
		this.hibernateTemplate.delete(u);
	}
	
	public User getUser(int uid) {
		return this.hibernateTemplate.get(User.class, uid);
	}

	public List<Course> getCourses() {
		List<Course> courses=this.hibernateTemplate.loadAll(Course.class);
		return courses;
	}

	public List<UserEnrollment> getMyCourse(int uid) {
		String sql="select * from UserEnrollment where userId=?";
		RowMapper<UserEnrollment> rowMapper=new EnrollmentRowMapper();
		List<UserEnrollment> myCourse=this.jdbcTemplate.query(sql,rowMapper,uid);
		return myCourse;
	}

	public List<Course> searchCourse(String title) {
		String sql="select * from Course where title=?";
		RowMapper<Course> rowMapper=new CourseRowMapperImpl();
		List<Course> allCourses=this.jdbcTemplate.query(sql,rowMapper,title);
		return allCourses;
	}

	public List<Instructor> searchInstructor(String instructor) {
		String sql="select * from Instructor where firstName=?";
		RowMapper<Instructor> rowMapper=new InstructorRowMapperImpl();
		List<Instructor> inst=this.jdbcTemplate.query(sql,rowMapper,instructor);
		return inst;
	}
	
	public int validateUser(String email,String password) {
		int count=jdbcTemplate.queryForObject("select count(*) from User where email=? and password=?",Integer.class,email,password);
		int uid=jdbcTemplate.queryForObject("select uid from User where email=? and password=?",Integer.class,email,password);
		if(count==1) {
			return uid;
		}
		else {
			return 0;
		}
	}
}
