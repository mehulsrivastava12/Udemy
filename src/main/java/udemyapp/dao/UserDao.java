package udemyapp.dao;
import java.util.List;

import udemyapp.model.Course;
import udemyapp.model.User;

public interface UserDao {

	public void createUser(User user);
	public void deleteUser(int id);
	public User getUser(int id);
	public List<Course> getCourses();
	public List<Course> getMyCourse(int uid);
	public List<Course> searchCourse(String title);
	public List<Course> searchInstructorCourse(String instructor);
}
