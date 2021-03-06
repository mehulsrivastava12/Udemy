package udemyapp.dao;
import java.util.List;

import udemyapp.model.Course;
import udemyapp.model.Instructor;
import udemyapp.model.User;
import udemyapp.viewobjects.EnrollCourseVideoViewObject;
import udemyapp.viewobjects.EnrollViewObject;

public interface UserDao {

	public void deleteUser(int uid);
	public User getUser(int uid);
	public List<Course> getCourses();
	public List<EnrollViewObject> getMyCourse(int userid);
	public List<EnrollCourseVideoViewObject> getMyVideo(int cid);
	public List<Course> searchCourse(String title);
	public List<Instructor> searchInstructor(String instructor);
	public int validateUser(String email,String password);
}
