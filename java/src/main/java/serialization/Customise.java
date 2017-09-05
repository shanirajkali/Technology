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
 * bit difficult topic in serialisation 
 * need of customised serialisation is when we make some variables are transient because of security purpose
 * then at the time of serialisation transient variables value stores as null then how we will get back transient 
 * variable value to overcome these problems we goes for customise serialisation 
 */
class Account implements Serializable{
	String userName="Shani";
	transient String password="kali";
	
	/**
	 * this is the callback method will call automatically at time of serialisation
	 * whenever we have to do some extra work save with serialisation object we did that in writeObject() method
	 */
	private void writeObject(ObjectOutputStream os)throws Exception{
		os.defaultWriteObject();
		String encryptedPassword="123"+password;
		os.writeObject(encryptedPassword);
	}
	
	private void readObject(ObjectInputStream is) throws Exception{
		is.defaultReadObject();
		String encryptedPassword=(String)is.readObject();
		password=encryptedPassword.substring(3);
	}
	
	@Override
	public String toString(){
		return "{ User Name:'"+userName+"' Password:'"+password+"' }";
	}
}
public class Customise {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		Account d=new Account();
		File f=new File("src/main/java/serialization/serialization.txt");
		System.out.println(f.exists());
		FileOutputStream fos=new FileOutputStream(f);
		ObjectOutputStream oos=new ObjectOutputStream(fos);
		oos.writeObject(d);
		oos.close();
		
		FileInputStream fis=new FileInputStream(f);
		ObjectInputStream ois=new ObjectInputStream(fis);
		Account d2=(Account) ois.readObject();
		System.out.println(d2);

	}

}
