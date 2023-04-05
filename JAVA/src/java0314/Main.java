package java0314;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = 0;
		
		try {
			n = scanner.nextInt();
		} catch (InputMismatchException e) {
			
		} catch (Exception e) {
			
		}
		System.out.println("finish");

	}

}
