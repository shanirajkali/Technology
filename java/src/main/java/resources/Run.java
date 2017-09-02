package resources;

import java.awt.*;
import java.io.File;

import javax.swing.JFrame;

public class Run extends JFrame{
	
	private void setGui(){
		try{
			setLocation(0,100);
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File file = new File("src/main/java/resources/ts.txt");
		System.out.println(file.exists());
	}

}
