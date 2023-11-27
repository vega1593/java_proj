package chap04.ex03;

public class For_Statement3 {

	public static void main(String[] args) {
		
		
		// 무한루프에서 break; 를 사용해서 무한 루프 빠져 나오기 
			// 반복문에서 특정 시점에 break; if 문 내에 break; 사용 <== for, while, do while
		
		// for 문에서 break;
		
		for (int i = 0 ; i >= 0 ; i+=10 ) {		// i = i + 10 		<==> 	i += 10
			
			System.out.println(i);
			
			
			if (i == 10000) { 			// 조건을 주어서 무한 루프를 빠져 나옴 
				break;
			}
			
			
		}
		
		System.out.println("=======================================================");
		
		
		for (int i = 0 ; i >= 0 ; i+=10 ) {		// i = i + 10 		<==> 	i += 10
			
			System.out.println(i);
			
			if ( i == 10000) {
			break;
		}	// 조건이 트루일때 {}를 생략할 수 있다 		
			System.out.println("오늘 ");	
				
			}
			
			
		}

	}


