package lab.chap04;

public class For_Statement {

	public static void main(String[] args) {
		
		/*  구구단 중에 7단만 출력
		 
		  7 * 1 = 7 
		  7 * 2 = 4 
		  7 * 3 = 21 
		  7 * 4 = 28
		  7 * 5 = 35 
		  7 * 6 = 42 
		  7 * 7 = 49
		  7 * 8 = 56 
		  7 * 9 = 63
		 	  
		 */
		
		for ( int i = 1 , a =7 ; i <= 10 ; i++, a+=7 ) {
			if (a % 7 == 0 ) {
				System.out.printf("7 * %d =  %d\n " , i , a );
			}		
		}
			
		System.out.println("================================");
		
		for ( int i = 1 ; i <= 10 ; i++ ){
			System.out.println(" 7 * " + i + " = " + (i * 7));
		}
			
		System.out.println("==== 탭으로 구분해서 한 라인을 출력 ");	
		
		// 7단을 탭으로 구분해서 출력 
		for ( int i = 1 , a = 7 ; i <= 10 ; i++) {
			System.out.printf("%d * %d = %d \t ", a , i , i * a );
		}
		System.out.println();
		
		for ( int i = 1 , a = 8 ; i <= 10 ; i++) {
			System.out.printf("%d * %d = %d \t ", a , i , i * a );
		}
		
		
		

	}

		}
