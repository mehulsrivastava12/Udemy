package udemyapp.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import org.springframework.jdbc.core.RowMapper;

import udemyapp.model.Instructor;

public class InstructorRowMapperImpl implements RowMapper<Instructor>{
	
	public Instructor mapRow(ResultSet rs,int rowNum) throws SQLException{
		Instructor instructor=new Instructor();
		instructor.setId(rs.getInt("id"));
		instructor.setFirstName(rs.getString("firstName"));
		instructor.setLastName(rs.getString("lastName"));
		instructor.setDob(rs.getString("dob"));
		instructor.setEmail(rs.getString("email"));
		instructor.setPassword(rs.getString("password"));
		return instructor;
	}
}
