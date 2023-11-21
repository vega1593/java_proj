package chap2.ex01;

import javax.print.attribute.SetOfIntegerSyntax;

// 패키지 : 폴더 


public class UsageOfDataType { // 클래스 영역
	public static void main(String[] args) {  //메인 메소드
		// 변수 : 한번 선언후 변수의 값을 다른값을 할당 할 수 있다. , 소문자로 시작해서 캐멀캐이스 이름 작성
		// 상수 : 변수 선언 앞에 final 키가 등록됨, 상수명은 대문자로만 지정, 한번 값을 할당하면 그 값을 수정할 수 없다.
		
		/* 자료형: 변수/상수를 정의할때 반드시 자료형 ( 60 페이지 )
			- 기본 자료형 (8개)   : 메모리의 stack 공간에 변수와 같이 할당
				boolen, 정수 (byte, short, int, long), 실수값 (float,double), 문자 (char)
		    (true/false)	1바이트 2바이트 4바이트 8바이트
		    	    
		- 참조 자료형 (무한대) : 메모리의 stack 공간에는 변수명, 실제 값은 Heap에 저장됨
					   첫자는 대문자 
		 			   객채 / 배열 / 인터페이스
					String : 참조잘형, 문자열을 담는다
				
		*/
		
		//변수 선언 방법 2 가지 
		//1. 변수 선언과 , 값은 나중에 할당.
		int a; // 변수 선언 
		int b; // 변수 선언
		
	
		a= 1; // 변수의 값은 나중에 할당
	 	
		System.out.println(a);
//		System.out.println(b);		// 오류 발생 : 변수 선언후 값이 할당이 안되어 있어
	
		//2. 변수 선언과 동시에 값을 할당.		
		int c= 10;
		int d= 20;
	
		System.out.println(c); //10 
		System.out.println(d); //20 
		
		//리터널 : 변수, 상수에 들어가는 값
		
		//변수에 새로운 값을 할당
		c = 55;
		d = 66; 
		System.out.println(c); //55
		System.out.println(d); //66
		
		// 상수 : 한번 값이 할당 되면 다른 값을 넣을 수 없다. final 키를 넣어서 상수 선언 
			// 상수명은 대문자로 할당.
		final int ABC = 200; 
		final double PI = 3.14;
		
		System.out.println(ABC);
		
//	ABC = 300;	 //상수는 새로운 값을 넣으면 오류 발생 
		
		
		
		System.out.println("====================8가지 자료형 ==================");
		
		//기본 자료형 8가지
		//1. boolean : 
		boolean abc ; // true,false 값만 넣을 수 있다.
		abc = false;
		
		System.out.println(abc); 	//true 
		
		
		//2. 정수 값을 넣을 수 있는 자료형 ( byte : 1byte, short : 2byte, int : 4바이트 long :8바이트 )
		//byte : 1byte (8bit) - 128 ~ 127 
		byte aa ;
		byte bb ;
		aa = -128;
		bb = 127;
		
		System.out.println(aa);
		System.out.println(bb);
		
		
		// short : 2byte (16bit) : -32,768 = 32.767 
		short cc; 
		short dd;
		
		cc = -32768;
		dd = 32767;
		
		System.out.println(cc);
		System.out.println(dd);
		
		
		// int : 4byte (32bit) : -2,147,483,648 ~ 2,147,483,647
		int ee; 
		int ff;
		
		ee = -2_147_483_648; //언더바는 구분자로 생략
		ff =  2_147_483_647;
		
		System.out.println(ee);
		System.out.println(ff);
		
		// long : 8byte(64bit) : -9,223,372,036,854,775,808 ~ 9,223,372,036,854,775,807
			// 64bit : 처음 비트 (MSB , 부호를 처리하는 비트 )
			// clac
			// 리터럴에 l, L을 명시를 해야 한다.
		
		long gg; 
		long hh;
		//정수의 범위를 벗어난 값을 넣을때 : L 
		gg = -9_223_372_036_854_75_808L;  //세미콜론 앞 리터널에 대문자 L을 적용
		hh =  9_223_372_036_854_775_807L;
		
 		System.out.println(gg);
		System.out.println(hh);
		
		long ii;
		ii = 5000; // int 범위 내의 값을 얹을때 L을 명시 하지 않아도 됨
				
		//실수 : float , double <== (double이 기본형)
		//float : 4byte (32bit), 소수점 7자리까지 정밀도가 유지됨 , 리터널 뒤에 세미콜론 앞에 f,F  

		float jj;
		jj = 3.14888888888F;		// 리터널 뒤에 세미콜론 앞에 F
		System.out.println(jj);
		
		//double: 8byte (64bit), 소수점 15자리까지 정밀도가 유지됨 <=== 기본형
		
		double kk;
		kk = 3.14888888888888;
		System.out.println(kk);
		
		System.out.println("=========================================================");
		
		//char : 1문자를 넣을 수 있음.
			/*
			  	- char 의 값(리터럴)을 넣을때는 작은 따옴표 '' 영문, 한글 , 일본어, 중국어 , | String : 문자열 , ""
			  	- 1문자
			  	- 문자, 아스키 코드 값(10진수), 유니코드로 할당(16진수) ('\\u유니코드값')	
			  	
			  	- 아스키 코드 : 7bit로 되어있음, 영어대문자 , 영어소문자, 숫자, 특수문자
			  	- 유니코드 	: 2byte ~ 3byte 한글, 일본어, 중국어,...
			  	 		  	 
			 */	 
		
		char ll;
		ll = 'A';
		char mm; 
		mm = '가' ;

		System.out.println(ll);
		System.out.println(mm);
		System.out.println("============================");
		
		// 문자로 값넣기 : a 
		char nn = 'a' ;
		System.out.println(nn);
			
		// 10진수 아스키 코드 값으로 값넣기 : a
		 	// '' 넣으면 오류 
		char oo = 97; 
		System.out.println(oo);
		
		// 16진수 유니코드 값으로 값넣기 : a
		char pp = '\u0061';
		System.out.println(pp);
		
		System.out.println("============================");
		
		char firstName1 = '\uC6B0' ;		// 우
		char firstName2 = '\uBE48' ;		// 빈
		char lastName = '\uAE40' ;			// 김
				
		// 출력 내용 : 나의 이름은 김 우빈 입니다.
				
		// println (); 출력
		// printf (); 출력		// %c
				
			System.out.println("나의 이름은 " + lastName + " " + firstName1 + firstName2 + " 입니다. ");
			System.out.printf("나의 이름은 %c %c%c 입니다.\n", lastName, firstName1, firstName2);
				
			

				
				
		
	}
	

}
