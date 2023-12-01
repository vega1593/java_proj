package lab.chap10.fruit;

public class Apple extends Fruit {
	 
	// 부모의 필드가 상속
	
	Apple(){} // <== 명시 안되어있으면 작동이 안됨
	Apple(String name , int cnt , int price){
		super();
		super.name = name;
		super.cnt = cnt ; 
		super.price = price;
	}
	
	@Override
	void totalPrice() {		// 코드 작성: cnt + price 
		// 출력 : " 사과의 전체 가격은 : 000 입니다."
		System.out.println( super.name + " 의 전체 가격은 : "  + ((super.cnt * super.price) + " 입니다."));
		
		
	}
}
