package ch05.lineage.dto;

public class Account {
	// 필드
	private String id;
	private String pw;
	private String nickname;
	private ElfDTO elfDTO;
	private KnightDTO knight;
	
	public String getId() {
		return id;
	}
	public String getPw() {
		return pw;
	}
	public String getNickname() {
		return nickname;
	}
	public ElfDTO getElfDTO() {
		return elfDTO;
	}
	public KnightDTO getKnight() {
		return knight;
	}
	public void setId(String id) {
		this.id = id;
	}
	public void setPw(String pw) {
		this.pw = pw;
	}
	public void setNickname(String nickname) {
		this.nickname = nickname;
	}
	public void setElfDTO(ElfDTO elfDTO) {
		this.elfDTO = elfDTO;
	}
	public void setKnight(KnightDTO knight) {
		this.knight = knight;
	}
	
	// 생성자
	
	
	// 메서드
	
}
