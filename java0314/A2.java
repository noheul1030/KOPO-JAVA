package java0314;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class A2 {

	// A2 Numbering2
	// 완료
		
		static Scanner scanner = new Scanner(System.in);
		
		public static void main(String[] args) {
			try {
 				count(queue());
				
			} catch (ArrayIndexOutOfBoundsException e) {
				System.out.println("ArrayIndexOutOfBoundsException 예외!");
			}
			catch (Exception e) {
				// TODO: handle exception
				System.out.println("exception!");
			}
		}
		 
		public static Queue<Integer> queue() {
			Queue<Integer> queue = new LinkedList<>();
			
			String[] input = scanner.nextLine().split(" ");
			
			for (int i = 0; i < 6; i++) {
				queue.add(Integer.parseInt(input[i]));
			}
			return queue;
		}
		
		public static void count(Queue<Integer> queue) {
			int input = scanner.nextInt();
			
			for (int i = 0; i < queue.size(); i++) {
				if(input == queue.peek()) {
					break;
				}else {
					queue.remove();
				}
			}
			System.out.println(queue.size());
		}

}
