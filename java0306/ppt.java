package java0306;

import java.util.Iterator;
import java.util.Scanner;

public class ppt {
	public static void main(String[] args) {
//		A1();
//		A2();
//		A3();
//		A4();
//		A5();
//		A6();
//		A7();
//		A8();
//		A9();
//		A10();
		
	}

	// 완료
	public static void A1() {
		for (int i = 2; i <= 9; i++) {
			if (i > 0) {
				for (int j = 1; j <= 9; j++) {
					System.out.println(i + " X " + j + " = " + (i * j));
				}
			}
		}
	}
	
	//  완료
	public static void A2() {
		int i = 2;
		int j = 1;
		
		while (i < 10) {
			while (j < 10) {
				System.out.println(i + " X " + j + " = " + (i * j));
				j++;

				switch (j) {
				
				case 10:
					i++;
					System.out.println();
					j = 1;
				}
				break;
			}
		}
	}

	static Scanner scanner = new Scanner(System.in);

	// 완료
	// 별 입력 값 하나씩 증가
	public static void A3() {
		System.out.println("input a number : ");
		int Num = scanner.nextInt();

		for (int i = 0; i < Num; i++) {
			for (int j = 0; j < i + 1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

	// 완
	// 별 피라미드 정방향 찍기
	public static void A4() {
		System.out.println("input a number : ");
		int Num = scanner.nextInt();
		int j;
		
		for (int i = 1; i <= Num; i++) {
			for (j = 1; j <= Num - i; j++) {
				System.out.print(" ");
			}
			for (; j < Num + i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}

	}
	
	// 별 피라미드 역방향 찍기
	public static void A5() {
		System.out.println("input a number : ");
		int Num = scanner.nextInt();
		int j;
		
		for (int i = Num; i >= 1; i--) {
			for (j = 1; j <= Num - i; j++) {
				System.out.print(" ");
			}
			for (; j < Num + i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

	// 완료
	// 입력 값 안에 포함되는 소수 구하기
	public static void A6() {
		System.out.println("input a number : ");
		int Num = scanner.nextInt();

		while (Num != 0) {
			if (Num / 1 == Num) {
				System.out.println("1");
				if (Num % 2 == 0) {
					System.out.println("2");
				}
				if (Num % 3 == 0) {
					System.out.println("3");
				}
				if (Num % 5 == 0) {
					System.out.println("5");
				}
				if (Num % 7 == 0) {
					System.out.println("7");
				}
				break;
			}
		}
	}

//	// 완료
//	public static void A6_1() {
//		System.out.println("input a number : ");
//		int Num = scanner.nextInt();
//				
//		for(int i=1;i<Num;i++) {
//			if(Num%i==0) System.out.println(i);
//		}
//	}

	// 완료 
	// 최소공배수
	public static void A7() {
		System.out.println("input the two number : ");
		int Num1 = scanner.nextInt();
		int Num2 = scanner.nextInt();

		while (Num1 != 0 || Num2 != 0) {
			if (Num1 == Num2) {
				System.out.println(Num1);
				break;
			}
			if (Num1 != Num2) {
				if (Num1 % Num2 == 0) {
					System.out.println(Num1);
					break;
				} else if (Num2 % Num1 == 0) {
					System.out.println(Num2);
					break;
				} else {
					System.out.println(Num1 * Num2);
					break;
				}

			}
		}
	}

	// 완 
	// 최대공약수
	public static void A8() {
		System.out.println("input the two number : ");
		int Num1 = scanner.nextInt();
		int Num2 = scanner.nextInt();
		
		int Num3 = 0;
		int Num4 = 0;
		
		if(Num1 <= Num2) {
			Num3 = Num1;
		}else {
			Num3 = Num2;
		}
		
		if (Num1 == Num2) {
			System.out.println(Num1);
		}
		for (int i = 1; i <= Num3; i++) {
			if (Num1 % i == 0 && Num2 % i == 0) {
				Num4 = i;
			}
		}
		System.out.println(Num4);
	}

	// 완료
	// 입력된 값 안의 소수 구하기
	public static void A9() {
		System.out.println("input a number : ");
		int Num = scanner.nextInt();

		for (int i = 1; i <= Num; i++) {
			for (int j = 2; j <= i; j++) {
				if (i % j == 0)
					if (i == j) {
						System.out.println(j);

					} else
						break;
			}
		}
	}
	
	// 완료
	// 메뉴 만들고 잔돈계산하기
	public static void A10() {
		System.out.println("input the money : ");
		int money = scanner.nextInt();
		int menuMoney = 0;
		
		while (money > 0) {
			System.out.println("#Menu");
			System.out.println("1. Coke - 340");
			System.out.println("2. Orange Juice - 500");
			System.out.println("3. Milk - 650");
			System.out.println("4. Water - 290");
			System.out.println("5. Coffee - 170");
			System.out.println("6. exit");
			int Num = scanner.nextInt();

			switch(Num) {
			case 1:
				menuMoney = 340;
				break;
			case 2:
				menuMoney = 500;
				break;
			case 3:
				menuMoney = 650;
				break;
			case 4:
				menuMoney = 290;
				break;
			case 5:
				menuMoney = 170;
				break;
			case 6:
				break;
			}
			break;
		}
		
		int changeMoney = money - menuMoney;
		
		int change100 = 0;
		change100 = changeMoney/100;
		
		int change50 = 0;
		change50 = (changeMoney - (change100*100)) / 50;
		
		int change10 = 0;
		change10 = (changeMoney - (change100*100) - (change50*50)) / 10;
		
		System.out.println("The change is "+ changeMoney + 
				"(100 X "+ changeMoney + 
				", 50 X "+ change50 + 
				", 10 X "+ change10 +")");
	}




/* UTF-8 이란?
 * UTF(Unicode-Transformation-Format)는 유니코드 형태의 문자를 변환하기 위한 규격이다. 
 * 이는 가변 길이 문자 인코딩 방식으로, 부호 길이(비트수)에 따라 UTF-8, UTF-16, UTF-32 등이 있다. 
 * 이들 모두는가변 길이 인코딩 방식이기 때문에 아스키(ASCII) 코드의 길이에 맞춰 호환이 가능하다.
 * 현재 대부분의 텍스트는 UTF-8로 저장되고 있는데, UTF-8 인코딩은 문자열을 8bit 기반으로 저장한다. 
 * 즉, 영문과 숫자 기호는 1byte로, 한글과 한자 등은 3byte로 가변적으로 저장하는 방식으로 
 * 전 세계 모든 글자들을 한꺼번에 표현할 수 있다.
 */

}






