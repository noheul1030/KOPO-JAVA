package java0309;

import java.util.Scanner;

public class Parameters {
	static Scanner scanner = new Scanner(System.in);
	public static void main(String[] args) {
		Parameters para = new Parameters();

		System.out.println("숫자를 입력하시오.");
		int num = para.inPut();
		int num2 = para.inPut();

		int add = para.addOperation(num, num2);
	}

	public int inPut() {

		int a = scanner.nextInt();
		return a;
		

	}

	public static int addOperation(int a, int b) {
		int sum = a + b;
		System.out.println(sum);

		return sum;
	}
}
