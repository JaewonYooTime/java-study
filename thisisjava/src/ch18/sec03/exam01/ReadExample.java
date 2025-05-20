package ch18.sec03.exam01;

import java.io.InputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ReadExample {
	public static void main(String[] args) {
		try {
			
			InputStream is = new FileInputStream("/Users/jaewon/Documents/Temp/test1.db");
			
			while(true) {
				int data = is.read();
				if(data == -1) break;
				System.out.println(data);
			}
			
			is.close();
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
