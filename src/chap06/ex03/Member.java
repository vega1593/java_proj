package chap06.ex03;

public class Member {		//회원 정보를 담은 클래스
	
	/*
	  	접근 제어자 : OOP의 캡슐화 , 필드나 , 메소드 , 클래스에 보안 기능
	  	   			-클래스 : public,default
	  	    		-필드   : public, protected, default (생략) , private 
	  	    		-메소드 : public, protected, default (생략) , private 
	  	    		- 생성자 
	  	    public		: 다른 패키지에서 접근이 가능
	  	    protected  	: 다른 패키지에서 접근이 가능(상속 관계가 적용되었을때 가능)
	  	    default(생략) : 같은  패키지에서 접근 
	  	    private : 외부 클래스에서 수정할 수 없다
	  	    
	 */
	
	// 1. 필드 : 외부 클래스에서  필드를 직접 접근 할 수 없도록 한다.
			// 필드의 접근 제어자가 private 으로 되었을때 
	private long idx; 		// 회원의 넘버링이 자동으로 됨 
	private String id; 	 	// ID
	private String pw; 		// 패스워드
	private String name; 	// 회원이름
	private int year; 		// 연 월 일 :  
	private int	 month;		// 월 : 1 ~ 12
	private int day;   		// 태어난 일 1 ~ 31 
	private String phone;   // 핸드폰 
	private String addr; 	// 주소
	
	// 2. 생성자	 
	
	Member(){}
	// 3. 메소드 : getter (출력) / setter(입력) 을 사용해서 필드의 값을 출력 / 입력
	public long getIdx() {
		return idx;
	}

	public void setIdx(long idx) {
		this.idx = idx;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPw() {
		return pw;
	}

	public void setPw(String pw) {
		this.pw = pw;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public int getMonth() {
		return month;
	}

	public void setMonth(int month) {
		this.month = month;
	}

	public int getDay() {
		return day;
	}

	public void setDay(int day) {
		this.day = day;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getAddr() {
		return addr;
	}

	public void setAddr(String addr) {
		this.addr = addr;
	}

	
	// toString() 메소드 Overriding:
		// 모든 자바의 클래스는 Object 클래스를 상속 받는다. Object 클래스의 필드와 메소드를 사용할 수 있다.
		// Overriding : 부모클래스의 메소드를 자식 클래스에서 재정의 해서 사용 하는 것
		// Overloading : 메소드 이름은 동일하고, 인폿 매개 변수에 갯수나 타입에 따라서 식별
	
	// toString() : Object 클래스의 메소드 , 객체자체를 출력시 , 그 객체의 필드의 값을 출력  
	@Override // 오른쪽 클릭  > 소스 > 제너레이트 투 스트링 > 셀렉 > 제너레이트 ( 위에 만들어 짐으로 밑으로 복붙)
	public String toString() {
		return "Member [idx=" + idx + ", id=" + id + ", pw=" + pw + ", name=" + name + ", year=" + year + ", month="
				+ month + ", day=" + day + ", phone=" + phone + ", addr=" + addr + "]";
	}

}
