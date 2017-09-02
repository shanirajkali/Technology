package serialization;


import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Dog implements Serializable{
	int age=2;
	//static variable does not participate in serialisation
	static int month=11;
	final int week=22;
	transient int day=31;
	String name="jacky";
	
	public  String toString(){
		return "default variable age:'2': "+age+"default variable Name:'jacky': "
					+name+" static variable month:'11': "
					+month+" final variable week:'22': "
					+week+" transient variable day:'31': "+day;
	}
	
}

class Cat implements Serializable{
	int age=2;
	//static variable does not participate in serialisation
	static int month=11;
	final int week=22;
	transient int day=31;
	String name="Cat";
	
	public  String toString(){
		return "default variable age:'2': "+age+"default variable Name:'jacky': "
					+name+" static variable month:'11': "
					+month+" final variable week:'22': "
					+week+" transient variable day:'31': "+day;
	}
	
}

class Rat implements Serializable{
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
 * @author shani
 * we can serialise any no of object into file but we should learn about order in which we did serialise
 */
public class Example {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		Dog d=new Dog();
		
		File f=new File("src/main/java/serialization/serialization.txt");
		System.out.println(f.exists());
		FileOutputStream fos=new FileOutputStream(f);
		ObjectOutputStream oos=new ObjectOutputStream(fos);
		oos.writeObject(d);
		oos.writeObject(new Cat());
		oos.writeObject(new Rat());
		oos.close();
		
		FileInputStream fis=new FileInputStream(f);
		ObjectInputStream ois=new ObjectInputStream(fis);
		Dog d2=(Dog) ois.readObject();
		System.out.println(d2);
		System.out.println((Cat)ois.readObject());
		//System.out.println((Rat)ois.readObject());
		
		//if we don't no order of object at the time of de serialisation then we can use parent reference
		Object o=ois.readObject();
		if(o instanceof Dog)
			System.out.println((Dog)o);
		else if(o instanceof Cat)
			System.out.println((Rat)o);
		else if(o instanceof Rat)
			System.out.println((Rat)o);
		

	}
}
