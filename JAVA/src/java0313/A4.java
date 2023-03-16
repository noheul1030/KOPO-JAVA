package java0313;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class A4 {

	// A4 Decryption
	// 이전의 관행대로, 사용자는 문자열을 입력합니다.
	// 해독된 문자열을 출력합니다.
	// 완료
	
	static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		A4 a4 = new A4();
		char[] input = a4.input().toCharArray();
		a4.Encryption(input);
	}
	
	public String input() {
		return scanner.nextLine();
	}

	public void Encryption(char[] input) {
		char[] Decryption1 = new char[26]; // 정방향 소문자
		List<Character> Decryption2 = new ArrayList<Character>(); // 역방향 리스트
		
		for (int i = (byte) 'a'; i <= (byte) 'z'; i++) {
			Decryption1[i - 97] = (char) i;
		}

		for (char c : Decryption1) {
			Decryption2.add(c);
		}

		Collections.reverse(Decryption2);
		
		int indexNum = 0;
		for (int i = 0; i < input.length; i++) {
			indexNum = Decryption2.indexOf(input[i]);
			System.out.print(Decryption1[indexNum]);
		}

	}

}
