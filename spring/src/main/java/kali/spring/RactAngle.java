package kali.spring;

public class RactAngle {
	private String type;
	private int area;
	
	RactAngle(String type){
		this.type=type;
	}
	
	RactAngle(int area){
		this.area=area;
	}
	RactAngle(int area,String type){
		this.area=area;
		this.type=type;
	}
	public int getArea() {
		return area;
	}
	public String getType() {
		return type;
	}
	

}
