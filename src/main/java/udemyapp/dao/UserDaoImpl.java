package udemyapp.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import udemyapp.model.Course;
import udemyapp.model.Instructor;
import udemyapp.model.User;
import udemyapp.model.UserEnrollment;

@Component
public class UserDaoImpl implements UserDao{

	@Autowired
	private JdbcTemplate jdbcTemplate;
	

	public void createUser(User user) {
		String sql="INSERT INTO User VALUES (?, ?, ?, ?, ?, ?)";
		this.jdbcTemplate.update(sql);
	}
	
	public void enroll(UserEnrollment userEnrollment) {
		String sql="Insert Into UserEnrollment Values(?,?,?,?,?,?)";
		this.jdbcTemplate.update(sql);
	}
	
	public void deleteUser(int uid) {
		String sql1="DELETE from User where uid=?";
		String sql2="DELETE from UserEnrollment where userId=?";
		this.jdbcTemplate.update(sql1, uid);
		this.jdbcTemplate.update(sql2, uid);
	}

	public User getUser(int uid) {
		String sql="select * from User where uid=?";
		RowMapper<User> rowMapper=new UserRowMapperImpl();
		User user=this.jdbcTemplate.queryForObject(sql, rowMapper,uid);
		return user;
	}

	public List<Course> getCourses() {
		String sql="select * from Course";
		RowMapper<Course> rowMapper=new CourseRowMapperImpl();
		List<Course> courses=this.jdbcTemplate.query(sql,rowMapper);
		return courses;
	}

	public List<UserEnrollment> getMyCourse(int uid) {
		String sql="select * from UserEnrollment where userId=?";
		RowMapper<UserEnrollment> rowMapper=new EnrollmentRowMapperImpl();
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
		List<Instructor> searchInstructor=this.jdbcTemplate.query(sql,rowMapper,instructor);
		return searchInstructor;
	}
	
	public int validateUser(String email,String password) {
		try {
			int count=jdbcTemplate.queryForObject("select count(*) from User where email=? and password=?",Integer.class,email,password);
			int uid=jdbcTemplate.queryForObject("select uid from User where email=? and password=?",Integer.class,email,password);
			if(count==1) {
				return uid;
			}
			else {
				return 0;
			}
		} catch (Exception e) {
			return 0;
		}
	}
}
