package java0314;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class A7 {

	static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		A7 a7 = new A7();

		try {
			int input = a7.input();
			a7.list1(input);

		} catch (InputMismatchException e) {
			System.out.println("InputMismatchException");
		
		} catch (Exception e) {

		}
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
