package java0314;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class A5 {

	// A5 Printing Numbers Matching the Condition
//	"정수 배열을 초기화합니다.
//	각 자릿수에서 N이 포함된 숫자를 출력합니다.
//	예외 문장을 추가합니다."
	// 완료

	static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		A5 a5 = new A5();
		a5.print();

		try {
			while (true) {
				a5.result(a5.input(), a5.numbers());
				System.out.println();
			}
		} catch (Exception e) {
			System.out.println("예외가 발생했습니다!");
		}
	}

	public String input() throws Exception {
		String input = scanner.next();
		if (input.equals("@") || input.equals("!"))
			throw new Exception();

		return input;
	}

	public String[] numbers() {
		int[] numbers = { 123, 32, 356, 53, 2, 67, 31, 78, 41, 9, 29 };
		String[] strNumbers = new String[numbers.length];

		for (int i = 0; i < numbers.length; i++) {
			strNumbers[i] = Integer.toString(numbers[i]);
		}
		return strNumbers;
	}

	public void result(String input, String[] strNumbers) {
		for (String num : strNumbers) {
			if (num.contains(input)) {
				System.out.print(num + " ");
			}
		}
	}
	
	public void print() {
		System.out.println("[Code]\n" + "int[] numbers = { 123, 32, 356, 53, 2, 67, 31, 78, 41, 9, 29 };");
		System.out.println();
		System.out.println("[Example]");
	}

}
