package udemyapp.dao;

public interface ILoginDao {

	boolean validateUser(String email, String password);
}
