package udemyapp.daoimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import udemyapp.dao.UserDaoHibernate;
import udemyapp.model.User;
import udemyapp.model.UserEnrollment;

@Component
public class UserDaoHibernateImpl implements UserDaoHibernate {
	@Autowired
	private HibernateTemplate hibernateTemplate;

	@Transactional
	public void createUser(User user) {
		this.hibernateTemplate.saveOrUpdate(user);
	}

	@Transactional
	public void enroll(UserEnrollment userEnrollment) {
		this.hibernateTemplate.saveOrUpdate(userEnrollment);
	}
}
