package udemyapp.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import org.springframework.jdbc.core.RowMapper;

import udemyapp.model.Course;

public class CourseRowMapperImpl implements RowMapper<Course> {
	
	public Course mapRow(ResultSet rs, int rowNum) throws SQLException {
		Course course =new Course();
		course.setCid(rs.getInt("cid"));
		course.setTitle("title");
		course.setDescription(rs.getString("description"));
		course.setPrice(rs.getLong("price"));
		course.setLink(rs.getString("link"));
		return course;
	}

}
