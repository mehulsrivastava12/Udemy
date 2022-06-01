package udemyapp.viewobjects;

import javax.persistence.Entity;

@Entity
public class EnrollViewObject {

	private int enrollmentId;
	private String title;
	private String firstName;
	private String lastName;
	private String date;
	public int getEnrollmentId() {
		return enrollmentId;
	}
	public void setEnrollmentId(int enrollmentId) {
		this.enrollmentId = enrollmentId;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
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
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public EnrollViewObject(int enrollmentId, String title, String firstName, String lastName, String date) {
		super();
		this.enrollmentId = enrollmentId;
		this.title = title;
		this.firstName = firstName;
		this.lastName = lastName;
		this.date = date;
	}
	public EnrollViewObject() {
		super();
	}
	@Override
	public String toString() {
		return "EnrollViewObject [enrollmentId=" + enrollmentId + ", title=" + title + ", firstName=" + firstName
				+ ", lastName=" + lastName + ", date=" + date + "]";
	}
	
	
}
