package udemyapp.viewobjects;

public class EnrollCourseVideoViewObject {
	private int videoId;
	private String title;
	private String description;
	private String link;
	public int getVideoId() {
		return videoId;
	}
	public void setVideoId(int videoId) {
		this.videoId = videoId;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getLink() {
		return link;
	}
	public void setLink(String link) {
		this.link = link;
	}
	public EnrollCourseVideoViewObject(int videoId, String title, String description, String link) {
		super();
		this.videoId = videoId;
		this.title = title;
		this.description = description;
		this.link = link;
	}
	public EnrollCourseVideoViewObject() {
		super();

	}
	
	
}
