package java0314;

import java.util.Scanner;

// 다시 보완해야함
public class P8 {

	static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		while (true) {
			int input1 = scanner.nextInt();
			String[] str = scanner.nextLine().split(" ");
			String[] Num = new String[input1];

			for (int i = 0; i < Num.length; i++) {
				Num[i] = str[i];
			}
			
		}
	}
}
