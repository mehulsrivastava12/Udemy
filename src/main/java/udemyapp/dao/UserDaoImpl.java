package udemyapp.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;
import udemyapp.model.User;

@Component
public class UserDaoImpl implements UserDao{

	@Autowired
	private HibernateTemplate hibernateTemplate;
	
	@Transactional
	public void createUser(User user) {
		this.hibernateTemplate.saveOrUpdate(user);
	}
	
	public List<User> getAllUser(){
		List<User> users=this.hibernateTemplate.loadAll(User.class);
		return users;
	}
	
	@Transactional
	public void deleteUser(int uid) {
		User u = this.hibernateTemplate.load(User.class, uid);
		this.hibernateTemplate.delete(u);
	}
	
	public User getUser(int uid) {
		return this.hibernateTemplate.load(User.class, uid);
	}
}