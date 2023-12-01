package lab.chap17.account;

public class Account {

	
	String name; 	//이름
	int account;	//계좌번호
	int money; 	// 액수
	String registration;
	void nameAccount() {
		System.out.println(" 이름 : "+ this.name + " 계좌 번호 : " + this.account + " 입니다. ");
	}
	void deposit (int money ) { 	//입금 <== ~ 입금 되었습니다 . 계좌의 잔금은 0000 입니다.
		this.money += money;
		System.out.println(money + "원 입금되었습니다. 잔액은 " + this.money + "원 입니다.");
}
	
	void withdraw ( int money) {	//출력 <== 00원 출금 했습니다. 계좌의 잔금은 ~ 원 있습니다
		this.money -= money;
		System.out.println(money + "원 출금되었습니다. 잔액은 " + this.money + " 원 입니다.");
	}	

		 Account(){} 
		 Account(String name){
			 this.name = name ; 
			System.out.println();
		 
		 }
		 
		 
		 Account(String name, int account , int money){
		this.name = name; this.account = account; this.money = money;
	
	   } 
		 public void hap (){
			 int hap =0; 
			 System.out.println();
		 }

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public int getAccount() {
			return account;
		}

		public void setAccount(int account) {
			this.account = account;
		}

		public int getMoney() {
			return money;
		}

		public void setMoney(int money) {
			this.money = money;
		}

		
		
		 	@Override
		public String toString() {
			return "Account [name=" + name + ", account=" + account + ", money=" + money + "]";
		}
	 
		
		
		 
}