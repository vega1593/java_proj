package chap17.ex02;

import java.util.List;

public class Method {

	//1. 필드
	List<Student> aList;		
	int[] arr; 
	//변수 //타입
	//2. 기본 생성자 생략됨  , Method(){}
	
	//3. 메소드 : 인풋 ==(프로그램)===> 출력 , 객체 생성 후 메소드 호출 
	 void arrayListOut (List<Student> aList) {
		 // aList 인풋 받아서 aList의 <Student> 객체를 끄집어내서 모든 필드의 내용을 출력
		 
		 for (int i = 0 ; i < aList.size(); i++) {
			
			 Student s = aList.get(i); 
			 
			 System.out.println(aList.get(i));
		 }
	 }
	 
	// 인풋 : 배열 , 정수 , 출력 : 인풋 받은 배열에서 정수로 들어오는 값이 몇 개인지 출력해주는 메소드)
		void arrayOutput (int[] arr1, int a) {

			int count = 0;
			for ( int i= 0 ; i < arr1.length; i++) {
				
				    	// 갯수를 카운터하는 변수
				if (arr1[1] == a) {		// 각 방의 값은 루프 == a 
					count++;			// 
				
				System.out.println(" 인풋 받은 정수는 : " + a + " 이고 , 배열에 "+ count + " 개 있습니다. ");{
					
				}
				}
			}
			
				}
	//List<Student> 객체를 받아서 각 객체의 이름 : 주소 출력하는 메소드
	void nameAddr (List<Student>aList) {
		for ( int i = 0 ; i < aList.size(); i++) {
			Student s = aList.get(i);
			
			System.out.println("이름 : " + s.getName() + " 주소 : " + s.getAddr());
		}
	
		
	}
	void all(List<Student> aList) {
		for(int i = 0 ; i < aList.size(); i++) {
			Student s = aList.get(i);
			s.hapAvg();
			
		}
		
	}
	
	void sMethod (Student s) {
		s.hapAvg();
		
	}
	
}
