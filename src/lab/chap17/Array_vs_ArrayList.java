package lab.chap17;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Array_vs_ArrayList {

	public static void main(String[] args) {
		/*
		  	  // 배열 : arr 	 : 100 번 , 10의 배수만 저장 후 출력
		  	 //
		  	// 컬렉션 : aList  : 20의 배수 100방까지만 저장 , for 문으로 출력 .
		  	     
		 */ 

		// 배열 
			// 1. 자료형[] 변수 = new  
			//자료형 [방 갯수]; 방의 갯수 선언
			// arr.length : 배열 방의 갯수
			int [] arr = new int [100]; // index : 0 ~ 99 번 방까지 있음
			
			for ( int i = 0 , a = 0 ; i< arr.length; i++) {
				a += 10;
				arr[i] = a; 		
				
			}
				 // 출력 
			for (int i = 0 ; i < arr.length; i++) {
				System.out.println(arr[i] + " , ");
			}
			 for (int k : arr) {
				System.out.println(k + " , ");
				
				
			}
			 System.out.println();
			 System.out.println(Arrays.toString(arr));
			 
			 //컬렉션 : ArrayList , 자동으로 방 크기가 늘어나고 줄어듬. 제너릭 타입으로 선언 : <Integer>
			 		// import 해서 사용
			 		// ArrayList 선언
			 		// 메소드를 사용해서 값을 넣고 , 삭제 , 출력 
			 		// aList.add(값)		 // 마지막 방에 값을 추가
			 		// aList.add(index, 값)// intex 방 번호에 값을 넣음 
			 		// aList.size() // 방의 갯수
			 		// aList.remove(index), aListremove(값) // 삭제 
			 		// aList.get(index)		// index의  값을 출력 
			 
			 List<Integer> aList = new ArrayList<>(); // 마우스 올려서 자바 유틸로 선언 
			 ArrayList<Integer> aList2 = new ArrayList<>();
			 
			 System.out.println(aList.size());
			 
			 // 값 입력 
			 
			 for (int i = 0 , a = 0 ; i < 100; i++) {
				 a += 20;
				 aList.add(a); 		//마지막 방에 값을 저장.
				 
			 }
			 System.out.println("컬렉션의 방의 크기 : " + aList.size());
			 
			 // 각 방의 내용을 출력
			 
			 for(int i = 0 ; i < aList.size(); i++) {
				 System.out.println(aList.get(i) + " , ");   		// i 번째 방의 값을 출력
			 }
				 System.out.println();
			 System.out.println(aList);
}
	
	
}
