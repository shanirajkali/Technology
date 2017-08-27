package kali.embaded;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class App {

	public static void main(String[] args) {
		
		Address add=new Address();
		add.setCity("meerut");
		add.setPincode("250001");
		add.setState("Uttar Pradesh");
		add.setStreet("D-80 Ganga Nagar");
		
		Address addHome=new Address();
		addHome.setCity("durgapur");
		addHome.setPincode("713209");
		addHome.setState("West Bengal");
		addHome.setStreet("Hall 9 NIT");
		
		UserAccount ua=new UserAccount();
		ua.setAddress(add);
		ua.setUsername("Shani raj kali");
		ua.setHomeAddress(addHome);
		
		SessionFactory sf=new Configuration().configure().buildSessionFactory();
		Session session=sf.openSession();
		session.beginTransaction();
		session.save(ua);
		session.getTransaction().commit();
	}
}
