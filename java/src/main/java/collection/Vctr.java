package collection;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.Vector;
public class Vctr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vector<Integer> v=new Vector<Integer>();
		System.out.println(v.capacity());
		for(int i=0;i<10;i++){
			v.add(i);
		}
		System.out.println(v.capacity());
		v.add(88);
		System.out.println(v.capacity());
		System.out.println(v);
		Enumeration<Integer> e=v.elements();
		System.out.println(e);
		System.out.println(e.nextElement());
		System.out.println(e.hasMoreElements());
		
		Iterator<Integer> i=v.iterator();
		System.out.println(i.hasNext());
		System.out.println(i.next());
		i.remove();
	}

}
