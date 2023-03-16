package java0313;

import java.util.Scanner;

public class A2 {

	// A2 Counting a Specified Character
	// 사용자는 문자열을 입력하고 배열에 할당합니다.
	// 사용자는 단어를 입력하고 배열에 할당합니다.
	// 입력된 단어 중 입력 문자열에 포함된 단어의 개수를 계산합니다.
	// 완료

	static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		A2 a2 = new A2();
		String input = "I go to school.Where are you going?";

		while (true) {
			System.out.println(input);
			String counting = a2.input();

			String[] input1 = new String[] {};
			String[] counting1 = new String[] {};

			if (counting.length() == 1) {
				input1 = input.split("");
				counting1 = counting.split(" ");
			} else {
				input1 = input.split(" ");
				counting1 = counting.split(" ");
			}

			a2.character(input1, counting1);
			System.out.println();
		}
	}

	// 값을 입력받는다.
	public String input() {
		return scanner.nextLine();
	}

	public void character(String[] input1, String[] counting1) {
		int count = 0;
		for (int i = 0; i < input1.length; i++) {
			for (int j = 0; j < counting1.length; j++) {
				if (input1[i].contains(counting1[j])) {
					count++;
				}
			}
		}
		System.out.println(count);
	}
}
