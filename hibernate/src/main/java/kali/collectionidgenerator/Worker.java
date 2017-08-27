package kali.collectionidgenerator;

import java.util.ArrayList;
import java.util.Collection;

import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.Column;

import org.hibernate.annotations.CollectionId;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Type;
import javax.persistence.JoinColumn;

@Entity
public class Worker {
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Collection<Address> getAdd() {
		return add;
	}

	public void setAdd(Collection<Address> add) {
		this.add = add;
	}

	private String name;
	@Id @GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	
	@ElementCollection
	@JoinTable(name="worker_address", joinColumns=@JoinColumn(name="worker_id"))
	@GenericGenerator(name="hilo-gen",strategy="hilo")
	@CollectionId(columns={@Column(name="address_id")},generator="hilo-gen",type=@Type(type="long"))
	private Collection<Address> add=new ArrayList<Address>();
	

}
