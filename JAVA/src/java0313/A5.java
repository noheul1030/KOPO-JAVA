package java0313;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class A5 {

	
	// A5 Split a String and Sort

	static Scanner scanner = new Scanner(System.in);
	
	public static void main(String[] args) {
		A5 a5 = new A5();
		String[] input = a5.input();
		a5.splitPrint(input);
		a5.sort(input);
	}
	
	
	public String[] input() {
		return scanner.nextLine().split(" ");
	}
	
	public void splitPrint(String[] input) {
		for (int i = 0; i < input.length; i++) {
			System.out.print(input[i]);
		}
		System.out.println();
	}
	
	public void sort(String[] input) {
	
		Arrays.sort(input);
		
		for (int i = 0; i < input.length; i++) {
			System.out.print(input[i]);
			
		}
	}
}
