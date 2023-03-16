package Test_java0309;

import java0309.Test0309;

public class TestC {
	public static void Test() {
		Test0309 aa = new Test0309(); // 다른 패키지에 있는 것 불러오기
		aa.test();      // public만 호출 가능    // private, protected 는 접근 불가능
	}
}
