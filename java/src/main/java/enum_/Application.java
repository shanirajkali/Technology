package enum_;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
//we can't declare enum inside the method
enum num{
	one,two,three,four,five,six,seven,eaight,nine,zero
}
//we can't innr class enum public
enum cons{
	con,thiss,that,those;
	cons(){
		System.out.println("constructor");
	}
}
public class Application {
	private enum week{
		sun,mon,tue,wed,thu,fri,sat;
		static int sunday=2;
		static String monday="first day of wee";
		public static int totalDays(){
			return 7;
		}
	}

	public static void main(String[] args) throws IOException {
		System.out.println(aboutpackage.jan);
		System.out.println(week.sun);
		System.out.println(num.eaight);
		System.out.println(week.sunday);
		System.out.println(week.monday);
		System.out.println(week.totalDays());
		
		for(week w:week.values()){
			System.out.println(w.ordinal()+" " +w.name()+ " "+w.values().length+"   " +w);
		
		}
		
		System.out.println("kali");
		aboutpackage m=aboutpackage.aug;
		System.out.println(aboutpackage.aug);
		BufferedReader br=new  BufferedReader(new InputStreamReader(System.in));
		week s=week.mon;
		switch(s){
		case sun: System.out.println("Sunday");
		break;
		case mon: System.out.println("Monday");
		break;
		default:
			System.out.print("wrong input");
		}
		
		//constructors 
		for(ConstructorInEnum ce:ConstructorInEnum.values()){
			System.out.println(ce +" price "+ce.getPrice());
		}
		
		ConstructorInEnum b=ConstructorInEnum.carrot;
		System.out.println(b.getPrice());
		
		//constructor will call in how many value it will have
		System.out.println(cons.thiss);
		
		//perticular method
		for(PerticularMethod pm: PerticularMethod.values()){
			pm.info();
		}
		br.close();

	}

	

}
