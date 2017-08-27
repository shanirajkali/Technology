package kali.embaded;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class UserAccount {
	
	@Id @GeneratedValue(strategy=GenerationType.AUTO)
	private int userid;
	private String username;
	@Embedded
	private Address address;
	@Embedded
	@AttributeOverrides({
		@AttributeOverride(name="street" ,column=@Column(name="home_street")),
		@AttributeOverride(name="state" ,column=@Column(name="home_state")),
		@AttributeOverride(name="city" ,column=@Column(name="home_city")),
		@AttributeOverride(name="pincode" ,column=@Column(name="home_pincode"))
	})
	private Address homeAddress;
	public Address getHomeAddress() {
		return homeAddress;
	}
	public void setHomeAddress(Address homeAddress) {
		this.homeAddress = homeAddress;
	}
	public int getUserid() {
		return userid;
	}
	public void setUserid(int userid) {
		this.userid = userid;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}

}
