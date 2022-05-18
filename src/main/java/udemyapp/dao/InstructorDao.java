package udemyapp.dao;

import java.util.List;

import udemyapp.model.Course;
import udemyapp.model.Instructor;

public interface InstructorDao {

	public void createInstructor(Instructor instructor);
	public void deleteInstructor(int id);
	public Instructor getInstructor(int id);
	public List<Instructor> getAllInstructor();
	public List<Course> searchCourse(String title);
	public List<Course> getInstructorCourse(String email);
	public void addCourse(Course course);
	public void removeCourse(int cid);
}
