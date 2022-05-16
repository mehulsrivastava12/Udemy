package udemyapp.dao.impl;

import org.apache.catalina.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import udemyapp.dao.ILoginDao;

@Repository
public class LoginDaoImpl implements ILoginDao {

	@Autowired
	JdbcTemplate jdbcTemplate;
	public boolean validateUser(String email, String password) {
		
		int count=jdbcTemplate.queryForObject("select count(*) from User where email=? and password=?",User.class)
		return false;
	}

}
