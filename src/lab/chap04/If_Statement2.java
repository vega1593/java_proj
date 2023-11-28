package lab.chap04;

import java.util.Scanner;

public class If_Statement2 {
	public static void main(String[] args) {
		/*		
			if ~ else if ,    == 
		 	스캐너로 정수 값을 입력 받으세요. 자신의 가진 자산을 입력 받습니다. 
		 	
		 	0 ~ 1000 만원 :  "버스나 지하철을 타고 다닙니다." 
		 	1000만원 ~ 10000 : "택시를 타고 다닙니다. "
		 	10000  ~        : "비행기를 타고 다닙니다. 
		 		 	
		 */
		Scanner sc = new Scanner(System.in); 
		
		int myMony ; 
		
		System.out.println("자신의 자산을 정수로 만원 단위로 입력 하세요>>>>");
		myMony = sc.nextInt(); 
		
		if ( myMony >= 0 && myMony < 1000) {
			System.out.println("버스나 지하철을 타고 다닙니다.");
		} else if ( myMony >= 1000 && myMony < 10000) {
			System.out.println("택시를 타고 다닙니다. ");			
		} else if ( myMony >= 10000 ) {
			System.out.println("비행기를 타고 다닙니다");			
		} else  {
			System.out.println("잘못된 값을 입력했습니다. 양수를 입력 하세요. ");				
		}
		
		
	}
}
