package udemyapp.dao.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import udemyapp.dao.ILoginDao;

@Repository
public class LoginDaoImpl implements ILoginDao {

	@Autowired
	JdbcTemplate jdbcTemplate;
	public boolean validateUser(String email, String password) {
		int count=jdbcTemplate.queryForObject("select count(*) from User where email=? and password=?",Integer.class,email,password);
		if(count==1)
			return true;
		else
		return false;
	}
	
	public boolean validateInstructor(String email, String password) {
		int count1=jdbcTemplate.queryForObject("select count(*) from Instructor where email=? and password=?",Integer.class,email,password);
		if(count1==1)
			return true;
		else
		return false;
	}

}
