package java0314;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class A1 {
	
	// A1 Numbering
//	사용자는 일련의 숫자를 입력하고 이를 큐에 할당합니다.
//	사용자는 일련의 숫자 중 하나를 입력합니다.
//	출력 순서대로 숫자를 출력합니다.
//	예외문을 추가합니다.
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
		int count = 0;
		int input = scanner.nextInt();
		
		for (int i = 0; i < queue.size(); i++) {
			count++;
			if(input == queue.poll()) {
				break;
			}
		}
		System.out.println(count);
	}
}
