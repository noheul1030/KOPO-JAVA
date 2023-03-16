package java0314;

import java.util.ArrayList;
import java.util.Scanner;

public class A4 {

	// A4 Finding a Character
//	사용자가 문자열과 문자를 입력합니다.
//	문자열에서 문자를 찾아 첫 번째로 발견된 위치를 보여줍니다 (대소문자를 구분합니다).
//	예외 문장 추가하기
	// 완료

	public static void main(String[] args) {
		A4 a4 = new A4();

		try {
			while (true) {
				a4.index(a4.input(), a4.input());
			}
		} catch (Exception e) {
			System.out.println("예외 발생!");
		}
		System.out.println();

	}

	public String input() {
		Scanner scanner = new Scanner(System.in);
		return scanner.nextLine();
	}

	public void index(String input1, String input2) {
		String[] str = input1.split("");

		for (int i = 0; i < str.length; i++) {
			if (input2.contains(str[i]) == true) {
				System.out.println(i + 1);
				break;
			}
		}
	}
}
