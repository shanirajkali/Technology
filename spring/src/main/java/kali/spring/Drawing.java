package kali.spring;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.FileSystemResource;

public class Drawing {

	public static void main(String[] args) {
		
		//by bean factory
		BeanFactory bean=new XmlBeanFactory(new FileSystemResource("myspring.xml"));
		Triangle t=(Triangle) bean.getBean("triangle");
		t.draw();
		
		//Application context
		ApplicationContext context=new ClassPathXmlApplicationContext("myspringApplicationContext.xml");
		Triangle t2=(Triangle) context.getBean("triangle");
		t2.draw();
		System.out.println(t2.getType());
		t2.setType("newEquilatral");
		System.out.println(t2.getType());
		
		//set value by constructor
		Circle c=(Circle) context.getBean("circle");
		System.out.println(c.getType() );
		
		//constructor over loading
		RactAngle c1=(RactAngle) context.getBean("ractangle");
		System.out.println(c1.getArea()+"  "+c1.getType());
		
		//two argument constructor 
		RactAngle c2=(RactAngle) context.getBean("twoArgConstructorRactangle");
		System.out.println(c2.getArea()+"  "+c2.getType());
	}

}
