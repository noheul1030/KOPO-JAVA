package java0306;

import java.util.Scanner;

public class ppt2 {
	public static void main(String[] args) {
		p3();
//		p6();
//		p7();
//		p8();
	}

	static Scanner scanner = new Scanner(System.in);

	public static void p3() {

		System.out.println("받은 돈 : ");
		int Money = scanner.nextInt();

		System.out.println("지불할 돈 : ");
		int PaidMoney = scanner.nextInt();

		int ChangeMoney = Money - PaidMoney;
		System.out.println("거스름돈 : " + ChangeMoney);
		
		int money10000 = ChangeMoney / 10000;

		int money5000 = (ChangeMoney%10000)/5000;

		int money1000 = (ChangeMoney%5000)/1000;

		int money500 = (ChangeMoney%1000)/500;

		int money100 = (ChangeMoney%500)/100;

		int money50 = (ChangeMoney%100)/50;

		int money10 = (ChangeMoney%50)/10;

		
		System.out.println("10000 - " + money10000);
		System.out.println("5000 - " + money5000);
		System.out.println("1000 - " + money1000);
		System.out.println("500 - " + money500);
		System.out.println("100 - " + money100);
		System.out.println("50 - " + money50);
		System.out.println("10 - " + money10);

	}

	public static void p6() {
		System.out.println("input an operation number------>");
		System.out.println("1 : +, 2 : -, 3 : *, 4 : /");
		int operationNum = scanner.nextInt();

		System.out.println("input the two number------>");
		int Num1 = scanner.nextInt();
		int Num2 = scanner.nextInt();

		switch (operationNum) {
		case 1:
			System.out.println(Num1 + Num2);
			break;
		case 2:
			System.out.println(Num1 - Num2);
			break;
		case 3:
			System.out.println(Num1 * Num2);
			break;
		case 4:
			System.out.println(Num1 / Num2);
			break;
		}
	}

	public static void p7() {
		System.out.println("What number do you want?");
		int Num = scanner.nextInt();

		for (int i = 1; i <= 9; i++) {
			System.out.println(Num + " X " + i + " = " + Num * i);
		}
	}

	public static void p8() {
		System.out.println("What number do you want?");
		int Num = scanner.nextInt();

		switch (Num) {
		case 2:
			for (int i = 1; i <= 9; i++) {
				System.out.println(2 + " X " + i + " = " + 2 * i);
			}
			break;
		case 3:
			for (int i = 1; i <= 9; i++) {
				System.out.println(3 + " X " + i + " = " + 3 * i);
			}
			break;
		case 4:
			for (int i = 1; i <= 9; i++) {
				System.out.println(4 + " X " + i + " = " + 4 * i);
			}
			break;
		case 5:
			for (int i = 1; i <= 9; i++) {
				System.out.println(5 + " X " + i + " = " + 5 * i);
			}
			break;
		case 6:
			for (int i = 1; i <= 9; i++) {
				System.out.println(6 + " X " + i + " = " + 6 * i);
			}
			break;
		case 7:
			for (int i = 1; i <= 9; i++) {
				System.out.println(7 + " X " + i + " = " + 7 * i);
			}
			break;
		case 8:
			for (int i = 1; i <= 9; i++) {
				System.out.println(8 + " X " + i + " = " + 8 * i);
			}
			break;
		case 9:
			for (int i = 1; i <= 9; i++) {
				System.out.println(9 + " X " + i + " = " + 9 * i);
			}
			break;
		}
	}
}
