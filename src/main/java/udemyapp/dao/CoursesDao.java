package udemyapp.dao;

import java.util.List;

import udemyapp.model.Course;

public interface CoursesDao {

	public void createCourse(Course course);
	public void deleteCourse(int id);
	public Course getCourse(int id);
	public List<Course> getAllCourse();
}
