package kali.application;



import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import kali.hibernate.UserDetails;

public class PersistUserDetails {

	public static void main(String[] args) {
		UserDetails ud=new UserDetails();
		ud.setId(4);
		ud.setName("KALI");
		ud.setId(233);
		SessionFactory sf=new Configuration().configure().buildSessionFactory();
		Session sess=sf.openSession();
		//sess.beginTransaction();
		//sess.save(ud);
		//sess.getTransaction().commit();
		
		Student student=new Student();
		student.setId(134);
		student.setName("shani rajkali");
		student.setRoll_no(54);
		//sess=sf.openSession();
		//sess.beginTransaction();
		//sess.save(student);
		//sess.getTransaction().commit();
		
		TransiantAnnotation ta=new TransiantAnnotation();
		ta.setCategory("software\" eng.");
		System.out.println(new Date(68879687));
		ta.setJoinDate(new Date(68879687));
		ta.setDateOfBirth(new Date());
		ta.setDescription("sghvljkshaiughgiuoa");
		ta.setId(21);
		ta.setName("KAL'//;;;11!''I");
		
		//sess.beginTransaction();
		//sess.save(ta);
		//sess.getTransaction().commit();
	
		//ta=null;
		//sess.beginTransaction();
		//ta=(TransiantAnnotation) sess.get(TransiantAnnotation.class,21);
		//System.out.println(ta.toString());
		
		sess=sf.openSession();
		sess.beginTransaction();
		//sess.save(new AutoGenerated());
		//sess.getTransaction().commit();
		
		
		
	}

}