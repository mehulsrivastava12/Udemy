package udemyapp.dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import udemyapp.model.User;

public class UserRowMapperImpl implements RowMapper<User> {
	
	public User mapRow(ResultSet rs,int rowNum) throws SQLException{
		User user=new User();
		user.setUid(rs.getInt("uid"));
		user.setFirstName(rs.getString("firstName"));
		user.setLastName(rs.getString("lastName"));
		user.setEmail(rs.getString("email"));
		user.setDob(rs.getString("dob"));
		user.setPassword(rs.getString("password"));
		return user;
	}

}
