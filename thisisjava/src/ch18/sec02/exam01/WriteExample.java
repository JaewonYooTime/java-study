package ch18.sec02.exam01;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class WriteExample {
    public static void main(String[] args) {
        try {
            // 경로 수정: 역슬래시 두 개 또는 슬래시 사용
            OutputStream os = new FileOutputStream("/Users/jaewon/Documents/Temp/test1.db");  // 방법 1
            // 또는
            // OutputStream os = new FileOutputStream("C:/Temp/test1.db"); // 방법 2
            
            // 파일 쓰기 작업 예시
            byte a = 10;
            byte b = 20;
            byte c = 30;
            
            os.write(a);
            os.write(b);
            os.write(c);
            
            os.flush();
            os.close();
            
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("Catch");
        }
    }
}
