package java0309;

import java.util.Scanner;

public class A8 {

    // A8 Encoding and Decoding Program
    // 메뉴를 출력합니다.
    // 사용자가 메뉴를 선택합니다.
    // 인코더와 디코더는 아래 규칙을 따릅니다.
    // 완료

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        A8 a8 = new A8();
        a8.menu();

        while (true) {
            int inputNum = a8.inputNum();

            // 3. Exit
            if (inputNum == 3) {
                System.out.println("시스템 종료");
                System.exit(0);
            }

            String inputString = a8.inputString();

            a8.swith(inputNum, inputString);
            System.out.println();
        }
    }

    // 메뉴 출력
    public void menu() {
        System.out.println("#Menu \n" + "1. Encoder \n" + "2. Decoder \n" + "3. Exit");
    }

    // 메뉴 선택 숫자 , 문자 입력
    public int inputNum() {
        return scanner.nextInt();
    }

    public String inputString() {
        return scanner.next();
    }

    // 스위치 선택
    public void swith(int inputNum, String inputString) {
        byte[] list = new byte[inputString.length()];

        switch (inputNum) {
        // 1. Encoder
        case 1:
            for (int i = 0; i < inputString.length(); i++) {
                list[i] = ((byte) inputString.charAt(i));
            }
            for (int i = 0; i < list.length; i++) {
                System.out.print((char) (list[i] + 49));
            }
            break;

        // 2. Decoder
        case 2:
            for (int i = 0; i < inputString.length(); i++) {
                list[i] = ((byte) inputString.charAt(i));
            }
            for (int i = 0; i < list.length; i++) {
                System.out.print((char) (list[i] - 49));
            }
            break;
        }
    }
}
