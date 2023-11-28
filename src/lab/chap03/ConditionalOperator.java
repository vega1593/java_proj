package lab.chap03;

import java.util.Scanner;

public class ConditionalOperator {
	public static void main(String[] args) {
		// 스캐너 장착 , 콘솔로 정수 입력, % 나머지    ||  연산자 사용, 삼항 연산자 사용. 
		
		// 1. 스캐너로 정수 값을 인풋받아서 : 출력 내용 : 인풋 받은 값은 00 이고, 짝수 입니다. ( 홀수 입니다.) 
		
		// 2. 스캐너로 값을 인풋 받아서 : 출력 내용 : 인풋 받은 값은 00 이고 , 3,6,9의 배수 입니다. 
															// (3,6,9의 배수가 아닙니다.)
		
		// < 12 시 20 분까지 >> 
		
		// 1. Scanner 장착 
		Scanner sc = new Scanner(System.in); 
		
		// 2. 인풋 받을 변수 선언 : 정수 
		int abc ; 
		
		// 3. 스캐너로 정수 값을 인풋 받음. 
		System.out.println("정수 값 하나를 입력 하세요 >>>> ");
		abc = sc.nextInt(); 
		
		System.out.printf("인풋 받은 값은 %d 이고, ", abc);
		System.out.println( (abc % 2 == 0 ) ? "짝수 입니다." : "홀수 입니다."   );
		
		System.out.printf("인풋 받은 값은 %d 이고, ", abc);
		System.out.println( (abc % 3 == 0 || abc % 6 == 0 || abc % 9 == 0) ? "3,6,9의 배수 입니다." : "3,6,9의 배수가 아닙니다."   );
		

	}

}
