package udemyapp.dao;

import udemyapp.model.User;
import udemyapp.model.UserEnrollment;

public interface UserDaoHibernate {
	public void createUser(User user);
	public void enroll(UserEnrollment userEnrollment);
}
