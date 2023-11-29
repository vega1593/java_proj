package lab.chap06;

class Animal {
	
	//1. 필드
	String aName;
	String aColor;
	int aLeg;
	int aSpeed;
	String aCry;
	
	// 생성자 : 필드의 기본 값을 입력 하는 생성자
	// 메소드 : 필드의 모든 값을 출력하는 메소드 
	//메소드 : int abc() {retrun aLeg + aSpeed;}
	
	Animal (){}
	
	Animal(String aName , String aColor , int aLeg , int aSpeed , String aCry  ){
		this.aName = aName;
		this.aColor = aColor;
		this.aLeg = aLeg;
		this.aSpeed = aSpeed;
		this.aCry = aCry;
	}
	void printAll() {
		System.out.println("동물 이름 : " + aName);
		System.out.println("동물 색 : " + aColor);
		System.out.println("동물 다리갯수 : " + aLeg);
		System.out.println("동물 속도 : " + aSpeed);
		System.out.println("동물 울음 : " + aCry);
	}
	int plus ( int a , int b ) {
		int hap = a + b ;
		return hap;
		
		 
			
		
	}
	String abc (String aName , String aColor , String acry) {
		return aName + " + " + aColor + " + " +  aCry; 
	}
	
}



public class Object_Definition {

	public static void main(String[] args) {
		
		Animal a1 = new Animal("호랑이", "주황색", 4, 80, "어흥");
		
		 
			
		
	
		
		System.out.println("==========================");
		System.out.println(a1.plus(4,90));
		a1.aName = "호랑이";
		a1.aColor = "주황색";
		a1.aLeg = 4;
		a1.aSpeed = 90;
		a1.aCry = "어흥"; 
		a1.printAll();
		
		System.out.println("===========================");
		Animal a2 = new Animal();	

		a2.aName = "독수리";
		a2.aColor = "검은색";
		a2.aLeg = 2;
		a2.aSpeed = 120;
		a2.aCry = "이글";
		System.out.println(a2.plus (2,120));
		
		a2.printAll();
		
		
		
		
		
		System.out.println("============================");
		Animal a3 = new Animal();
		
		a3.aName = "사자";
		a3.aColor = "노란색";
		a3.aLeg = 4;
		a3.aSpeed = 85;
		a3.aCry = "야옹";

		System.out.println(a3.plus(4,85));
		
		a3.printAll();
		
		System.out.println("===============================");
		
		Animal a4 = new Animal("개", "인절미 색", 4, 50, "멍멍");
		
		a4.aName = "개";
		a4.aColor = "인절미 색";
		a4.aLeg = 4;
		a4.aSpeed = 50;
		a4.aCry = "멍멍";
		System.out.println(a4.plus(4,50));
		a4.printAll();
	}

}
