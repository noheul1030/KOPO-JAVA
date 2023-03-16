package java0314;

import java.util.Scanner;

public class A6 {

	// A6 Compose a program with the conditions below
	// 완료
	public static void main(String[] args) {
		A6 a6 = new A6();
		System.out.println("--->");
		try {
			a6.result(a6.scanner(), a6.scanner());

		} catch (NumberFormatException e) {

		} catch (NullPointerException e) {

		} catch (Exception e) {
			System.out.println("예외가 발생했습니다!");
		}

	}

	public int scanner() {
		Scanner scanner = new Scanner(System.in);
		return scanner.nextInt();
	}

	public void result(int scanner1, int scanner2) {
		for (int i = 1; i <= scanner1; i++) {
			for (int j = 1; j <= scanner2; j++) {
				System.out.println(i + "," + j);
			}
		}
	}
}
