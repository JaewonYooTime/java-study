package ch04.test;

public class p5 {

	public static void main(String[] args) {
		for(int i=1; i<=10; i++) {
			for(int j=1; j<=10; j++) {
				if( (4*i + 5*j - 60 == 0) ) {
					System.out.println("(" + i + ", " + j + ")");
				}
			}
		}
		
		// 다른 풀이법
        for (int i = 1; i <= 10; i++) {
            int j = (60 - 4 * i) / 5; // j 값 계산
            if (j >= 1 && j <= 10 && (60 - 4 * i) % 5 == 0) { // j가 1~10 범위 내 정수인지 확인
                System.out.println("(" + i + ", " + j + ")");
            }
        }
    }
}


