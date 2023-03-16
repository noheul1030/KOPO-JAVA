package java0307;

import java.util.Scanner;

public class class1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		a1();
//		a2();
//		a3();
//		a4();
//		a5();
//		a6();
//		a7();
//		a8();
//		a9();
//		a10();
//		a11();
		a12();
	}

	static Scanner scanner = new Scanner(System.in);

	public static void a1() {
		String text = "hi hello?";
		if (text.contains("hi") == true) {
			System.out.println("It's hello");
		} else {
			System.out.println("It's not hello");
		}
	}

	public static void a2() {
		int n = 10;
		int sum = 0;
		for (int i = 1; i < n + 1; i++) {
			sum += i;
		}
		System.out.println(sum);
		System.out.println();

		for (int i = 1; i < 6; i++) {
			System.out.println(i);
		}
		System.out.println();

		int i = 0;
		while (i < 5) {
			i++;
			System.out.println(i);
		}
	}

	public static void a3() {
		System.out.println("숫자를 입력하세요 >>> ");
		int Num = scanner.nextInt();

		if (Num > 0) {
			for (int i = 1; i <= 9; i++) {
				System.out.println(Num + " X " + i + " = " + Num * i);
			}
		}
	}

	public static void a4() {
		System.out.println("숫자를 입력하세요 >>> ");
		int Num = scanner.nextInt();
		int Sum = 0;

		for (int i = 0; i < Num + 1; i++) {
			Sum += i;
		}
		System.out.println(Sum);
	}

	public static void a5() {
		System.out.println("숫자 두개를 입력하세요 >>> ");
		int Num1 = scanner.nextInt();
		int Num2 = scanner.nextInt();
		int Sum = 0;

		for (int i = 1; i <= Num1; i += Num2) {
			Sum += i;
		}
		System.out.println(Sum);
	}

	public static void a6() {
		for (int i = 0; i < 3; i++) {
			if (i == 0) {
				for (int j = 0; j < i + 2; j++) {
					System.out.print("*");
				}
				System.out.println();
			} else if (i == 1) {
				for (int j2 = 0; j2 < i + 3; j2++) {
					System.out.print("@");
				}
				System.out.println();
			} else {
				for (int j = 0; j < i + 4; j++) {
					System.out.print("!");
				}
				System.out.println();
			}
		}
	}
	
	public static void a7() {
		int i = 1;
		while(true) {
			System.out.println("*");
			i++;
			if (i == 4)
				break;
		}
	}
	
	public static void a8() {
		int i = 0;
		do {
			System.out.println(i);
			i++;
		} while (i <= 0);
		
	}
	
	public static void a9() {
		while (true) {
			System.out.println("Menu");
			System.out.println("1. Coke");
			System.out.println("2. exit");
			int n = scanner.nextInt();
		}
	}
	
	public static void a10() {
		System.out.println("채팅을 시작합니다.");
		while (true) {
			String input = scanner.next();
			if (input.contains("안녕")) {
				System.out.println("안녕하세요.");
			}
			else if (input.contains("몇살")) {
				System.out.println("나는 31살, 너는?");
			}
			else if (input.contains("취미")) {
				System.out.println("나는 맛집 찾는게 취미야!");
			}
			else if (input.contains("사는곳")) {
				System.out.println("나는 인천에 살아");
			}
			else if (input.contains("나갈게")) {
				System.out.println("응!안녕!");
				System.out.println("채팅을 종료합니다.");
				break;
			}
			
		}
	}
	
	public static void a11() {
	// ASCI 코드, UNICODE
		byte a1 = 'a';
		byte a2 = 'A';
		
		System.out.println(a1);
		System.out.println(a2);
		
		Character A1 = (char)a1;
		Character A2 = (char)a2;
		
		System.out.println(A1);
		System.out.println(A2);
		
		for (int i = 97; i < 97 + 26; i++) {
			System.out.print((char)i);
		}
	}
	
	public static void a12() {
		System.out.println("I am a boy");
		String str = scanner.nextLine();
		
		for (int i = 0; i < str.length(); i++) {
			byte b = 0;
			if (str.charAt(i) >= 65 && str.charAt(i) < 90) {
				b += (byte) str.charAt(i) + 32;
				char c = (char)b;
				System.out.print(c);
			}
			else if (str.charAt(i) >= 97 && str.charAt(i) <=122) {
				b += (byte) str.charAt(i) - 32;
				char c = (char)b;
				System.out.print(c);
			}
			else {
				b += 32;
				char c = (char)b;
				System.out.print(c);
			}
		}

	}

}
