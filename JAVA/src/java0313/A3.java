package java0313;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class A3 {

	// A3 Encryption
	// User inputs a string
	// Print the encrypted string
	// 사용자는 문자열을 입력합니다.
	// 암호화된 문자열을 출력합니다.
	// 문자열을 암호화하기 위해 문자와 일대일로 대응하는 배열을 사용합니다.
	// (예: 원래 배열 = {1, 2, 3}, 암호화된 배열 = {a, b, c})
	// 완료
	static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		A3 a3 = new A3();
		char[] input = a3.input().toCharArray();
		a3.Encryption(input);
	}

	public String input() {
		return scanner.nextLine();
	}

	public void Encryption(char[] input) {
		char[] Encryption1 = new char[26];
		List<Character> Encryption2 = new ArrayList<Character>();

		for (int i = (byte) 'a'; i <= (byte) 'z'; i++) {
			Encryption1[i - 97] = (char) i;
		}

		for (char c : Encryption1)
			Encryption2.add(c);

		Collections.reverse(Encryption2);
		
		int indexNum = 0;
		for (int i = 0; i < input.length; i++) {
			indexNum = Arrays.binarySearch(Encryption1, input[i]);
			System.out.print(Encryption2.get(indexNum));
		}
		
		
	}

}
