package lab.chap06;

import java.nio.file.spi.FileSystemProvider;

public class Product_Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//1.Product 객체 4개 생성
		
		//2. Setter 를 사용해서 객체의 필드의 값을 주입
		
		//3. 배열 arr , 방 크기는 10개 : 0 ~ 9, 각 방에 4의 객체를 배열 방에 넣음.
		
		//4. 배열에 값을 끄집어내어서 Product 변수 p 에 담고 for 문으로 출력 
		
		Product p1 = new Product();
		Product p2 = new Product();
		Product p3 = new Product();
		Product p4 = new Product();
		

		p1.setIdx( 0 ) ;
		p1.setProName(" 핫팩 ");
		p1.setQty( 3 );
		p1.setProColor(" Black ");
		p1.setYear( 2023 );
		
		p2.setIdx( 1 );
		p2.setProName(" 수건 ");
		p2.setQty( 2 );
		p2.setProColor(" Pink ");
		p2.setYear( 2022 );
		
		p3.setIdx(2);
		p3.setProName(" 물통 ");
		p3.setQty(4);
		p3.setProColor(" Blue ");
		p3.setYear( 2020 );
		
		p4.setIdx( 3 );
		p4.setProName(" 립스틱 ");
		p4.setQty( 6 );
		p4.setProColor(" Red ");
		p4.setYear( 2021 );
		
		System.out.println(p1.getIdx());
		System.out.println(p1.getProName());
		System.out.println(p1.getQty());
		System.out.println(p1.getProColor());
		System.out.println(p1.getYear());
		
		System.out.println(p1);
		System.out.println(p2);
		System.out.println(p3);
		System.out.println(p4);
		
		System.out.println("======= for 문으로 출력 =======");
			
		Product [] arr = new Product[10];
		
		arr[0] = p1;
		arr[1] = p2;
		arr[2] = p3;
		arr[3] = p4;
		
		for (int i = 0 ; i < arr.length; i++){
			
			if(arr[i] != null) {
			Product prd1 = arr[i];
				
			System.out.println(prd1);
				
			}
			
		}
	
	}

}
