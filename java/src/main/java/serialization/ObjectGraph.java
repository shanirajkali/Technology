package serialization;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Dog1 implements Serializable{
	int age=2;
	//static variable does not participate in serialisation
	static int month=11;
	final int week=22;
	transient int day=31;
	String name="jacky";
	
	Cat1 c=new Cat1();
	
	public  String toString(){
		return "default variable age:'2': "+age+"default variable Name:'jacky': "
					+name+" static variable month:'11': "
					+month+" final variable week:'22': "
					+week+" transient variable day:'31': "+day+c.toString();
	}
	
}

class Cat1 implements Serializable{
	int age=2;
	//static variable does not participate in serialisation
	static int month=11;
	final int week=22;
	transient int day=31;
	String name="Cat";
	
	Rat1 r=new Rat1();
	
	public  String toString(){
		return "default variable age:'2': "+age+"default variable Name:'jacky': "
					+name+" static variable month:'11': "
					+month+" final variable week:'22': "
					+week+" transient variable day:'31': "+day+r.toString();
	}
	
}

class Rat1 implements Serializable{
	int age=1;
	//static variable does not participate in serialisation
	static int month=10;
	final int week=22;
	transient int day=31;
	String name="RAT";
	
	public  String toString(){
		return "default variable age:'2': "+age+"default variable Name:'jacky': "
					+name+" static variable month:'11': "
					+month+" final variable week:'22': "
					+week+" transient variable day:'31': "+day;
	}
	
}

/**
 * 
 * @author shani
 * when we have object under the object and tries to serialise that object called object graph serialisation
 * when we have object under object then which object having object will also serialise
 */
public class ObjectGraph {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
        Dog1 d=new Dog1();
		
		File f=new File("src/main/java/serialization/serialization.txt");
		System.out.println(f.exists());
		FileOutputStream fos=new FileOutputStream(f);
		ObjectOutputStream oos=new ObjectOutputStream(fos);
		oos.writeObject(d);
		oos.close();
		
		FileInputStream fis=new FileInputStream(f);
		ObjectInputStream ois=new ObjectInputStream(fis);
		Dog1 d2=(Dog1) ois.readObject();
		System.out.println(d2);

	}

}
