package language_fundamental;

//when we pass object of any class in a method by default toString does call if there is no toString method
//in  class then "package_name . class_name @ hashcode " does call

class Check{
	int val=3;
	
	public  String toString() {
		return "the value is = "+val;
	}
}

public  class ObjectPassingInMethod {
	
	public static void checkClassWithToStringMethod1(Check c){
		System.out.println(c);
	}
	
	public static void checkClassWithoutToStringMethod1(ObjectPassingInMethod o) {
		System.out.println(o);
	}
	
	public static void main(String[] args) {
		Check c=new Check();
		checkClassWithToStringMethod1(c);
		ObjectPassingInMethod o=new ObjectPassingInMethod();
		 checkClassWithoutToStringMethod1(o);
		
	}

	

	

}
