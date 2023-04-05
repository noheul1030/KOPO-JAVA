package java0314;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class A3 {

	// A3 Grade Card

//	사용자는 이름과 점수를 10개 이상 입력합니다.
//	이름을 오름차순으로 나열하여 리스트를 출력합니다.
//	이름을 내림차순으로 나열하여 리스트를 출력합니다.
//	점수를 오름차순으로 나열하여 리스트를 출력합니다.
//	점수를 내림차순으로 나열하여 리스트를 출력합니다.
//	예외 처리 문을 추가합니다.
	// 완료

	public static void main(String[] args) {
		A3 a3 = new A3();
		System.out.println("이름,점수를 입력하세요 >>>  \n" + "exit를 입력시 입력은 종료됩니다.");
		List<String> list = a3.list();

		try {
			if (list.size()/2 < 10) {
				System.out.println("10개 이상의 입력값을 넣어주세요.");
				throw new Exception();
			}
			
			a3.name(list);
			a3.score(list);
		} catch (Exception e) {
			System.out.println("예외가 발생하였습니다!");
		}
	}

	public String input() {
		Scanner scanner = new Scanner(System.in);
		return scanner.nextLine();
	}

	public List<String> list() {
		List<String> list = new ArrayList<String>();
		while (true) {

			String input = this.input();
			if (input.equals("exit")) {
				break;
			}
			String[] arrlist = input.split(" ");
			for (String arr : arrlist) {
				list.add(arr);
			}
		}
		return list;
	}

	public void name(List<String> list) {
		List<String> nameList = new ArrayList<String>();

		for (int i = 0; i < list.size(); i += 2) {
			nameList.add(list.get(i));
		}

		Collections.sort(nameList);
		System.out.println("<  이름 오름차순  > \n" + nameList);

		Collections.reverse(nameList);
		System.out.println("<  이름 내림차순  > \n" + nameList);
		System.out.println();

	}

	public void score(List<String> list) {
		List<String> scoreList = new ArrayList<String>();

		for (int i = 1; i < list.size(); i += 2) {
			scoreList.add(list.get(i));
		}

		Collections.sort(scoreList);
		System.out.println("<  점수 오름차순  > \n" + scoreList);

		Collections.reverse(scoreList);
		System.out.println("<  점수 내림차순  > \n" + scoreList);
		System.out.println();

	}
}
