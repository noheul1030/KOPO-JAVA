package java0314;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;

public class Test {

//	3. SCISSORS는 0, ROCK은 1 PAPER는 2로 정의하고 변하지 않는 전역 변수 선언[1점]

	final static int SCISSORS = 0; // 가위
	final static int ROCK = 1; // 바위
	final static int PAPER = 2; // 보

	static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		Test test = new Test();
		int count = 1;

//	2. main() 함수에 Integer형 arraylist인 mine, computer를 선언한다.[2점]
		ArrayList<Integer> mine = new ArrayList<Integer>();
		ArrayList<Integer> computer = new ArrayList<Integer>();

// 6. 사용자는nextInt()로 0,1,2만 낼 수 있고 전역변수의 것과 동일하며 조건문에서 전역변수를 활용해야 함
// 4. 컴퓨터(getRockPaperScissors())와 사용자가 겨뤄서 이길 때까지 무제한 수행되는 반복문 작성[2점]		
// 7.매회차마다 사용자의것은 mine에 컴퓨터의 것은 computer에 저장함
		try {

			while (true) {
				int input = test.input();
				int mineNum = input;
				int computerNum = test.getRockPaperScissosr();
				mine.add(input);
				computer.add(test.getRockPaperScissosr());

				// 예외처리
				if (mineNum >= 3 || mineNum < 0) {
					throw new Exception();
				}

				// 승리조건
				if (mineNum == SCISSORS) {
					if (computerNum == PAPER) {
						System.out.println("승리!");
						break;
					}
				} else if (mineNum == ROCK) {
					if (computerNum == SCISSORS) {
						System.out.println("승리!");
						break;
					}
				} else if (mineNum == PAPER) {
					if (computerNum == ROCK) {
						System.out.println("승리!");
						break;
					}
				}

				// 패배조건
				if (mineNum == SCISSORS) {
					if (computerNum == ROCK) {
						continue;
					}
				} else if (mineNum == ROCK) {
					if (computerNum == PAPER) {
						continue;
					}
				} else if (mineNum == PAPER) {
					if (computerNum == SCISSORS) {
						continue;
					}
				}
// 5. 이기는 조건은 일반적인 가위바위보와 동일하며 3번 비기면 사용자가 진것으로 간주하여 종료함[2점]
				if (mineNum == computerNum) {
					count++;
				}
				if (count == 3) {
					System.out.println("패배");
					break;
				}
				continue;

			}
//  8. 게임이 종료되면 history를 integer로 보여줌[2점]
			for (int i = 0; i < mine.size(); i++) {
				System.out.print("mine : [" + mine.get(i) + "]" + "\t");
				System.out.println("computer : [" + computer.get(i) + "]");
			}

		} catch (

		Exception e) {
			System.out.println("입력숫자 예외발생!");
		}
	}

//	1. getRockPaperScissors() 함수를 선언하고 랜덤 함수를 통해 0, 1, 2를 return 받는다.[2점]

	public int getRockPaperScissosr() {
		int randomNum = (int) (Math.random() * 3);
		return randomNum;
	}

	public int input() {
		return scanner.nextInt();
	}
}
