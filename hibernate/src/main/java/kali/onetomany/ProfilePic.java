package kali.onetomany;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class ProfilePic {

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getPic_url() {
		return pic_url;
	}
	public void setPic_url(String pic_url) {
		this.pic_url = pic_url;
	}
	@Id @GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	private String pic_url;

}
