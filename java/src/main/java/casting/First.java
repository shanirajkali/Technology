package casting;

public class First {

	First(){
		//System.out.println("constructor of First Class"+getClass());
		checkStaticCanBeOvverride();
		checkPrivateCanBeOvverride();
		check();
	}
	static void checkStaticCanBeOvverride(){
		System.out.println("this is First Class static method");
	}
	
	private void checkPrivateCanBeOvverride(){
		System.out.println("this is First Class private method");
	}
	public  void check(){
		System.out.println("non static method of first class");
	}
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		//Class s=Class.forName("casting.First");
		//First t=(First) s.newInstance();
		//t.sss();
	}
}