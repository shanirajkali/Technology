package collection;

import java.util.ArrayList;

/**
 * 
 * @author shani
 * ArrayList is the implementation class for List interface
 * every Collection class is implemented based on some data structures
 * ArrayList is growable in nature implemented on resizable arrys
 * insertion order preserved, duplicates are allowed
 * Heterogeneous is allowed , null insertion is possible
 * 
 */
public class ArrayListExample {

	public static void main(String[] args) {
		
		//Constructors for ArrayList 
		//this is creating an empty ArrayList
		ArrayList al=new ArrayList();
		al.add(10);
		al.add("shani");
		al.add("A");
		al.add(null);
		al.add(0,"dsd");
		System.out.println(al);
		//creating ArrayList with initial capacity
		ArrayList al2=new ArrayList(100);
		
		//creating ArrayList with existing collection like Stack, ArrayList, Vector
		ArrayList al3=new ArrayList(al);
		
		
		//when ArrayList reaches max capacity then new ArrayList created with new capacity 
		//formula for creating new capacity (cc*3/2)+1 where cc is current capacity
		//

	}
}