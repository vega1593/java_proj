package chap10.ex03;

public class Animal {		//부모 클래스
	
	//필드 
	
	String name; 			//인스턴스 필드 : 객체화 해야만 사용 가능
	int age;				//인스턴스 필드
	static String color; // 정적 필드: 객체화 , 클래스명으로 호출 

	//메소드[인스턴스] : 객체화(인스턴스화) 해서만 호출됨 , Overriding 가능
	void cry () { 		
		System.out.println("모든 동물은 웁니다");
	}
	
	//메소드 [정적메소드] : 객체화 해서 호출, 객체화 하지 않고 클래스 명으로 호출
	
	static void eat () {
		System.out.println("모든 동물은 밥을 먹습니다.");
	}
}