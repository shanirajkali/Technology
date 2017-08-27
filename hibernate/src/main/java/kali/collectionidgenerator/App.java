package kali.collectionidgenerator;

import java.util.ArrayList;
import java.util.Collection;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class App {

	public static void main(String[] args) {
		Collection<Address> add=new ArrayList<Address>();
		add.add(new Address());
		add.add(new Address());
		add.add(new Address());
		add.add(new Address());
		
		Worker wor=new Worker();
		
		wor.setAdd(add);
		wor.setName("Sandeep");
		
		SessionFactory sf=new Configuration().configure().buildSessionFactory();
		Session session=sf.openSession();
		session.beginTransaction();
		session.save(wor);
		session.getTransaction().commit();

	}

}
