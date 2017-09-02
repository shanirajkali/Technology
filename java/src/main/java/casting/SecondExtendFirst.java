package casting;

public class SecondExtendFirst extends First{
	
	SecondExtendFirst(){
		//System.out.println("second Extends first Constructor "+getClass());
		checkStaticCanBeOvverride();
		checkPrivateCanBeOvverride();
		check();
	}
	
	static void checkStaticCanBeOvverride(){
		System.out.println("this is Extended Class ");
	}
	
	private void checkPrivateCanBeOvverride(){
		System.out.println("this is Extended Class ");
	}
	
	@Override
	public void check(){
		System.out.println("non static ovverriden method of second class");
	}
}
