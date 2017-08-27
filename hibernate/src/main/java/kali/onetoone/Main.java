package kali.onetoone;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Main {

	public static void main(String[] args) {
		
		Urls ua=new Urls();
		ua.setPic_url("/kali/main/java/");
		
		Acc ac=new Acc();
		ac.setUser_name("Kali ji");
		
		ua.setForeignKey(ac);
		
		SessionFactory sf=new Configuration().configure().buildSessionFactory();
		Session session=sf.openSession();
		session.beginTransaction();
		session.save(ac);
		session.save(ua);
		session.getTransaction().commit();
		session=sf.openSession();
		session.beginTransaction();
		session.save(ua);
		session.getTransaction().commit();
	}

}
