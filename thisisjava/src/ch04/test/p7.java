package ch04.test;

import java.util.Scanner;

public class p7 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		boolean run = true;
		int depo = 0;
		
		while ( run ) {
			System.out.println("--------------");
			System.out.println("1.예금 | 2.출금 | 3.잔고 | 4.종료");
			System.out.println("--------------");
			System.out.print("선택>");
			
			int num = scanner.nextInt();
			
			if( 1 == num) {
				System.out.print("예금액>");
				depo += scanner.nextInt();
			} else if( 2== num ) {
				System.out.print("출금>");
				depo -= scanner.nextInt();
			} else if( 3 == num ) {
				System.out.print("잔고>" + depo);
			} else if( 4 == num ) {
				break;
			}
		} 
		System.out.println("프로그램 종료");
	}
}
