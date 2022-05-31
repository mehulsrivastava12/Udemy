package udemyapp.dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import udemyapp.model.CourseVideo;

public class CourseVideoRowMapperImpl implements RowMapper<CourseVideo> {
	public CourseVideo mapRow(ResultSet rs,int rowNum) throws SQLException{
		CourseVideo courseVideo= new CourseVideo();
		courseVideo.setVideoId(rs.getInt("videoId"));
		courseVideo.setCid(rs.getInt("cid"));
		courseVideo.setTitle(rs.getString("title"));
		courseVideo.setDescription(rs.getString("description"));
		courseVideo.setLink(rs.getString("link"));
		return courseVideo;
	}
}
