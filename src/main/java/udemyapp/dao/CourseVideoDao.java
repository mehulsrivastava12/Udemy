package udemyapp.dao;

import java.util.List;
import udemyapp.model.CourseVideo;

public interface CourseVideoDao {

	public void createVideo(CourseVideo courseVideo);
	public void deleteVideo(int videoId);
	public List<CourseVideo> getVideo(int videoId);
}
