package udemyapp.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import udemyapp.model.Instructor;

@Component
public class InstructorDao {

	@Autowired
	private HibernateTemplate hibernateTemplate;
	
	@Transactional
	public void createInstructor(Instructor instructor) {
		this.hibernateTemplate.saveOrUpdate(instructor);
	}
	
	public List<Instructor> getAllInstructor(){
		List<Instructor> users=this.hibernateTemplate.loadAll(Instructor.class);
		return users;
	}
	
	@Transactional
	public void deleteInstructor(int uid) {
		Instructor i = this.hibernateTemplate.load(Instructor.class, uid);
		this.hibernateTemplate.delete(i);
	}
	
	public Instructor getInstructor(int uid) {
		return this.hibernateTemplate.load(Instructor.class, uid);
	}
}
