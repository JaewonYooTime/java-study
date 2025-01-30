package ch02.sec13;

import java.util.Scanner;

public class ScannerExample {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("값 입력: ");
		String strX = scanner.nextLine();
		int x = Integer.parseInt(strX);
		System.out.println(strX);

	}

}
