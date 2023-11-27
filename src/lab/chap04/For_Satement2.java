package lab.chap04;

public class For_Satement2 {

	public static void main(String[] args) {
		/*
		  
		  	실습 : 2중 for 문을 사용해서 1 ~ 19 단 까지 , 각 단을 옆으로 출력 (printf)
		  			-- 6단, 7단, 12단 을 제외하고 출력 : continue
		 */

		System.out.println("==19단 출력==");
		for (int i = 1 ; i < 20 ; i++ ){
		for (int j = 1 ; j < 20 ; j++) {
			
			if ( i == 6 || i == 7 || i == 12 ) continue;
			
		System.out.printf("%d * %d = %d \t " , i , j , ( i * j));
		{
		}
	
		
		 	}
		System.out.println();
		
		
		}
		
		System.out.println("==20단 출력==");
		for (int i = 1 ; i < 21 ; i++) {
		for (int j = 1 ; j < 21 ; j++) {
			
			if ( i == 5 || i == 9 || i == 13 ) continue;
			
			System.out.printf("%d * %d = %d \t " , i , j , (i*j));
			
		}
		System.out.println();
	}
	}
}
