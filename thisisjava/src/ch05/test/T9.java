package ch05.test;
import java.util.Scanner;

public class T9 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int num = 0;
		int student_num = 0;
		int[] scores = new int[0];
		
		System.out.println("-------------------------");
		System.out.println("1.학생수 | 2.점수입력 | 3.점수리스트 | 4.분석 | 5.종료");
		System.out.println("-------------------------");
		
		while(true) {
			System.out.print("선택>");
			num = scanner.nextInt();
			if( 1 == num) {
				System.out.print("학생 수>");
				student_num += scanner.nextInt();
				scores = new int[student_num];
			} else if(student_num == 0) {
				System.out.println("우선 학생 수 입력이 우선되어야 합니다.");
				continue;
			} else if( 2== num ) {
				System.out.print("점수 입력>");
				for(int i=0; i<student_num; i++) {
					scores[i] = scanner.nextInt();
				}
			} else if( 3 == num ) {
				for(int i=0; i<student_num; i++) {
					System.out.println( (i+1) + "번: " + scores[i] );
				}
				
			} else if( 4 == num ) {
				int max = 0;
				int sum = 0;
				for(int score: scores) {
					if(max<score) {
						max = score;
					}
					sum += score;
				}
				
				double avg = (double) sum / student_num; 
				System.out.println("최고 점수는 " + max + " 입니다.");
				System.out.println("평균 점수는 " + avg + " 입니다.");
			} else if( 5 == num ) {
				System.out.println("프로그램을 종료합니다.");
				break;
			}
		}
		
	}

	
}
