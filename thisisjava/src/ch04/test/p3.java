package ch04.test;

public class p3 {

	public static void main(String[] args) {
		int sum = 0;
		for(int i=1; i<=100; i++) {
			if(i%3 == 0) {
				sum += i;
			}
		}
		System.out.println("1~100까지 정수 중 3의 배수의 총합:" + sum);
		
		int sum2 = 0;
		for(int i=3; i<=99; i+=3) {
			sum2 += i;
		}
		System.out.println("1~100까지 정수 중 3의 배수의 총합:" + sum2);
		
	}
}