package udemyapp.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Course {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int cid;
	private String title;
	private String description;
	private String link;
	private long price;
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
	public long getPrice() {
		return price;
	}
	public void setPrice(long price) {
		this.price = price;
	}
	public Course(int cid, String title, String description, String link, long price) {
		super();
		this.cid = cid;
		this.title = title;
		this.description = description;
		this.link = link;
		this.price = price;
	}
	public Course() {
		super();
	}
	@Override
	public String toString() {
		return "Course [cid=" + cid + ", title=" + title + ", description=" + description + ", link=" + link
				+ ", price=" + price + "]";
	}
	
}
