package udemyapp.dao;



import udemyapp.model.Course;

public interface CourseDao {

	public void createCourse(Course course);
	public void deleteCourse(int id);
	public Course getCourse(int id);
}
