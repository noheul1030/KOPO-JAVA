package java0313;

import java.util.Scanner;

public class Array {
	static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		
// 		이중배열
//		int[][] numbers = new int[3][5];
//		int count = 0;
//		
//		for (int i = 0; i < 3; i++) {
//			for (int j = 0; j < 5; j++) {
//				numbers[i][j] = count;
//				count++;
//			}
//		}
//		
//		for (int i = 0; i < 3; i++) {
//			for (int j = 0; j < 5; j++) {
//				System.out.print(numbers[i][j] + "\t");
//			}
//			System.out.println();
//		}
		
		int[][] numbers = {{1,2,3},{4,5},{6,7,8,9}};
//		System.out.println(numbers.length);
		for (int i = 0; i < numbers.length; i++) {
			for (int j = 0; j < numbers[i].length; j++) {
				System.out.print(numbers[i][j] + " ");
			}
			System.out.println();
		}
		
		
		
	}
}
