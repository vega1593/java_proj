package lab.chap17.account;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import chap17.ex02.Method;
import chap17.ex02.Student;

public class Account_Test {

	public static void main(String[] args) {
		List<Account> aList;		
		int[] arr; 
		Scanner sc = new Scanner(System.in);
		
		// 1. Student 객체를 인풋 만큼 계좌를 만듬. 각 객체에 이름, 계좌번호, 	
		Account a = new Account();
		a.setName("곰돌이");
		a.setMoney(100);
		a.setAccount(1231233213);
		System.out.println(a.getName());
		int select ; 
out:		do {
			System.out.println("==============================");
			System.out.println("0. 계좌 이름과 계좌 번호 등록");
			System.out.println("1. 입금 ");
			System.out.println("2. 출금 ");
			System.out.println("3. 종료 ");
			System.out.println("==============================");
			System.out.println(" 위 내용의 정수를 입력 하세요");
			select = sc.nextInt();
			
			switch (select) {
				case 0:
					 if (a.name != null || a.account == 0) {
						 System.out.println(" 계좌를 만들었어요 ");
						 System.out.println(" 메뉴를 선택하세요" );
						
							
					 }
					 break;
				case 1:
				a.nameAccount();
				break;
			case 2:
				//입금
				int in = sc.nextInt();
				a.deposit(in);
				break;
			case 3:
				//출금
				int in1 = sc.nextInt();
				a.withdraw(in1);
				break;
			case 4: 
				
			break out;
					
				
			}	
			
			
		}while (true);
		
		
			System.out.println("프로그램 종료");
			
			
			System.out.println("============================");
		  
			int [] arr1 = new int [] {1, 2, 2, 3, 3, 3, 4, 4};
				
			
			
	
	
	}
	
	
	
	
	
	
		 
	
	
	
	
	
	

	
}
	

