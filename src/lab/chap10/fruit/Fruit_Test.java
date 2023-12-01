package lab.chap10.fruit;

import java.util.ArrayList;
import java.util.List;


public class Fruit_Test {

	public static void main(String[] args) {
		
		/*
		 *  자식 객체를 생성후
		 *  Apple("사과", 30, 5000) Fruit 타입으로 정의
		 *  Banana ("바나나",44,6000)
		 *  StrawBerry("딸기",55,7000)
		 *  Melon ("멜론,66,8000)
		 *  ArrayList 객체 3개를 저장
		 *  For문으로 ArrayList의 객체를 끄집어내서 totalPlrice() 호출시
		 *  출력 : " 000의 전체 가격은 : 000입니다.
		 *  
		 *  자식 객체를 생성하면서 부모 타입으로 지정하면, 배열이나 클래스에 동일한 타입으로 저장
		 * 
		 *  
		*/
//		1. 자식 객체를 생성하면서 부모 타입으로 지정함. <<== 배열, 컬렉션 동일한 타입으로 저장 
	
//		Fruit a = new Apple("사과,30,5000);			//a : Fruit,Apple
//		Fruit b = new Banana("바나나",44,6000);		//b : Fruit,Banana
//		Fruit s = new Strawberry("딸기",55,7000);	//s : Fruit,Strawberry
//		Fruit m = new Melon("멜론",66,8000);			//m : Fruit,Melon	
		
//		Apple a1 = new Apple();
		
		
// 		2. ArrayList<Fruit>
//		List<Fruit> aList = new ArrayList<>();   컨트롤 + 시프트 + O 
//		aList.add(a);
//		aList.add(b);
//		aList.add(s);
//		aList.add(m);
//	 	aList.add(a1); //upcast 오류가 남
		
//		3. aList의 각 방의 저장된 객체를 끄집어 내서 출력
//		for ( int i = 0 ; i < aList.size(); i++) {
//			aList.get(i).totalPrice();
//		}
		
//		자바의 꽃 : 상속을 사용한 다형성
//		다행성 :  상속 , 부모의 메소드를 출력시 자식의 오버라이딩 된 메소드를 출력 
		
//	  	자료형에서 자동으로 업캐스팅
//		왼쪽과 오른쪽이 정확히 일치해야 하는게 Java
		
//		int aa = 3.5;  오류가 남 자료가 안 맞음
//		Double bb =(원래 더블이라고 명시해야 하는데 업캐스팅이 자동으로 일어남) 30;  오류가 발생하지 않음  큰타입에서 작은타입을 넣을려면 정수 앞에 명시를 해야함.
//		int cc = (int)(3 + 5.5); 다운 캐스팅을 해줘야함  
	 	
		Fruit f1 = new Apple();
		Fruit f2 = new Banana();
		Fruit f3 = new Strawberry();
		Fruit f4 = new Melon();
		
		f1.name = "사과";
		f1.cnt = 30;
		f1.price = 5000;
		
		f2.name = " 바나나";
		f2.cnt = 44;
		f3.price = 6000;
				
		f3.name = "딸기";
		f3.cnt = 55;
		f3.price = 7000;
		
		f4.name = "멜론";
		f4.cnt = 66;
		f4.price = 8000;

		f1.totalPrice();
		f2.totalPrice();
		f3.totalPrice();
		f4.totalPrice();
		
		List<Fruit> aList = new ArrayList<>();
		aList.add(f1);
		aList.add(f2);
		aList.add(f3);
		aList.add(f4);
		
//		System.out.println(aList);
		System.out.println("=====================");
		
//		for(int i = 0 ; i < aList.size(); i++) {
////			aList.get(i).totalPrice();
//		}
		
		for(Fruit fru : aList) {
			fru.totalPrice();
		}
		

	}

}
