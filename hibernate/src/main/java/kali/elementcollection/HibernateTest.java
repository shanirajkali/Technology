package kali.elementcollection;

import java.util.HashSet;
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateTest {

	public static void main(String[] args) {
		
		AddressExample2 address1=new AddressExample2();
		AddressExample2 address2=new AddressExample2();
		AddressExample2 address3=new AddressExample2();
		AddressExample2 address4=new AddressExample2();
		
		Set<AddressExample2> add=new HashSet();
		
		add.add(address1);
		add.add(address2);
		add.add(address3);
		add.add(address4);
		
		UserDetails2 ud=new UserDetails2();
		ud.setListOfAddress(add);
		ud.setName("shani raj kali");
		
		SessionFactory sf=new Configuration().configure().buildSessionFactory();
		Session session=sf.openSession();
		session.beginTransaction();
		session.save(ud);
		session.getTransaction().commit();
		

	}

}
