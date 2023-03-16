package java0309;

import java.util.Scanner;

// 완료
public class A2 {
    static Scanner scanner = new Scanner(System.in);

    // A2 Banking System
    // This program runs indefinitely until the user tries terminating it
    // 완료

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        AA2();
    }

    static int Balance = 0;

    public static void AA2() {
        while (true) {

            System.out.println("#Menu \n" + "1. Deposit \n" + "2. Withdrawal \n" + "Balance : " + Balance);

            System.out.println();

            System.out.println("항목 선택 -> ");
            int num = scanner.nextInt();

            System.out.println("금액 입력 -> ");
            int money = scanner.nextInt();

            switch (num) {
            case 1:
                Balance += money;
                break;
            case 2:
                Balance -= money;
                break;
            }
            System.out.println("------------------------");
        }
    }
}
