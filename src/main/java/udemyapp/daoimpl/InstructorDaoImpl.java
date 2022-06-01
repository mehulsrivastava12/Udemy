package udemyapp.daoimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import udemyapp.dao.InstructorDao;
import udemyapp.model.Course;
import udemyapp.rowmapper.CourseRowMapperImpl;

@Component
public class InstructorDaoImpl implements InstructorDao{

	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	public void deleteInstructor(int instructorid) {
		String sql1="DELETE from Course where instructor_id=?";
		String sql2="DELETE from Instructor where instructor_id=?";
		this.jdbcTemplate.update(sql1,instructorid);
		this.jdbcTemplate.update(sql2, instructorid);
	}

	public List<Course> getInstructorCourse(int instructorId) {
		String sql="select * from Course where instructor_id=?";
		RowMapper<Course> rowMapper=new CourseRowMapperImpl();
		List<Course> instructorCourse=this.jdbcTemplate.query(sql,rowMapper,instructorId);
		return instructorCourse;
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
