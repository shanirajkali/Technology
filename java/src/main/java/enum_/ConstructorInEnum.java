package enum_;

/**
 * 
 * @author shani
 * enum constructor runs for every class separately;
 */
public enum ConstructorInEnum {
 patato(100),tamato(200),carrot(22),pizza(2000),roti;
	ConstructorInEnum(){
		System.out.println("this is an constructor");
		this.price=-33;
	}
	int price;
	ConstructorInEnum(int price){
		this.price=price;
	}
	int getPrice(){
		return price;
	}
	public static void main(){
		for(ConstructorInEnum ce:ConstructorInEnum.values()){
			System.out.println(ce);
		}
	}
	
}

