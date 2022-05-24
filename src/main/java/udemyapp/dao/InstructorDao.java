package udemyapp.dao;

import java.util.List;

import udemyapp.model.Course;
import udemyapp.model.Instructor;

public interface InstructorDao {

	public void createInstructor(Instructor instructor);
	public void deleteInstructor(int id);
	public Instructor getInstructor(int id);
	public List<Course> getInstructorCourse(int id);
	public void addCourse(Course course);
	public void removeCourse(int cid);
	public int validateInstructor(String email,String password);
}
