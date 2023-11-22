package lab.chap03;

import java.util.Scanner;

public class ConverType {

	public static void main(String[] args) {		
				// String 으로 인풋 받은 값을 정수나 실수 타입으로 변환해서 출력 
				// Integer.parseInt(변수);   변수 : 문자열로 된 정수 , "13"
				// Double.parseDouble(변수); 변수 : 문자열로 된 실수 , "13.33"
		
			// Scanner 에서 국어점수,영어점수,수합점수 를 인풋 받아서....
		Scanner sc = new Scanner(System.in);
			String kor ;
			String eng ;
			String math ;
			String jpn ;
			String 중국어;
//		int kor;
//		int eng;
//		int math ;
//		

		
		int hap ;
		double avg ;
		
		System.out.println("국어점수 영어점수 수학점수 일어점수 중국어점수 를 공백으로 구분해서 넣으세요>>>>");

		kor = sc.next();
		eng = sc.next();
		math = sc.next();
		jpn = sc.next(); 
		중국어 = sc.next();
		
		hap = Integer.parseInt(kor) + Integer.parseInt(eng) + Integer.parseInt(math) + Integer.parseInt(jpn) + Integer.parseInt(중국어);
		avg = hap / 5.0;
//		 kor = sc.nextInt();
//		 eng = sc.nextInt();
//		 math = sc.nextInt();
		 
		
			
		System.out.println("국어 점수 + 영어점수 + 수학점수 + 일어점수 + 중국어 : " + hap);
		System.out.println("모든 과목의 평균은: " + avg);

		
	}
	
	

}
