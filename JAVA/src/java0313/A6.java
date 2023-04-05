package java0313;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class A6 {

	// A6 Fibonacci Numbers
	// 이것의 공식은 아래와 같습니다.
	// F0 = 0, F1 = 1
	// Fn = Fn-1 + Fn-2
	// 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55 …
	// 리스트를 사용하세요.
	// 사용자가 숫자를 입력합니다.
	// 피보나치 수열에서 원하는 원소의 개수를 출력합니다.

	static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		A6 a6 = new A6();
		int input = a6.input();
		a6.list1(input);

	}

	public int input() {
		return scanner.nextInt();
	}

	public void list1(int input) {
		List<Integer> list = new ArrayList<Integer>();
		int num1 = 0;
		int num2 = 1;
		int num3;

		list.add(num1);
		list.add(num2);
		for (int i = 1; i < input; i++) {
			num3 = num1 + num2;
			list.add(num3);
			num1 = num2;
			num2 = num3;
		}

		for (int i = 0; i < list.size(); i++) {
			System.out.print(list.get(i) + "  ");
		}
	}
}
