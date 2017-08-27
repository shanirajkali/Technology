package kali.onetomany;

import java.util.ArrayList;
import java.util.Collection;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class MainClass {

	public static void main(String[] args) {
		ProfilePic p1=new ProfilePic();
		p1.setPic_url("/kalli");
		ProfilePic p2=new ProfilePic();
		p2.setPic_url("/kalli2");
		
		Collection<ProfilePic> p=new ArrayList<ProfilePic>();
		p.add(p1);
		p.add(p2);
		Account pp=new Account();
		pp.setUser_profile_pics(p);
		
		
		SessionFactory sf=new Configuration().configure().buildSessionFactory();
		Session session=sf.openSession();
		session.beginTransaction();
		session.save(p1);
		session.save(p2);
		//session.save(pp);
		session.getTransaction().commit();

	}

}
