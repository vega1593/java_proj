package lab.chap10.car;

public class Car {		//부모클래스
	
	// 필드
	String name;
	int Speed;
	static String color;
	
	// 메소드 [인스터스 메소드] : 인스턴스 메소드만 Overriding
	
	void run () { // 자식에서 오버라이딩
		 System.out.println("모든 자동차는 달립니다.");
		 
	}

		static void speed () {
			System.out.println("차의 시속은 50 키로입니다");
			
		
	 }

}
