package chap06.ex01;
// 클래스 밖에 : 패키지, 임포트,외부 클래스 



public class Object_Definition {
	// 클래스 블락 : 필드, 메소드, 생성자 
	
	// 필드 (멤버 변수) : Heap 공간에 변수와 값이 저장 , 클래스 블락에 선언된 변수를 필드라고 호칭 
			// 변수 : 메소드 블락 내에 선언된 것을 변수 , Stack에 변수 명과 값이 저장
	String name ;
	int age ; 
	double weight ; 
	String add ;
	
	// 생성자 : 클래스 이름과 동일하고 리턴 타입이 없는 메소드, 객체 생성시 필드의 값을 초기화 할때 사용
	Object_Definition (){} 		// 기본 생성자 , 생략해도 됨 , 객체 생성시 생성사 호출해서 필드의 값을 초기화 
	
	//생성자 : 인풋 값이 존재하는 생성자
	Object_Definition (String name, int age, double weight, String add){
		// this : 자신 객체의 필드, 인풋 변수 이름 = 받는 변수 이름 = 필드 이름이 동일 할 경우 this.
		this.name = name;
		this.age = age;
		this.add = add;
		this.weight = weight;
		
	}
	//  메소드(함수) : 리턴타입 메소드 명 (입력매개변수) { 호출시 실행 코드 ;}
	void printname() {
		int a = 10 ;		// 변수 : Stack 공간에 변수명, 값.  
		
		System.out.println("필드에 입렫된 이름 : "  + name);
	}
	
	// 메소드(함수)(호출시 작동됨) : 
	int printAge () {
		return age;
	}
	
	void printAll() {
		System.out.println("이름 :" + name + " , 나이 : " + age );
		System.out.println("몸무게 :" + weight + ", 주소 : " + add);
	}
	// 메소드(함수)블락 
	public static void main(String[] args) {
		/*
		 *	절차적 프로그램망 (POP)	 : 시간의 순서에 따라서 프로그래밍. C
		 *		- 성능이 매우 빠르다, 유지 보수 하기가  힘들다.
		 *		- 개발하기 어렵다, 반복된 코드가 계속 적용 될 수 있다.
		 *		- 람보르기니, 페라리 같은 고급 승용차 < === 고장이 나면 그 회사에서만 수리, 수리비가 많이 나옴
		 *		- 한 회사에서 부품의 모든것을 그 차에 맞게 최적화 시켜 만듬.
		 *
		 *	 객체 지향 프로그래밍 (OPP) : 객체 , 객체 프로그래밍. JAVA,C++
		 *		- 캡슐화 (보안), 상속(코드 중복 방지), 다형성-여러 형태로 찍어낼 수 있다 
		 *		- 유지보수 하기가 쉽다.
		 *		- 개발 하기 쉽다.
		 *		- 코드가 굉장히 간결
		 *		- 반복된 코드를 줄일 수 있다  
		 *		- 현대 자동차 : 자동차에 들어가는 부품 (여러 협력사) , 타이어 , 시트 , 엔진 , 유리창 등...
		 *			
		 *	 크래스 : 객체를 생성하는 틀, 설계도, 붕어빵 틀 
		 *	 객체( 인스턴스 )  : 클래스를 기반으로 RAM 로드 , 건물, 붕어빵 
		 *		- 하나의 클래스로 여러개의 객체를 생성할 수 있다.
		 *		
		 *
		 		 */		
		//변수 
		String abc ;
		
		//1. 객체 생성 : 클래스 ====> RAM (객체)
			// 클래스 명 객체 = new 클래스명 (); 
			// 타입 => 변수명 =>   = new 클래스명(); // 기본 생성자 호출 
		Object_Definition hong = new Object_Definition();
		
		//2. 객체의 필드의 값 등록 
		hong.name = "홍길동";
		hong.age = 30;
		hong.weight = 77.5;
		hong.add = "서울";
		
		//3. 객체의 메소드 호출 , 객체의 메소드 호출 
		hong.printname();
		
		System.out.println(hong.printAge());
		
		hong.printAll(); 
		
		System.out.println("==================");
		
		//1.객체 생성: 생성자에 매개변수의 값을 넣어서 객체 생성 
		Object_Definition lee = new Object_Definition("이순신",40,88.8,"부산"); 
		
		//2. 메소드 호출 : 
		lee.printAll();
		
		System.out.println("==================");
		//1. 객체 생성 : 클래스 (설계도, 븡어빵 틀) ===> 객체 (건물,붕어빵)
		
		Object_Definition park = new Object_Definition("박문수", 60, 66.7,"대전");
		
		//2. 객체의 메소드 호출
		park.printAll();
		System.out.println("======================");	
		
		System.out.println(park.name);	//박문수
		System.out.println(park.age);	//60
		
		System.out.println("=====================");
		
		System.out.println(hong.name); 	//홍길동
		System.out.println(hong.age);  	//30
		
		System.out.println("======================");
		
		System.out.println(lee.name); 	//이순신
		System.out.println(lee.age);	//40
		
		System.out.println("===========필드의 값을 수정============");
		lee.name = "이길동";
		lee.age = 77;
		
		System.out.println(lee.name);
		System.out.println(lee.age);
	
		
		}

	
	

}
