package chap10.ex01;

public class ProFessor extends Human {
			//자식 				//부모
	
	
	 	// 필드 
	int prfessorId; 
	
		// 메소드
	void teach() {
		System.out.println("교수님은 학생을 가르칩니다.");
	}
	
	void ProInf () {
		System.out.println("학생 이름은" + name + " 이고, 나이는 " + age + "입니다.");
	}
	
}
