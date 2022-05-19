package udemyapp.dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import udemyapp.model.UserEnrollment;

public class EnrollmentRowMapper implements RowMapper<UserEnrollment> {
	
	public UserEnrollment mapRow(ResultSet rs,int rowNum) throws SQLException{
		UserEnrollment userEnrollment=new UserEnrollment();
		userEnrollment.setEnrollmentId(rs.getInt("enrollmentId"));
		userEnrollment.setCourseId(rs.getInt("courseId"));
		userEnrollment.setUserId(rs.getInt("userId"));
		userEnrollment.setDate(rs.getString("date"));
		return userEnrollment;
	}
}