package serialization;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

/**
 * @author shani
 * if parent is Serializable automatically every child will be serializable 
 * case 1: class Parent implements Serializable
 *		   class Child extends Parent
 */

class Parent implements Serializable{
	int p=10;
}
class Child extends Parent{
	int c=20;
	
	public String toString(){
		return p+" "+c;
	}
}
public class SerialisationWithInheritance {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		
		//case 1 Start:
		Child d=new Child();
		File f=new File("src/main/java/serialization/serialization.txt");
		System.out.println(f.exists());
		FileOutputStream fos=new FileOutputStream(f);
		ObjectOutputStream oos=new ObjectOutputStream(fos);
		oos.writeObject(d);
		oos.close();
		
		FileInputStream fis=new FileInputStream(f);
		ObjectInputStream ois=new ObjectInputStream(fis);
		Child d2=(Child) ois.readObject();
		System.out.println(d2);
		//Case 1 Ends:
	}

}
