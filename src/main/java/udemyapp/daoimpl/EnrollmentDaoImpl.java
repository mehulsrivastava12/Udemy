package udemyapp.daoimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import udemyapp.dao.EnrollmentDao;
import udemyapp.model.UserEnrollment;

@Component	
public class EnrollmentDaoImpl implements EnrollmentDao{

	@Autowired
	private HibernateTemplate hibernateTemplate;
	
	@Transactional
	public void enroll(UserEnrollment userEnrollment) {
		this.hibernateTemplate.saveOrUpdate(userEnrollment);
	}
}
