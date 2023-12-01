package chap10.ex01;

public class Student extends Human { 		//자식 클래스 

	
	// Human 클래스의 필드와 메소드가 Student 클래스로 상속 
	
	// 기본 생성자 생략됨 
	Student (){
			super(); // 부모 클래스의 () 생자를 호출  
	}
	
	Student(int StudentID){ 	//부모 자식이 클래스가 관계가 맺어지면 자식클래스 내에는 super 가 생략되어있음 ,첫 라인에 와야함 
		super ("김똘똘" , 20);
		this.StudentID = StudentID;
		this.StuName = super.name;
		super.eat();
	}
	
	
	// 필드 :
	
	String StuName; 
	int  StudentID ;
	
	// 메소드 ; 
	void goToSchool () {
	System.out.println("모든 학생은 학교에 갑니다");	
	}
	
	void stuInFo () {
		System.out.println("학생이름은" + name + "이고, 나이는" + age + "입니다."  );
		
	}
}
