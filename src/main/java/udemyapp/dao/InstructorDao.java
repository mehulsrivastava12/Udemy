package udemyapp.dao;

import java.util.List;

import udemyapp.model.Course;

public interface InstructorDao {
	
	public void deleteInstructor(int id);
	public List<Course> getInstructorCourse(int id);
	public int validateInstructor(String email,String password);
}
