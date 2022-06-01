package udemyapp.daoimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import udemyapp.dao.CourseVideoDao;
import udemyapp.model.CourseVideo;
import udemyapp.rowmapper.CourseVideoRowMapperImpl;

@Component
public class CourseVideoDaoImpl implements CourseVideoDao {

	@Autowired
	private JdbcTemplate jdbcTemplate;

	public void deleteVideo(int videoId) {
		String sql="DELETE from CourseVideo where videoId=? ";
		this.jdbcTemplate.update(sql,videoId);
	}

	public List<CourseVideo> getVideo(int videoId) {
		String sql="Select * from CourseVideo where cid=?";
		RowMapper<CourseVideo> rowMapper=new CourseVideoRowMapperImpl();
		List<CourseVideo> courseVideo=this.jdbcTemplate.query(sql,rowMapper,videoId);
		return courseVideo;
	}

}
