package ch06.sec13.exam03.package2;

import ch06.sec13.exam03.package1.*;

public class C {
	public C() {
		A a = new A();
		
		a.field1 = 1;
//		a.field2 = 2; //default 필드 접근 불가(컴파일 에러)
//		a.field3 = 3; //private 필드 접근 불가(컴파일 에러)
		
		a.method1();
//		a.method2(); //default 필드 접근 불가(컴파일 에러)
//		a.method3(); //private 필드 접근 불가(컴파일 에러)
	}
}
