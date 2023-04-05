package java0309;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

// A1 Program to Calculate the Probabilities
// 사용자가 숫자 N과 M을 입력합니다.
// N개의 주사위를 던졌을 때 합이 M이 되는 모든 경우를 출력합니다.
// 미완료

public class A1 {
    static Scanner scanner = new Scanner(System.in);
    static List<Integer> diceList = new ArrayList<Integer>();

    public static void main(String[] args) {
        A1 a1 = new A1();
        int num1 = a1.inPut();
        int num2 = a1.inPut();
        randomDice();

        for (int i = 1; i < num1; i++) {
            for (int list1 : diceList) {
                if (diceList.get(list1 - 1) + list1 == num2) {
                    System.out.println("(" + diceList.get(list1 - 1) + "," + list1 + ")");
                }
            }
        }
//        for (int list1 : diceList) {
//            for (int list2 : diceList) {
//                if (list1 + list2 == num2) {
//                    System.out.println("(" + list1 + "," + list2 + ")");
//                }
//            }
//        }
    }

    // input 메서드
    public int inPut() {
        int num = scanner.nextInt();
        return num;

    }

    // 주사위 숫자 1~6
    public static void randomDice() {
        for (int i = 1; i <= 6; i++) {
            diceList.add(i);
        }
    }

}
