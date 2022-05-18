package udemyapp.dao;
import java.util.List;

import udemyapp.model.User;

public interface UserDao {

	public void createUser(User user);
	public void deleteUser(int id);
	public User getUser(int id);
	public List<User> getAllUser();
	
}
