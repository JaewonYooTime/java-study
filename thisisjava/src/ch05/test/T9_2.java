package ch05.test;

import java.util.Scanner;

public class T9_2 {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in); // Scanner 객체 생성
		int[] scores = null; // 학생 수
		
		while (true) {
			System.out.println("------------------------------------------------");
			System.out.println("1.학생 수 | 2.점수입력 | 3.점수리스트 | 4.분석 | 5.종료");
			System.out.println("------------------------------------------------");
			System.out.print("선택>");
			int sel = scanner.nextInt(); // 한 줄 입력 받기
			// 1. 학생 수를 입력 받아 배열을 만든다.
			if(sel == 1) {
				System.out.println("학생 수를 입력해주세요.");
				System.out.print("학생 수>");
				int input = scanner.nextInt();
				scores= new int[input];
			}
			// 학생 수를 입력받지 않았을 시, 학생 수를 입력하라고 뜸.
			else if( ( sel == 2 || sel == 3 ||  sel == 4 ) && scores == null) {
				System.out.println("학생 수가 입력되지 않았습니다.");
				System.out.println("먼저, 1번 메뉴에서 학생 수를 입력해주세요.");
			}
			// 2. 학생 점수를 입력 받는다.
			else if(sel ==2) {
				for(int i=0; i<scores.length; i++) {
					System.out.print("score[" + i + "]> ");
					int input = scanner.nextInt();
					scores[i] = input;
				}
			}
			// 3. 각 학생들의 점수를 표시한다.
			else if(sel == 3) {
				for(int i=0; i<scores.length; i++) {
					System.out.println("score[" + i + "]> " + scores[i]);
				}
			}
			// 4. 학생들 점수의 최고점수와 평균점수를 표시한다.
			else if(sel == 4) {
				int max = 0;
				int sum = 0;
				for(int i=0; i<scores.length; i++) {
					sum += scores[i];
					if(scores[i] > max) {
						max = scores[i];
					}
				}
				System.out.println("최고 점수: " + max);
				System.out.println("평균 점수: " + (double) sum/scores.length);
			}
			// 5. 프로그램을 종료한다.
			else if(sel == 5) {
				System.out.println("프로그램을 종료합니다.");
				break;
			}
		}
	}
}
