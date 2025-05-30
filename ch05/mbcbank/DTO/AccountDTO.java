package ch05.mbcbank.DTO;

public class AccountDTO { 
	// 부모로 생성하면 자식 객체들은 상속받아 필드.생성자,메서드를 사용할수 있다.
	
	// 개인적 필드
	protected String ano ; // 계좌번호
	protected String owner ; // 계좌주
	protected int balance ; // 잔고
	protected String bankname ; 	// 은행명
	
	
	// 생성자
	public AccountDTO(String ano, String owner, int balance, String bankname) {
		//super();
		// AccountDTO accountDTO = new AccountDTO(계좌번호, 계좌주, 금액, 은행명)
		this.ano = ano;
		this.owner = owner;
		this.balance = balance;
		this.bankname = bankname;
	}  // 모든 필드를 사용한 생성자 


	public AccountDTO() { // 기본생성자
		// Account accountDTO = new AccountDTO();
	}

	
	// 메서드 (게터와 세터를 이용하여 필드를 활용한다)
	public String getAno() {
		// 계좌번호 출력시 변조를 담당한다.
		return ano;
	}


	public String getOwner() {
		// 계좌주 출력시 변조를 담당한다.
		return owner;
	}


	public int getBalance() {
		// 잔고 출력시 변조를 담당한다.
		return balance;
	}


	public String getBankname() {
		// 은행명 출력시 변조를 담당한다.
		return bankname;
	}


	public void setAno(String ano) {
		// 계좌번호 입력시 검증 처리용
		this.ano = ano;
	}


	public void setOwner(String owner) {
		// 계좌주 입력시 검증 처리용
		this.owner = owner;
	}


	public void setBalance(int balance) {
		// 계좌금액 입력시 검증 처리용
		this.balance = balance;
	}


	public void setBankname(String bankname) {
		// 은행명 입력시 검증 처리용
		this.bankname = bankname;
	}


	@Override
	public String toString() {
		return "AccountDTO [ano=" + ano + ", owner=" + owner + ", balance=" + balance + ", bankname=" + bankname + "]";
	}
	
	
	

	
}
