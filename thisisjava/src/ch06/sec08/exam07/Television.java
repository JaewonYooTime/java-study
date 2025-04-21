package ch06.sec08.exam07;

public class Television {
	static String company = "MyCompany";
	static String model = "LCD";
	static String info = company + "-" + model; 
	
	static {
		info = company + "-" + model;
	}
}
