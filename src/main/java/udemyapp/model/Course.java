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
	private long price;
	private int instructor_id;
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
	public long getPrice() {
		return price;
	}
	public void setPrice(long price) {
		this.price = price;
	}
	public int getInstructor_id() {
		return instructor_id;
	}
	public void setInstructor_id(int instructor_id) {
		this.instructor_id = instructor_id;
	}
	public Course(int cid, String title, String description, long price, int instructor_id) {
		super();
		this.cid = cid;
		this.title = title;
		this.description = description;
		this.price = price;
		this.instructor_id = instructor_id;
	}
	public Course() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Course [cid=" + cid + ", title=" + title + ", description=" + description + ", price=" + price
				+ ", instructor_id=" + instructor_id + "]";
	}
	
}
