package prtc.exe;

import java.util.Scanner;

public class Prectice {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String me;
		
		int jpn;
		int eng;
		int kor;
		
		int hap; 
	  double avg;
				
	System.out.println("=======나의 점수====-==");
	System.out.println("나의 일어점수 영어점수 국어점수를 입력하시오>>>");
	
	me = sc.next();
	
	jpn = sc.nextInt();
	eng = sc.nextInt();
	kor = sc.nextInt();
	
	hap = jpn + eng + kor ;
	avg = hap /3.0;
	
	System.out.println(me + "의 점수의 합계는 " + hap + "점 이고 평균은 " + avg + "이다. ");
	
	
	
	}

}

