package java0303;

import java.util.Scanner;

public class NewMember {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		NumberGame();
//		NumberGame2();
//		Hello();
//		Scanner();
//		Caleander();
	}

	public static void Caleander() {

		System.out.println("Fed.");
		System.out.println("Sun\tMon\tTue\tWed\tThu\tFri\tSat");

		int Num = 0;
		for (int i = 0; i < 29; i++) {
			Num++;
			if (i < 6) {
				System.out.print("\t" + Num);
			} else if (i >= 6) {
				System.out.print("\n"+ Num +"\t");
			}
		}

	}

//			System.out.println("\n\t" +Num+ "\t" +Num+ "\t" +Num+ "\t" +Num+ "\t" +Num+ "\t" +Num);

	public static void Scanner() {
		Scanner scanner = new Scanner(System.in);

//		System.out.print("이름을 입력하세요 : ");
//		String name = scanner.next();
//
//		System.out.print("나이를 입력하세요 : ");
//		int age = scanner.nextInt();
//
//		System.out.print("취미을 입력하세요 : ");
//		String hobby = scanner.next();
//
//		System.out.println("My name is " + name);
//		System.out.println("My age is " + age);
//		System.out.println("My hobby is " + hobby);

		System.out.println("Input the first number!");
		int num1 = scanner.nextInt();

		System.out.println("Input the first number!");
		int num2 = scanner.nextInt();

		int result = num1 + num2;
		System.out.println(num1 + " + " + num2 + " = " + result);
	}

	public static void Hello() {
		System.out.print("Hello Would!");
		System.out.print("Hello Would!");
		System.out.print("Hello Would!");
	}

	public static void funcHead() {
		System.out.println("Head");
	}

	public static void funcNeck() {
		System.out.println("Neck");
	}

	public static void funcArm() {
		System.out.println("Arm");
	}

	public static void NumberGame() {
		int i = 2;
		while (i <= 9) {
			for (int j = 1; j <= 9; j++) {
				System.out.print(i + " * " + j + "= " + (i * j) + "\t");
			}
			i++;
			System.out.println();
		}
	}

	public static void NumberGame2() {
		for (int i = 2; i <= 9; i++) {
			for (int j = 1; j <= 9; j++) {
				System.out.print(j + " * " + i + " = " + (i * j) + "\t");
			}
			System.out.println();
		}
	}
}
