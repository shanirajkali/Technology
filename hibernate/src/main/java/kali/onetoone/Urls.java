package kali.onetoone;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

@Entity
public class Urls {

	
	public String getPic_url() {
		return pic_url;
	}
	public void setPic_url(String pic_url) {
		this.pic_url = pic_url;
	}
	
	@OneToOne
	private Acc foreignKey;
	
	public Acc getForeignKey() {
		return foreignKey;
	}
	public void setForeignKey(Acc foreignKey) {
		this.foreignKey = foreignKey;
	}

	@Id @GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	private String pic_url;

}