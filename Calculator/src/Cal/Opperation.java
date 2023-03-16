package Cal;

import java.util.Scanner;

public class Opperation {

	public static double addition(double num1, double num2) {
		return num1 + num2;
	}

	public static double subtraction(double num1, double num2) {
		return num1 - num2;
	}

	public static double multiplication(double num1, double num2) {
		return num1 * num2;
	}

	public static double division(double num1, double num2) {
		return num1 / num2;
	}

//	// String 타입으로 입력값을 받는다
//	public String inputNum() {
//		System.out.println("input a formula including only one operator");
//		String input = scanner.next();
//		System.out.println(input);
//		
//		return input;
//	}
//
//	// 입력받은 input 값을 char 버전으로 변형 return
//	public char getOperator(String input) {
//		char ca = 0;
//		int index = 0;
//		
//		for (int i = 0; i < input.length(); i++) {
//			if ((int) input.charAt(i) == 42) {
//				// index(i) 번째에 * 가 있다.
//				return input.charAt(i);
//			}
//			if ((int) input.charAt(i) == 43) {
//				// index(i) 번째에 + 가 있다.
//				return input.charAt(i);
//			}
//			if ((int) input.charAt(i) == 45) {
//				// index(i) 번째에 - 가 있다.
//				return input.charAt(i);
//			}
//			if ((int) input.charAt(i) == 47) {
//				// index(i) 번째에 / 가 있다.
//				return input.charAt(i);
//			}
//		}
//		
//		int num1 = Integer.parseInt(input.substring(0,index - 1));
//		int num2 = Integer.parseInt(input.substring(index + 1, input.length()));
//		return ca;
//	}
//	
}
