package kali.elementcollection;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class UserDetails2 {
	
	@Id @GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	
	private String name;
	
	@ElementCollection
	private Set<AddressExample2> listOfAddress=new HashSet();

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Set<AddressExample2> getListOfAddress() {
		return listOfAddress;
	}

	public void setListOfAddress(Set<AddressExample2> listOfAddress) {
		this.listOfAddress = listOfAddress;
	}
}
