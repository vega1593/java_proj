package chap04.ex03;

public class For_Statement4 {

	public static void main(String[] args) {
		// 이중 for : for 내의 for 문 
		
		for (int i = 0 ; i < 10 ; i ++  ) {
			System.out.println(" 바깥쪽 for 문 : " + i );
		for (int j = 0  ; j < 10 ; j ++ ) {
			System.out.println(" i 변수 : " + i +  " j 변수의 값 : " + j );
			
		}
		
		System.out.println("======================================");	//false를 만나서 for문을 빠져나오면 입력됨
			
		}
		
		System.out.println("==============================================");		
		
		// 2중 for문을 사용해서 구구단을 출력 
		System.out.println("================구구단 출력 (아래방향으로 출력)=================");
		for (int i = 1 ; i < 10 ; i++) {
		System.out.println("===" + i + "단 출력" + "===" );
			
		for  (int j = 1 ; j < 10 ; j++) {
			System.out.println(i + " * " + j + " = " + (i * j));
		}
			System.out.println();
		}
		
		System.out.println();
		System.out.println();
		
		System.out.println("================구구단 출력 (단을 옆으로 출력)=================");
		for (int i = 1 ; 1 < 10 ; i++) { // i 단 
			for (int j = 1 ; 1 < 10 ; j++) {
			System.out.printf("%d * %d \t" , i, j, i*j );
		}
		//		System.out.println("==== " + " 단 출력 =====");
		 // j 는 각 단의 1~9 까지 곱하는 수 
			
			
					}
	}
}
			

				
	
		

