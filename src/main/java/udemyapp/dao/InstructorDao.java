package udemyapp.dao;

import java.util.List;

import udemyapp.model.Instructor;

public interface InstructorDao {

	public void createInstructor(Instructor instructor);
	public void deleteInstructor(int id);
	public Instructor getInstructor(int id);
	public List<Instructor> getAllInstructor();
}
