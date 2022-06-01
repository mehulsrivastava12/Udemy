package udemyapp.dao;

import udemyapp.model.Course;
import udemyapp.model.Instructor;

public interface InstructorDaoHibernate {
	public void createInstructor(Instructor instructor);
	public Instructor getInstructor(int id);
	public void addCourse(Course course);
	public void removeCourse(int cid);
}
