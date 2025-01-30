package ch04.test;

public class p4 {

	public static void main(String[] args) {
		int sum = 0;
		int num1 = (int)(Math.random()*6) + 1;
		int num2 = (int)(Math.random()*6) + 1;
		while(sum != 5) {
			num1 = (int)(Math.random()*6) + 1;
			num2 = (int)(Math.random()*6) + 1;
			sum = num1 + num2;
		}
		System.out.println("(" + num1 + ", " + num2 + ")");
		
		
		int num3, num4;
		
		do {
			num3 = (int)(Math.random()*6) + 1;
			num4 = (int)(Math.random()*6) + 1;
			
		} while (num3+num4 != 5);
		System.out.println("(" + num3 + ", " + num4 + ")");
	}

}
