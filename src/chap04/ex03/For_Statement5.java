package chap04.ex03;

public class For_Statement5 {

	public static void main(String[] args) {
		/*
		 반복문 (for , while , do while) 내에서 continue; break; 키워드 사용<== if 조건을 넣어서 사용
		 	- continue; <== 아래 코드는 실행하지 않고 증감식으로 이동
		 	- break;	<== 반복문을 빠져 나온다.
		 */
		
		// continue; 
		for ( int i = 1 ; i < 10 ; i++ ) {
					
			System.out.println("i 변수의 값 : " + i);
			if ( i % 3 == 0 ) { // 3의 배수일 때 true 가 되며 continue 가 작동 
				continue;		//아래에 있는 코드는 작동 안됨 증강식으로 작동 
			
			}
				
			System.out.println("369의 배수에서는 출력 안됨  " );
			System.out.println();
			
		}
		System.out.println("=============================");
		
		//break; 
		for (int i = 1 ; i < 10 ; i++) {
		
			System.out.println("i 변수의 값 : " + i);
			
			if ( i == 7) {break;}
			
	}
	
		
}

}