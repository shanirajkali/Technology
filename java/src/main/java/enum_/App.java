package enum_;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
//we can't declare enum inside the method
enum num{
	one,two,three,four,five,six,seven,eaight,nine,zero
}
public class App {
	enum week{
		sun,mon,tue,wed,thu,fri,sat
	}

	public static void main(String[] args) throws IOException {
		System.out.println((Month.jan));
		System.out.println(week.sun);
		System.out.println(num.eaight);
		
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
		br.close();

	}

	

}
