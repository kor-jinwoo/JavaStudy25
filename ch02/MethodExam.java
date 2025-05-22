package ch02;

import java.util.Scanner;

public class MethodExam {

	public static void main(String[] args) {

		Scanner inputInt = new Scanner(System.in); // 입력받는 객체 생성
		String id = "kjw"; // 아이디 생성
		String pw = "1234"; // 비번 생성
		boolean in = false; // 로그인을 한 상태인지 안한 상태인지 구분용
		boolean run = true; // 프로그램 온 or 종료
		boolean session = true; // 로그인 판단용
		int num = 0; // 로그인 시도 횟수체크용
		int coin = 30000;

		while (run) {

			System.out.println("------------------------");
			System.out.println("JS쇼핑몰메뉴");
			System.out.println("잔액 : " + coin);
			System.out.println("1. 로그인");
			System.out.println("2. 상품등록");
			System.out.println("3. 상품보기");
			System.out.println("4. 상품수정");
			System.out.println("5. 상품삭제");
			System.out.println("9. 프로그램종료");
			System.out.print("(1~9번 입력) >> ");
			int select = inputInt.nextInt(); // 입력란 생성

			switch (select) {
			case 1:
				System.out.println("---로그인메뉴---");
				session = LoginOK(id, pw, session, num, run); // 다른 메서드에서 불러옴

				if (session == true) { // 로그인 성공시
					System.out.println(id + "님 환영합니다.");
					in = true;
				} else { // 로그인 실패시
					in = false;
					num++;
					System.out.println("로그인 시도 횟수[" + num + "]번.");

				}
				if (num >= 3) { // 로그인 횟수가 3회 이상일때
					System.out.println("로그인3회 실패로 프로그램을 종료합니다.");
					run = false; // 프로그램 종료
				}

				break;

			case 2:

				if (in == true) { // 로그인 후 실행했을때
					System.out.println("상품등록 메뉴로 진입하였습니다.");
					System.out.println("등록하실 상품을 선택해주세요.");
					System.out.println("상의 | 하의 | 신발 | 악세사리");
					System.out.print("입력 >> ");
					String look = inputInt.next();
					switch (look) {
					case "상의":
						System.out.println("등록할 상품명을 입력해주세요.");
						System.out.print("입력 >> ");
						String itemname = inputInt.next();
						System.out.println("등록할 상품정보를 입력해주세요.");
						System.out.print("입력 >> ");
						String iteminfom = inputInt.next();
						System.out.println("등록할 상품가격을 입력해주세요.");
						System.out.print("입력 >> ");
						int itemprice = inputInt.nextInt();

						System.out.println("상품명 : " + itemname);
						System.out.println("상품정보 : " + iteminfom);
						System.out.println("상품가격 : " + itemprice);
						System.out.println("상품등록이 완료되었습니다.");

						break;

					case "하의":
						System.out.println("등록할 상품명을 입력해주세요.");
						System.out.print("입력 >> ");
						String itemname1 = inputInt.next();
						System.out.println("등록할 상품정보를 입력해주세요.");
						System.out.print("입력 >> ");
						String iteminfom1 = inputInt.next();
						System.out.println("등록할 상품가격을 입력해주세요.");
						System.out.print("입력 >> ");
						int itemprice1 = inputInt.nextInt();

						System.out.println("상품명 : " + itemname1);
						System.out.println("상품정보 : " + iteminfom1);
						System.out.println("상품가격 : " + itemprice1);
						System.out.println("상품등록이 완료되었습니다.");
						break;

					case "신발":
						System.out.println("등록할 상품명을 입력해주세요.");
						System.out.print("입력 >> ");
						String itemname2 = inputInt.next();
						System.out.println("등록할 상품정보를 입력해주세요.");
						System.out.print("입력 >> ");
						String iteminfom2 = inputInt.next();
						System.out.println("등록할 상품가격을 입력해주세요.");
						System.out.print("입력 >> ");
						int itemprice2 = inputInt.nextInt();

						System.out.println("상품명 : " + itemname2);
						System.out.println("상품정보 : " + iteminfom2);
						System.out.println("상품가격 : " + itemprice2);
						System.out.println("상품등록이 완료되었습니다.");
						break;

					case "악세사리":
						System.out.println("등록할 상품명을 입력해주세요.");
						System.out.print("입력 >> ");
						String itemname3 = inputInt.next();
						System.out.println("등록할 상품정보를 입력해주세요.");
						System.out.print("입력 >> ");
						String iteminfom3 = inputInt.next();
						System.out.println("등록할 상품가격을 입력해주세요.");
						System.out.print("입력 >> ");
						int itemprice3 = inputInt.nextInt();

						System.out.println("상품명 : " + itemname3);
						System.out.println("상품정보 : " + iteminfom3);
						System.out.println("상품가격 : " + itemprice3);
						System.out.println("상품등록이 완료되었습니다.");
						break;

					case "종료":
						run = false;

					default:

					}

				} else { // 로그인을 하지 않고 실행했을때
					System.out.println("로그인 후 이용 가능합니다.");
					System.out.println("프로그램을 다시 시작하세요.");
					run = false;

				}
				break;

			case 3:
				System.out.println("상품보기 메뉴로 진입하였습니다.");
				System.out.println("필요하신 상품의 번호를 입력하세요.");
				System.out.println("상의 | 하의 | 신발 | 악세사리");
				System.out.print("입력 >> ");
				String look = inputInt.next();
				switch (look) {
				case "상의":
					System.out.println("1. 낡아빠진 난닝구 3,000원");
					System.out.println("2. 낡아빠진 브이넥티샤쓰 5,000원");
					System.out.println("3. 중고 긴팔티 8,000원");
					System.out.println("4. 중고 가죽자켓 10,000원");
					System.out.println("5. 최고급 신상 자켓 15,000원");
					System.out.println("6. 랜덤박스 8,000원");
					System.out.print("(1~6번입력) >> ");
					int tem = inputInt.nextInt();
					switch (tem) {

					case 1:
						if (coin < 3000) {
							System.out.println("돈이 없으시네여");
							System.out.println("나가주세요ㅋ");
						} else {
							coin = coin - 3000;
							System.out.println("낡아빠진 난닝구를 구매하였습니다.");
							System.out.println("-3,000원");
						}
						break;

					case 2:
						if (coin < 5000) {
							System.out.println("돈이 없으시네여");
							System.out.println("나가주세요ㅋ");
						} else {
							coin = coin - 5000;
							System.out.println("낡아빠진 브이넥티샤쓰를 구매하였습니다.");
							System.out.println("-5,000원");
						}
						break;

					case 3:
						if (coin < 8000) {
							System.out.println("돈이 없으시네여");
							System.out.println("나가주세요ㅋ");
						} else {
							coin = coin - 8000;
							System.out.println("중고 긴팔티를 구매하였습니다.");
							System.out.println("-8,000원");
						}
						break;

					case 4:
						if (coin < 10000) {
							System.out.println("돈이 없으시네여");
							System.out.println("나가주세요ㅋ");
						} else {
							coin = coin - 10000;
							System.out.println("중고 가죽자켓을 구매하였습니다.");
							System.out.println("-10,000원");
						}
						break;

					case 5:
						if (coin < 15000) {
							System.out.println("돈이 없으시네여");
							System.out.println("나가주세요ㅋ");
						} else {
							coin = coin - 15000;
							System.out.println("최고급 신상 자켓을 구매하였습니다.");
							System.out.println("-15,000원");
						}
						break;

					case 6:
						if (coin < 8000) {
							System.out.println("돈이 없으시네여");
							System.out.println("나가주세요ㅋ");
						} else {
							coin = coin - 8000;
							System.out.println("랜덤박스를 구매하였습니다.");
							System.out.println("-8,000원");

							int num1 = (int) (Math.random() * 8) + 1;
							if (num1 == 1) {
								System.out.println("랜덤박스에서 [낡아빠진 난닝구]가 나왔습니다.");
							} else if (num1 == 2) {
								System.out.println("랜덤박스에서 [낡아빠진 브이넥티샤쓰]가 나왔습니다.");
							} else if (num1 == 3) {
								System.out.println("랜덤박스에서 [중고 긴팔티]가 나왔습니다.");
							} else if (num1 == 4) {
								System.out.println("랜덤박스에서 [중고 가죽자켓]이 나왔습니다.");
							} else if (num1 == 5) {
								System.out.println("랜덤박스에서 [최고급 신상 가죽자켓]이 나왔습니다.");
							} else if (num1 == 6) {
								System.out.println("꽝입니다ㅋㅋ");
							} else if (num1 == 7) {
								System.out.println("또 꽝이네요ㅋ");
							} else {
								coin = coin + 30000;
								System.out.println("랜덤박스에서 빛이납니다.");
								System.out.println("(두둥탁!) 30,000원 당첨.");
							} // 안쪽 if문종료

							break;

						} // 바깥쪽 if문종료
					} // 상의 스위치문 종료
					break;

				case "하의":
					System.out.println("1. 수원역에서 주워온 반바지 3,000원");
					System.out.println("2. 잘못 찢어진 청바지 5,000원");
					System.out.println("3. 중고 2선 츄리닝 8,000원");
					System.out.println("4. 신상 아디다스 츄리닝 10,000원");
					System.out.println("5. 간지나는 명품 바지 15,000원");
					System.out.println("6. 랜덤박스 8,000원");
					System.out.print("(1~6번입력) >> ");
					int tem1 = inputInt.nextInt();
					switch (tem1) {

					case 1:
						if (coin < 3000) {
							System.out.println("돈이 없으시네여");
							System.out.println("나가주세요ㅋ");
						} else {
							coin = coin - 3000;
							System.out.println("수원역에서 주워온 반바지를 구매하였습니다.");
							System.out.println("-3,000원");
						}
						break;

					case 2:
						if (coin < 5000) {
							System.out.println("돈이 없으시네여");
							System.out.println("나가주세요ㅋ");
						} else {
							coin = coin - 5000;
							System.out.println("잘못 찢어진 청바지를 구매하였습니다.");
							System.out.println("-5,000원");
						}
						break;

					case 3:
						if (coin < 8000) {
							System.out.println("돈이 없으시네여");
							System.out.println("나가주세요ㅋ");
						} else {
							coin = coin - 8000;
							System.out.println("중고 2선 츄리닝을 구매하였습니다.");
							System.out.println("-8,000원");
						}
						break;

					case 4:
						if (coin < 10000) {
							System.out.println("돈이 없으시네여");
							System.out.println("나가주세요ㅋ");
						} else {
							coin = coin - 10000;
							System.out.println("신상 아디다스 츄리닝을 구매하였습니다.");
							System.out.println("-10,000원");
						}
						break;

					case 5:
						if (coin < 15000) {
							System.out.println("돈이 없으시네여");
							System.out.println("나가주세요ㅋ");
						} else {
							coin = coin - 15000;
							System.out.println("간지나는 명품 바지를 구매하였습니다.");
							System.out.println("-15,000원");
						}
						break;

					case 6:
						if (coin < 8000) {
							System.out.println("돈이 없으시네여");
							System.out.println("나가주세요ㅋ");
						} else {
							coin = coin - 8000;
							System.out.println("랜덤박스를 구매하였습니다.");
							System.out.println("-8,000원");

							int num1 = (int) (Math.random() * 8) + 1;
							if (num1 == 1) {
								System.out.println("랜덤박스에서 [수원역에서 주워온 반바지]가 나왔습니다.");
							} else if (num1 == 2) {
								System.out.println("랜덤박스에서 [잘못 찢어진 청바지]가 나왔습니다.");
							} else if (num1 == 3) {
								System.out.println("랜덤박스에서 [중고 2선 츄리닝]가 나왔습니다.");
							} else if (num1 == 4) {
								System.out.println("랜덤박스에서 [신상 아디다스 츄리닝]이 나왔습니다.");
							} else if (num1 == 5) {
								System.out.println("랜덤박스에서 [간지나는 명품 바지]가 나왔습니다.");
							} else if (num1 == 6) {
								System.out.println("꽝입니다ㅋㅋ");
							} else if (num1 == 7) {
								System.out.println("또 꽝이네요ㅋ");
							} else {
								coin = coin + 30000;
								System.out.println("랜덤박스에서 빛이납니다.");
								System.out.println("(두둥탁!) 30,000원 당첨.");
							} // 안쪽 if문종료

							break;

						} // 바깥쪽 if문종료
					} // 상의 스위치문 종료
					break;

				case "신발":
					System.out.println("1. 낡아빠진 난닝구 3,000원");
					System.out.println("2. 낡아빠진 브이넥티샤쓰 5,000원");
					System.out.println("3. 중고 긴팔티 8,000원");
					System.out.println("4. 중고 가죽자켓 10,000원");
					System.out.println("5. 최고급 신상 자켓 15,000원");
					System.out.println("6. 랜덤박스 8,000원");
					System.out.print("(1~6번입력) >> ");
					int tem2 = inputInt.nextInt();
					switch (tem2) {

					case 1:
						if (coin < 3000) {
							System.out.println("돈이 없으시네여");
							System.out.println("나가주세요ㅋ");
						} else {
							coin = coin - 3000;
							System.out.println("낡아빠진 난닝구를 구매하였습니다.");
							System.out.println("-3,000원");
						}
						break;

					case 2:
						if (coin < 5000) {
							System.out.println("돈이 없으시네여");
							System.out.println("나가주세요ㅋ");
						} else {
							coin = coin - 5000;
							System.out.println("낡아빠진 브이넥티샤쓰를 구매하였습니다.");
							System.out.println("-5,000원");
						}
						break;

					case 3:
						if (coin < 8000) {
							System.out.println("돈이 없으시네여");
							System.out.println("나가주세요ㅋ");
						} else {
							coin = coin - 8000;
							System.out.println("중고 긴팔티를 구매하였습니다.");
							System.out.println("-8,000원");
						}
						break;

					case 4:
						if (coin < 10000) {
							System.out.println("돈이 없으시네여");
							System.out.println("나가주세요ㅋ");
						} else {
							coin = coin - 10000;
							System.out.println("중고 가죽자켓을 구매하였습니다.");
							System.out.println("-10,000원");
						}
						break;

					case 5:
						if (coin < 15000) {
							System.out.println("돈이 없으시네여");
							System.out.println("나가주세요ㅋ");
						} else {
							coin = coin - 15000;
							System.out.println("최고급 신상 자켓을 구매하였습니다.");
							System.out.println("-15,000원");
						}
						break;

					case 6:
						if (coin < 8000) {
							System.out.println("돈이 없으시네여");
							System.out.println("나가주세요ㅋ");
						} else {
							coin = coin - 8000;
							System.out.println("랜덤박스를 구매하였습니다.");
							System.out.println("-8,000원");

							int num1 = (int) (Math.random() * 8) + 1;
							if (num1 == 1) {
								System.out.println("랜덤박스에서 [낡아빠진 난닝구]가 나왔습니다.");
							} else if (num1 == 2) {
								System.out.println("랜덤박스에서 [낡아빠진 브이넥티샤쓰]가 나왔습니다.");
							} else if (num1 == 3) {
								System.out.println("랜덤박스에서 [중고 긴팔티]가 나왔습니다.");
							} else if (num1 == 4) {
								System.out.println("랜덤박스에서 [중고 가죽자켓]이 나왔습니다.");
							} else if (num1 == 5) {
								System.out.println("랜덤박스에서 [최고급 신상 가죽자켓]이 나왔습니다.");
							} else if (num1 == 6) {
								System.out.println("꽝입니다ㅋㅋ");
							} else if (num1 == 7) {
								System.out.println("또 꽝이네요ㅋ");
							} else {
								coin = coin + 30000;
								System.out.println("랜덤박스에서 빛이납니다.");
								System.out.println("30,000원 당첨.");
							} // 안쪽 if문종료

							break;

						} // 바깥쪽 if문종료
					} // 상의 스위치문 종료
					break;

				case "악세사리":
					System.out.println("1. 낡아빠진 난닝구 3,000원");
					System.out.println("2. 낡아빠진 브이넥티샤쓰 5,000원");
					System.out.println("3. 중고 긴팔티 8,000원");
					System.out.println("4. 중고 가죽자켓 10,000원");
					System.out.println("5. 최고급 신상 자켓 15,000원");
					System.out.println("6. 랜덤박스 8,000원");
					System.out.print("(1~6번입력) >> ");
					int tem3 = inputInt.nextInt();
					switch (tem3) {

					case 1:
						if (coin < 3000) {
							System.out.println("돈이 없으시네여");
							System.out.println("나가주세요ㅋ");
						} else {
							coin = coin - 3000;
							System.out.println("낡아빠진 난닝구를 구매하였습니다.");
							System.out.println("-3,000원");
						}
						break;

					case 2:
						if (coin < 5000) {
							System.out.println("돈이 없으시네여");
							System.out.println("나가주세요ㅋ");
						} else {
							coin = coin - 5000;
							System.out.println("낡아빠진 브이넥티샤쓰를 구매하였습니다.");
							System.out.println("-5,000원");
						}
						break;

					case 3:
						if (coin < 8000) {
							System.out.println("돈이 없으시네여");
							System.out.println("나가주세요ㅋ");
						} else {
							coin = coin - 8000;
							System.out.println("중고 긴팔티를 구매하였습니다.");
							System.out.println("-8,000원");
						}
						break;

					case 4:
						if (coin < 10000) {
							System.out.println("돈이 없으시네여");
							System.out.println("나가주세요ㅋ");
						} else {
							coin = coin - 10000;
							System.out.println("중고 가죽자켓을 구매하였습니다.");
							System.out.println("-10,000원");
						}
						break;

					case 5:
						if (coin < 15000) {
							System.out.println("돈이 없으시네여");
							System.out.println("나가주세요ㅋ");
						} else {
							coin = coin - 15000;
							System.out.println("최고급 신상 자켓을 구매하였습니다.");
							System.out.println("-15,000원");
						}
						break;

					case 6:
						if (coin < 8000) {
							System.out.println("돈이 없으시네여");
							System.out.println("나가주세요ㅋ");
						} else {
							coin = coin - 8000;
							System.out.println("랜덤박스를 구매하였습니다.");
							System.out.println("-8,000원");

							int num1 = (int) (Math.random() * 8) + 1;
							if (num1 == 1) {
								System.out.println("랜덤박스에서 [낡아빠진 난닝구]가 나왔습니다.");
							} else if (num1 == 2) {
								System.out.println("랜덤박스에서 [낡아빠진 브이넥티샤쓰]가 나왔습니다.");
							} else if (num1 == 3) {
								System.out.println("랜덤박스에서 [중고 긴팔티]가 나왔습니다.");
							} else if (num1 == 4) {
								System.out.println("랜덤박스에서 [중고 가죽자켓]이 나왔습니다.");
							} else if (num1 == 5) {
								System.out.println("랜덤박스에서 [최고급 신상 가죽자켓]이 나왔습니다.");
							} else if (num1 == 6) {
								System.out.println("꽝입니다ㅋㅋ");
							} else if (num1 == 7) {
								System.out.println("또 꽝이네요ㅋ");
							} else {
								coin = coin + 30000;
								System.out.println("랜덤박스에서 빛이납니다.");
								System.out.println("30,000원 당첨.");
							} // 안쪽 if문종료

							break;

						} // 바깥쪽 if문종료
					} // 상의 스위치문 종료
					break;

				case "종료":
					run = false;

				default:

				}
				break;

			case 4:
				if (in == true) {
					System.out.println("상품수정 메뉴로 진입하였습니다.");
					System.out.println("수정하실 상품을 선택해주세요.");

				} else {
					System.out.println("로그인 후 이용 가능합니다.");
					System.out.println("프로그램을 다시 시작하세요.");
					run = false;
				}
				break;

			case 5:
				System.out.println("---상품삭제 메뉴---");
				if (in == true) {
					System.out.println("상품삭제 메뉴로 진입하였습니다.");
					System.out.println("삭제하실 상품을 선택해주세요.");

				} else {
					System.out.println("로그인 후 이용 가능합니다.");
					System.out.println("프로그램을 다시 시작하세요.");
					run = false;
				}
				break;

			case 9:
				System.out.println("---프로그램종료---");
				break;

			} // 스위치문 종료

			if ((int) coin <= 0) {
				System.out.println("모든돈을 탕진하였습니다.");
				System.out.println("프로그램이 종료됩니다.");
				run = false;

			}
		} // while문 종료

	} // 메인메서드 종료

	static boolean LoginOK(String id, String pw, boolean session, int num, boolean run) {
		Scanner inputStr = new Scanner(System.in);
		System.out.println("id를 입력하세요.");
		System.out.print("입력 : ");
		String loginid = inputStr.next();

		System.out.println("pw를 입력하세요.");
		System.out.print("입력 : ");
		String loginpw = inputStr.next();

		if (id.equals(loginid) && pw.equals(loginpw)) {
			System.out.println("로그인 성공");
			session = true;
		} else {

			System.out.println("로그인 실패");
			System.out.println("id또는 pw불일치.");

			session = false;

		} // if문 종료

		return session;

	} // 부 메서드 종료

} // 클래스 종료
