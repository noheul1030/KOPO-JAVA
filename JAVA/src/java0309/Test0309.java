package java0309;

import java.util.Scanner;

public class Test0309 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		test();

	}

	public static void test() {
		Scanner scanner = new Scanner(System.in);

		int[] num = new int[3];
// 1. 사용자로부터 3개의 정수형 숫자를 입력받아 변수에 대입하세요

		for (int i = 0; i < num.length; i++) {
			System.out.println("숫자를 입력하세요.");
			int num1 = scanner.nextInt();
			num[i] = num1;

			// 2. 홀수만 입력받을 수 있고, 짝수라면 재입력하도록 예외처리하세요
			
			// 다시 재시작 하게 해야하는데 어떻게 해야할까?
			if (num1 % 2 == 0) {
				System.out.println("홀수의 숫자로 재입력하세요.");

				// 2. 입력값은 1에서 999 사이의 값만 입력할 수 있고 그 외의 값은 재입력하도록 예외 처리하세요
				if (num1 < 1 || num1 > 1000) {
					System.out.println("입력값은 1~999까지의 숫자로 재입력하세요.");
					
				}
			}
		}

// 3. 특별한 함수 사용없이 비교 연산자와 조건문을 통해 3개의 숫자를 큰 순서대로 출력하세요
		int aa = 0; // 제일 큰 수
		int bb = 0; // 중간 수
		int cc = 0; // 제일 작은수

		if (num[0] > num[1] && num[0] > num[2]) {
			aa = num[0];
			if (num[1] > num[2]) {
				bb = num[1];
				cc = num[2];
				System.out.println(num[0] + " " + num[1] + " " + num[2]);
			} else {
				bb = num[2];
				cc = num[1];
				System.out.println(num[0] + " " + num[2] + " " + num[1]);
			}
		} else if (num[1] > num[0] && num[1] > num[2]) {
			aa = num[1];
			if (num[0] > num[2]) {
				bb = num[0];
				cc = num[2];
				System.out.println(num[1] + " " + num[0] + " " + num[2]);
			} else {
				bb = num[2];
				cc = num[0];
				System.out.println(num[1] + " " + num[2] + " " + num[0]);
			}
		} else if (num[2] > num[0] && num[2] > num[1]) {
			aa = num[2];
			if (num[0] > num[1]) {
				bb = num[0];
				cc = num[1];
				System.out.println(num[2] + " " + num[0] + " " + num[1]);
			} else {
				bb = num[1];
				cc = num[0];
				System.out.println(num[2] + " " + num[1] + " " + num[0]);
			}
		}
		System.out.println("aa = " + aa);
		System.out.println("bb = " + bb);
		System.out.println("cc = " + cc);

// 4. 특별한 함수 사용없이 비교 연산자와 조건문을 통해 3개의 숫자를 작은 순서대로 출력하세요

		if (num[0] < num[1] && num[0] < num[2]) {
			if (num[1] < num[2]) {
				System.out.println(num[0] + " " + num[1] + " " + num[2]);
			} else {
				System.out.println(num[0] + " " + num[2] + " " + num[1]);
			}
		} else if (num[1] < num[0] && num[1] < num[2]) {
			if (num[0] < num[2]) {
				System.out.println(num[1] + " " + num[0] + " " + num[2]);
			} else {
				System.out.println(num[1] + " " + num[2] + " " + num[0]);
			}
		} else if (num[2] < num[0] && num[2] < num[1]) {
			if (num[0] < num[1]) {
				System.out.println(num[2] + " " + num[0] + " " + num[1]);
			} else {
				System.out.println(num[2] + " " + num[1] + " " + num[0]);
			}
		}

// 5. 세 개의 숫자의 평균값과 합을 출력하세요
		int 합 = num[0] + num[1] + num[2];
		int 평균값 = 합 / num.length;
		System.out.println("평균값 = " + 평균값 + " 합 = " + 합);

// 6. 세 개의 숫자 중 3의 배수의 갯수를 출력하세요	
		int count = 0;

		for (int i = 0; i < num.length; i++) {
			if (num[i] % 3 == 0) {
				count++;
			}
		}
		System.out.println("3의 배수의 갯수 : " + count);

// 7. 제일 큰 숫자가 제일 작은 숫자로 나누어 떨어지는지 true, false로 나타내세요	
		if (aa % cc == 0) {
			System.out.println(true);
		} else {
			System.out.println(false);
		}

// 8. 두 번째로 큰 숫자가 첫 번째, 세 번째 숫자의 평균값보다 크면 true, 작으면 false로 나타내세요

	}
}