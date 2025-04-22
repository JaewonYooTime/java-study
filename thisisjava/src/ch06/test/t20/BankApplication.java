package ch06.test.t20;

import java.util.Scanner;

public class BankApplication {
	
	static final int LIMIT_NUM = 100;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Account[] accountList = new Account[LIMIT_NUM];
		int count = 0;
		while(true) {
			System.out.println("------------------------------------");
			System.out.println("1.계좌생성|2.계좌목록|3.예금|4.출금|5.종료");
			System.out.println("------------------------------------");
			
			System.out.print("선택>");
			int sel = sc.nextInt();
			sc.nextLine();
			if(sel == 1) {
				accountList[count] = new Account();
				System.out.print("계좌번호: ");
				accountList[count].code = sc.nextLine();
				System.out.print("계좌주: ");
				accountList[count].name = sc.nextLine();
				System.out.print("초기입금액: ");
				accountList[count].balance = sc.nextInt();
				count++;
			} 
			
			else if(sel == 2) {
				System.out.println("---------");
				System.out.println("계좌목록");
				System.out.println("---------");
				for(int i=0; i<count; i++) {
					System.out.println(
							accountList[i].code +"\t" + 
							accountList[i].name +"\t" + 
							accountList[i].balance);
				}
			}
			
			else if(sel == 3) {
				System.out.println("---------");
				System.out.println("예금");
				System.out.println("---------");
				//입력 받기
				System.out.print("계좌번호: ");
				String code = sc.nextLine();
				System.out.print("예금액: ");
				int money = sc.nextInt();
				//계좌 찾아서 잔액에 추가하기
				for(int i=0; i<count; i++) {
					if( code.equals(accountList[i].code)) {
						accountList[i].balance += money; 
						break;
					}
				}
			}
			
			else if(sel == 4) {
				System.out.println("---------");
				System.out.println("출금");
				System.out.println("---------");
				//입력 받기
				System.out.print("계좌번호: ");
				String code = sc.nextLine();
				System.out.print("출금액: ");
				int money = sc.nextInt();
				//계좌 찾아서 잔액에서 빼기
				for(int i=0; i<count; i++) {
					if( code.equals(accountList[i].code) ) {
						accountList[i].balance -= money; 
						System.out.println("결과: 출금이 성공되었습니다.");
						break;
					}
				}
			}
			
			else if(sel == 5) {
				System.out.println("프로그램 종료");
				break;
			}
		}
	}
}
