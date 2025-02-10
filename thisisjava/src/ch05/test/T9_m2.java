package ch05.test;
import java.util.Scanner;

public class T9_m2 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
        int choice;
        int studentNum = 0;
        int[] scores = new int[0];

        while (true) {
            printMenu();
            System.out.print("선택> ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1 -> {
                    System.out.print("학생 수> ");
                    studentNum = scanner.nextInt();
                    scores = new int[studentNum]; // 새로운 학생 수로 배열 초기화
                }
                case 2 -> {
                    if (studentNum == 0) {
                        System.out.println("먼저 학생 수를 입력하세요.");
                        continue;
                    }
                    inputScores(scanner, scores);
                }
                case 3 -> {
                    if (studentNum == 0) {
                        System.out.println("먼저 학생 수를 입력하세요.");
                        continue;
                    }
                    printScores(scores);
                }
                case 4 -> {
                    if (studentNum == 0) {
                        System.out.println("먼저 학생 수를 입력하세요.");
                        continue;
                    }
                    analyzeScores(scores);
                }
                case 5 -> {
                    System.out.println("프로그램을 종료합니다.");
                    scanner.close();
                    return;
                }
                default -> System.out.println("잘못된 입력입니다. 다시 선택하세요.");
            }
        }
    }

    private static void printMenu() {
        System.out.println("-------------------------");
        System.out.println("1. 학생 수 | 2. 점수 입력 | 3. 점수 리스트 | 4. 분석 | 5. 종료");
        System.out.println("-------------------------");
    }

    private static void inputScores(Scanner scanner, int[] scores) {
        System.out.println("점수 입력>");
        for (int i = 0; i < scores.length; i++) {
            System.out.print((i + 1) + "번 학생 점수: ");
            scores[i] = scanner.nextInt();
        }
    }

    private static void printScores(int[] scores) {
        System.out.println("점수 리스트:");
        for (int i = 0; i < scores.length; i++) {
            System.out.println((i + 1) + "번: " + scores[i]);
        }
    }

    private static void analyzeScores(int[] scores) {
        int max = scores[0];
        int sum = 0;

        for (int score : scores) {
            if (score > max) {
                max = score;
            }
            sum += score;
        }

        double avg = (double) sum / scores.length;
        System.out.println("최고 점수: " + max);
        System.out.println("평균 점수: " + avg);
    }

	}

