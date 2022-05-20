package udemyapp.dao;

import udemyapp.model.UserEnrollment;

public interface EnrollmentDao {

	public void Enroll(UserEnrollment userEnrollment);
	public void deleteUser(int enrollmentId);
	public UserEnrollment getUser(int enrollmentId);
}
