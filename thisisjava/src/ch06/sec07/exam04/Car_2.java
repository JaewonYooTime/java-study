package ch06.sec07.exam04;

public class Car_2 {
	//필드 선언
	String company = "현대자동차";
	String model;
	String color;
	int maxSpeed;
	
	//생성자 선언
	Car_2() {}
	
	Car_2(String model){
		this.model = model;
	}
	
	Car_2(String model, String color){
		this.model = model;
		this.color = color;
	}
	
	Car_2(String model, String color, int maxSpeed){
		this.model = model;
		this.color = color;
		this.maxSpeed = maxSpeed;
	}
	
	
}
