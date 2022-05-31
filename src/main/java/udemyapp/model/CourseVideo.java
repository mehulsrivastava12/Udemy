package udemyapp.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class CourseVideo {
	@Id
	@GeneratedValue(strategy =GenerationType.AUTO)
	private int videoId;
	private int cid;
	private String title;
	private String description;
	private String link;
	public int getVideoId() {
		return videoId;
	}
	public void setVideoId(int videoId) {
		this.videoId = videoId;
	}
	public int getCid() {
		return cid;
	}
	public void setCid(int cid) {
		this.cid = cid;
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
	public CourseVideo(int videoId, int cid, String title, String description, String link) {
		super();
		this.videoId = videoId;
		this.cid = cid;
		this.title = title;
		this.description = description;
		this.link = link;
	}
	public CourseVideo() {
		super();
	}
	
	@Override
	public String toString() {
		return "CourseVideo [videoId=" + videoId + ", cid=" + cid + ", title=" + title + ", description=" + description
				+ ", link=" + link + "]";
	}
	
}
