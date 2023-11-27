package lab.chap04;

public class While_statement {

	public static void main(String[] args) {
		/*
		  	1000 부터 1까지 5씩 감소하면서 출력 : for 문 , while 문
		 
		 */

		
		
		for ( int i  = 1000 ; i > 0 ; i-=5 ) {
			System.out.println("i의 값 : " + i );
			
		}
		
		System.out.println("========while========");
		int i = 1000;
		
		while ( i > 0 ) { 
			
			System.out.println("i의 값 : " + i );
			i -=5 ;
			
			
		}
	
		System.out.println("=======================");
		
		
	for (int a = 100 ; a > 0 ; a-= 6){
		System.out.println("a의 값 : " + a);
		
		
	}
		System.out.println("=====================");
		int a = 1000;
		
		while ( a > 0 ) { 
			System.out.println("a의 값 : " + a);
			a -=6;
			
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
