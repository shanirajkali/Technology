package kali.application;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity(name="STUDENT_DETAILS")
public class Student {
	@Id
	@Column(name="STUDENT_ID")
	private int id;
	
	@Column(name="ROLL_NO")
	private int roll_no;
	
	@Column(name="STUDENT_NAME")
	private String name;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getRoll_no() {
		return roll_no;
	}
	public void setRoll_no(int roll_no) {
		this.roll_no = roll_no;
	}
	public String getName() {
		return name;
	}
	public void setName(String string) {
		this.name = string;
	}
}
