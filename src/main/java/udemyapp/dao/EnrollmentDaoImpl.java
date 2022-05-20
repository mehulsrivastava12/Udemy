package udemyapp.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import udemyapp.model.UserEnrollment;

@Component	
public class EnrollmentDaoImpl implements EnrollmentDao{

	@Autowired
	private HibernateTemplate hibernateTemplate;
	
	@Transactional
	public void Enroll(UserEnrollment userEnrollment) {
		this.hibernateTemplate.saveOrUpdate(userEnrollment);
	}

	@Transactional
	public void deleteUser(int enrollmentId) {
		UserEnrollment eid = this.hibernateTemplate.load(UserEnrollment.class, enrollmentId);
		this.hibernateTemplate.delete(eid);
	}

	public UserEnrollment getUser(int enrollmentId) {
		return this.hibernateTemplate.load(UserEnrollment.class, enrollmentId);
	}


}
