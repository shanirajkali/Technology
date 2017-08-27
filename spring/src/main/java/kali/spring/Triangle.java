package kali.spring;

public class Triangle {
	private String type;
	private String whatIsThis;


	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}
	

	public void draw(){
		System.out.println("Triangle Drawn");
	}

}
