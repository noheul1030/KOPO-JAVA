package java0303;

import java.util.Scanner;

public class A1 {

	public static void main(String[] args) {
		Scanner();
	}

	public static void Scanner() {
		Scanner scanner = new Scanner(System.in);

		System.out.print("이름을 입력하세요 : ");
		String name = scanner.next();

		System.out.print("나이를 입력하세요 : ");
		int age = scanner.nextInt();

		System.out.print("취미을 입력하세요 : ");
		String hobby = scanner.next();

		System.out.println("My name is " + name);
		System.out.println("My age is " + age);
		System.out.println("My hobby is " + hobby);

	}
}