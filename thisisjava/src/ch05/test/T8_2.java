package ch05.test;

public class T8_2 {

	public static void main(String[] args) {
		int[][] array = {
				{95, 86}, 
				{93, 92, 96},
				{78, 83, 93, 87, 88}
		};
		
		int sum = 0;
		int totalLength = 0;
		for(int[] arr : array) {
			totalLength += arr.length;
			for(int item : arr) {
				sum += item;
			}
		}
		
		System.out.println("전체 합 : " + sum);
		System.out.println("전체 평균 : " + sum/totalLength);
	}
}
