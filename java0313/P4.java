package java0313;

import java.util.Scanner;

public class P4 {
	static Scanner scanner = new Scanner(System.in);
	
	public static void main(String[] args) {
//		String words = "kim,lee,park";
//		String[] names = words.split(",");
//		
//		for (int i = 0; i < names.length; i++) {
//			System.out.println(names[i]);
//		}
		String str = "kim lee park";
		String[] strList = str.split(" ") ;
		
		for (int i = 0; i < strList.length; i++) {
			System.out.println(strList[i]);
		}
		
	}
}
