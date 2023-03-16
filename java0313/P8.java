package java0313;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class P8 {

	public static void main(String[] args) {
		sort();
	}

	
	public static void sort() {
		Integer[] list = {2,33,7,5,12,34,99,25,28,53,20};
		Arrays.sort(list);
		System.out.println("오름차순 Integer[] list : "+ Arrays.toString(list));
		Arrays.sort(list,Collections.reverseOrder());
		System.out.println("내림차순 Integer[] list : "+ Arrays.toString(list));
	}
}
