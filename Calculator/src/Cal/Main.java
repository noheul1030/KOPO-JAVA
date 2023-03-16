package Cal;

import java.util.Scanner;

public class Main extends Opperation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Main main = new Main();
		while(true) {
			charChange();
		}
	}

	public static void charChange() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("input a formula including only one operator");

		String input = scanner.next();
		System.out.println(input);

		int n = 0;

		for (int i = 0; i < input.length(); i++) {
			if (input.charAt(i) == '*') {
				n = i;
			}
			if (input.charAt(i) == '+') {
				n = i;
			}
			if (input.charAt(i) == '-') {
				n = i;
			}
			if (input.charAt(i) == '/') {
				n = i;
			}

		}

		int num1 = Integer.parseInt(input.substring(0, n));
		int num2 = Integer.parseInt(input.substring(n + 1, input.length()));

		if (input.charAt(n) == '*') {
			System.out.println(num1 * num2);
		} else if (input.charAt(n) == '+') {
			System.out.println(num1 + num2);
		} else if (input.charAt(n) == '-') {
			System.out.println(num1 - num2);
		} else if (input.charAt(n) == '/') {
			System.out.println(num1 / num2);
		}
	}
}
