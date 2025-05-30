package ch05.mbcbank.DTO;

public class HanaAccountDTO extends AccountDTO {

	public HanaAccountDTO(String ano, String owner, int balance, String bankname) {
		this.ano = ano;
		this.owner = owner;
		this.balance = balance;
		this.bankname = "하나";
		
		
		// 생성자
		
		
	}
	// AccuntDTO객체를 부모로 만든다

	public HanaAccountDTO() {
		// 기본생성자
	}
	

}
