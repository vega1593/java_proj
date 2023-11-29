package chap06.ex03;

public class Member_Test {

	public static void main(String[] args) {
		// 같은 패키지 내에서는 import 없이 클래스를 사용 할 수 있다 
		// 접근 제어자가 default  이상이 되어야 함.

		//1. 객체 생성 
		Member m1 = new Member();
		Member m2 = new Member();
		Member m3 = new Member();
		Member m4 = new Member();
		
		//2. 객체의 필드 접근: 	<<< DB에 값을 불러와서 자바 객체에 필드의 값을 주입
			// 입력 : setter
		m1.setIdx(1);
		m1.setId(" ID001 ");
		m1.setPw(" 1111 ");
		m1.setPhone(" 010-1111-1111 ");
		m1.setName(" 홍길동 ");
		m1.setYear(1998);
		m1.setMonth(8);
		m1.setDay(22);
		m1.setAddr(" 서울 ");
		 
		m2.setIdx(2);
		m2.setId(" ID002 ");
		m2.setPw(" 2222 ");
		m2.setPhone(" 010-2222-2222 ");
		m2.setName(" 김길동 ");
		m2.setYear(2000);
		m2.setMonth(3);
		m2.setDay(23);
		m2.setAddr(" 의정부 ");
		 
		m3.setIdx(3);
		m3.setId(" ID003 ");
		m3.setPw(" 3333 ");
		m3.setPhone(" 010-3333-3333 ");
		m3.setName(" 상길동 ");
		m3.setYear(1999);
		m3.setMonth(4);
		m3.setDay(01);
		m3.setAddr(" 도쿄 ");
		
		m4.setIdx(4);
		m4.setId(" ID004 ");
		m4.setPw(" 4444 ");
		m4.setPhone(" 010-4444-4444 ");
		m4.setName(" 박길동 ");
		m4.setYear(1997);
		m4.setMonth(12);
		m4.setDay(21);
		m4.setAddr(" 산타마을 ");
		
		//3. 필드의 값을 출력 : getter 
		System.out.println(m1.getIdx());
		System.out.println(m1.getId());
		System.out.println(m1.getPw());
		System.out.println(m1.getPhone());
		System.out.println(m1.getName());
		System.out.println(m1.getYear());
		System.out.println(m1.getMonth());
		System.out.println(m1.getDay());
		System.out.println(m1.getAddr());
		
		//4. 객체 자체를 출력시 객체의 Heap의 주소가 출력 
		System.out.println(m1); 	//chap06.ex03.Member@1c4af82c : Heap의 주소
		System.out.println(m2); 
		System.out.println(m3);
		System.out.println(m4);
		
		System.out.println("==============for 문으로 출력=================");
		
		//5. 객체를 배열===> 컬렉션 (ArrayList) 에 저장 
		
		
		
		Member[] arr = new Member[10]; 
		
		arr[0] = m1;
		arr[1] = m2;
		arr[2] = m3;
		arr[3] = m4;
		
		//6. 배열의 정보를 끄집어 내서 출력 
		
		for ( int i = 0 ; i < arr.length; i++) {
			Member mem1 = arr[i];
			
			System.out.println(mem1);
		}
		
		
		
		
	}

}
