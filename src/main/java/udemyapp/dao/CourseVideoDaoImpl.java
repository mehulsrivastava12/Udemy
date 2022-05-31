package udemyapp.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import udemyapp.model.CourseVideo;

@Component
public class CourseVideoDaoImpl implements CourseVideoDao {
	
	@Autowired
	private HibernateTemplate hibernateTemplate;
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	@Transactional
	public void createVideo(CourseVideo courseVideo) {
		this.hibernateTemplate.saveOrUpdate(courseVideo);
	}

	@Transactional
	public void deleteVideo(int videoId) {
		CourseVideo courseVideo=this.hibernateTemplate.load(CourseVideo.class, videoId);
		this.hibernateTemplate.delete(courseVideo);
	}

	public List<CourseVideo> getVideo(int videoId) {
		String sql="Select * from CourseVideo where cid=?";
		RowMapper<CourseVideo> rowMapper=new CourseVideoRowMapperImpl();
		List<CourseVideo> courseVideo=this.jdbcTemplate.query(sql,rowMapper,videoId);
		return courseVideo;
	}

}
