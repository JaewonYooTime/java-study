package ch06.sec06;

public class CarExample_2 {

	public static void main(String[] args) {
		//Car 객체 생성
		Car_2 myCar = new Car_2();
		
		//Car 객체의 필드값 읽기
		System.out.println("모델명: " + myCar.model);
		System.out.println("시동여부: " + myCar.start);
		System.out.println("현재속도: " + myCar.speed);
	}

}
