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
	private int id;
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
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public UserEnrollment(int enrollmentId, int userId, int courseId, String date, int id) {
		super();
		this.enrollmentId = enrollmentId;
		this.userId = userId;
		this.courseId = courseId;
		this.date = date;
		this.id = id;
	}
	public UserEnrollment() {
		super();
	}
	@Override
	public String toString() {
		return "UserEnrollment [enrollmentId=" + enrollmentId + ", userId=" + userId + ", courseId=" + courseId
				+ ", date=" + date + ", id=" + id + "]";
	}

	
}