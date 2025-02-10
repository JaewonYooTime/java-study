package ch05.test;

public class T8 {

	public static void main(String[] args) {
		int[][] array = {
				{95, 86},
				{83, 92, 96},
				{78, 83, 93, 87, 88}
		};
		
		int total_num = 0;
		int sum = 0;
		for(int i=0; i<array.length; i++) {
			total_num += array[i].length;
			for(int score: array[i]) {
				sum += score;
			}
		}
		
		double avg = (double)sum / total_num;
		
		System.out.println(total_num);
		System.out.println(sum);
		System.out.println(avg);
	}

}
