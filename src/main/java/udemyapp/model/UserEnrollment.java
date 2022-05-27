package udemyapp.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class UserEnrollment {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int enrollmentId;
	private int userId;
	private int courseId;
	private String date;
	private String title;
	private int id;
	private String firstName;
	private String lastName;
	public int getEnrollmentId() {
		return enrollmentId;
	}
	public void setEnrollmentId(int enrollmentId) {
		this.enrollmentId = enrollmentId;
	}
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public int getCourseId() {
		return courseId;
	}
	public void setCourseId(int courseId) {
		this.courseId = courseId;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public UserEnrollment(int enrollmentId, int userId, int courseId, String date, String title, int id,
			String firstName, String lastName) {
		super();
		this.enrollmentId = enrollmentId;
		this.userId = userId;
		this.courseId = courseId;
		this.date = date;
		this.title = title;
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
	}
	public UserEnrollment() {
		super();
	}
	@Override
	public String toString() {
		return "UserEnrollment [enrollmentId=" + enrollmentId + ", userId=" + userId + ", courseId=" + courseId
				+ ", date=" + date + ", title=" + title + ", id=" + id + ", firstName=" + firstName + ", lastName="
				+ lastName + "]";
	}
	
}