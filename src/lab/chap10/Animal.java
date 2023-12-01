package lab.chap10;

public class Animal {

	Animal (){
		
	
	}
	String name;
	int age;
	
	Animal (String name , int age ){
			this.name = name;
			this.age = age ;
}
	
		
		void eat() {
			System.out.println("모든 동물은 먹는다.");
		}
		
		void sleep() {
			System.out.println("모든 동물은 잠을 잔다.");
		}
	}