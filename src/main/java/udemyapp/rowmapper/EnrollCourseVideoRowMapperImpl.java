package udemyapp.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import udemyapp.viewobjects.EnrollCourseVideoViewObject;

public class EnrollCourseVideoRowMapperImpl implements RowMapper<EnrollCourseVideoViewObject>{

	public EnrollCourseVideoViewObject mapRow(ResultSet rs, int rowNum) throws SQLException {
			EnrollCourseVideoViewObject enrollVideoViewObject=new EnrollCourseVideoViewObject();
			enrollVideoViewObject.setVideoId(rs.getInt("videoId"));
			enrollVideoViewObject.setTitle(rs.getString("title"));
			enrollVideoViewObject.setDescription(rs.getString("description"));
			enrollVideoViewObject.setLink(rs.getString("link"));
			return enrollVideoViewObject;
	}

}
