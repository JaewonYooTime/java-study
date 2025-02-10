package ch05.test;

public class T7 {

	public static void main(String[] args) {
		int[] array = { 1, 5, 3, 8, 2 };
		
		int max = 0;
		for(int item: array) {
			if(max < item) {
				max = item;
			}
		}
		
		System.out.println(max);
	}

}
