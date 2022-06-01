package udemyapp.daoimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import udemyapp.dao.CourseVideoDaoHibernate;
import udemyapp.model.CourseVideo;

@Component
public class CourseVideoDaoHibernateImpl implements CourseVideoDaoHibernate{
	
	@Autowired
	private HibernateTemplate hibernateTemplate;
	
	@Transactional
	public void createVideo(CourseVideo courseVideo) {
		this.hibernateTemplate.saveOrUpdate(courseVideo);
	}
}
