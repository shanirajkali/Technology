package kali.onetomany;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Account {

	@Id @GeneratedValue(strategy=GenerationType.AUTO)
	private int user_id;
	private String user_name;
	@OneToMany
	private Collection<ProfilePic> user_profile_pics=new ArrayList<ProfilePic>();


	
	public int getUser_id() {
		return user_id;
	}
	public void setUser_id(int user_id) {
		this.user_id = user_id;
	}
	public String getUser_name() {
		return user_name;
	}
	public void setUser_name(String user_name) {
		this.user_name = user_name;
	}
	public Collection<ProfilePic> getUser_profile_pics() {
		return user_profile_pics;
	}
	public void setUser_profile_pics(Collection<ProfilePic> user_profile_pics) {
		this.user_profile_pics = user_profile_pics;
	}




}