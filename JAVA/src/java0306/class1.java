package java0306;

import java.util.Scanner;

public class class1 {
	public static void main(String[] args) {
//		Variable();
//		Char();
//		Variable2();
//		Arithmetic();
//		Calculating();
//		Conventer();
//		Assignment();
		Switch();
	}

	public static void Variable() {
		byte bTemp = 121;
		short sTemp = 12312;
		int iTemp = 777;
		long lTemp = 12313223;
		float fTemp = 1.123456789f;
		double dTemp = 1.123456789;
		boolean boolTemp = true;
		char cTemp = 'A';
		System.out.println(bTemp);
		System.out.println(sTemp);
		System.out.println(iTemp);
		System.out.println(lTemp);
		System.out.println(fTemp);
		System.out.println(dTemp);
		System.out.println(boolTemp);
		System.out.println(cTemp);
	}

	public static void Char() {
		char char1 = 'A';
		System.out.println(char1);

		char1 = 'B';
		System.out.println(char1);

		char1 = 'C';
		System.out.println(char1);
	}

	public static void Variable2() {
		int iTemp = 49;
		System.out.println((char) iTemp);

		iTemp = (int) '2';
		System.out.println(iTemp);
	}

	public static void Arithmetic() {
		int a = 5;
		int b = 3;
		System.out.println(a + b);
		System.out.println(a - b);
		System.out.println(a * b);
		System.out.println(a / b);
		System.out.println(a % b);

		System.out.println(a++);
		System.out.println(--a);
		System.out.println(b--);
		System.out.println(--b);
	}

	public static void Calculating() {

		Scanner scanner = new Scanner(System.in);

		System.out.println("받은 돈 : ");
		int Money = scanner.nextInt();

		System.out.println("지불할 돈 : ");
		int PaidMoney = scanner.nextInt();

		int ChangeMoney = Money - PaidMoney;
		System.out.println("거스름돈 : " + ChangeMoney);

		int money10000 = ChangeMoney / 10000;
		ChangeMoney%=10000;
		int money5000 = ChangeMoney / 5000;
		int money1000 = ChangeMoney / 1000;
		int money500 = ChangeMoney / 500;
		int money100 = ChangeMoney / 100;
		int money50 = ChangeMoney / 50;
		int money10 = ChangeMoney / 10;
		

		System.out.println("10000 - " + money10000);
		System.out.println("5000 - " + money5000);
		System.out.println("1000 - " + money1000);
		System.out.println("500 - " + money500);
		System.out.println("100 - " + money100);
		System.out.println("50 - " + money50);
		System.out.println("10 - " + money10);
	}

	public static void Conventer() {
		Scanner scanner = new Scanner(System.in);
		int base34 = scanner.nextInt();
		int base = base34 / 3;

		int digit4 = base34 % 3; // 34 % 3 = 1

		int digit3 = base % 3; //  11 % 3 = 2
		base = base / 3; // 11 / 3 = 3
		
		int digit2 = base % 3; // 3 % 3 = 0
		base = base / 3; // 1

		int digit1 =  base % 3; // 1 % 3 = 1
		

		System.out.print(digit1); // 1
		System.out.print(digit2); // 0
		System.out.print(digit3); // 2
		System.out.print(digit4); // 1

	}

	public static void Assignment() {
		int x = 7;
		System.out.println(x);

		x += 3;
		System.out.println(x);

		x -= 3;
		System.out.println(x);

		x *= 3;
		System.out.println(x);

		x /= 3;
		System.out.println(x);

		x %= 3;
		System.out.println(x);

		x = 10;
		System.out.println(x);

		x &= 3;
		System.out.println(x);

		x |= 3;
		System.out.println(x);

		x = 10;
		System.out.println(x);

		x ^= 3;
		System.out.println(x);
//		
//		x >>= 3;
//		System.out.println(x);
//		
//		x <<= 3;
//		System.out.println(x);
//		
	}

	public static void aa() {
		Scanner scanner = new Scanner(System.in);
		int input = scanner.nextInt();

		if (input == 1) {
			System.out.println("One!");
		} else if (input == -1) {
			System.out.println("Minus One!");
		} else {
			System.out.println("Not again!");
		}

	}
	
	public static void Switch() {
		Scanner scanner = new Scanner(System.in);
		int input = scanner.nextInt();
		
		switch(input) {
		case 1:
			System.out.println("correct");
			break;
		case 2:
			System.out.println("incorrect");
			break;
		default:
			System.out.println("error");
			break;
		
		}
		
		if(input == 1) {
			System.out.println("correct");
		}else if(input == 2) {
			System.out.println("incorrect");
		}else {
			System.out.println("error");
		}
	}

}
