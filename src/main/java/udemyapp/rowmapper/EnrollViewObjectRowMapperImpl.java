package udemyapp.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import udemyapp.viewobjects.EnrollViewObject;

public class EnrollViewObjectRowMapperImpl implements RowMapper<EnrollViewObject> {

	public EnrollViewObject mapRow(ResultSet rs,int rowNum) throws SQLException{
		EnrollViewObject enrollViewObject=new EnrollViewObject();
		enrollViewObject.setEnrollmentId(rs.getInt("enrollmentId"));
		enrollViewObject.setTitle(rs.getString("title"));
		enrollViewObject.setFirstName(rs.getString("firstName"));
		enrollViewObject.setLastName(rs.getString("lastName"));
		enrollViewObject.setDate(rs.getString("date"));
		enrollViewObject.setCid(rs.getInt("cid"));
		return enrollViewObject;
	}
}
