package java0310;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class A9 {

    // A9 Time Calculator
    // 사용자가 두 시간 정보를 입력합니다.
    // 그리고 그 사이의 계산된 시간 간격을 초 단위로 출력합니다.
    // 완료
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        A9 a9 = new A9();
        String inputTime = a9.inputTime();
        String inputTime2 = a9.inputTime();
        a9.changeTime(inputTime, inputTime2);
        a9.calculatorTime();
    }

    // number input
    public String inputTime() {
        return scanner.next();
    }

    // two List
    List<Integer> Time1 = new ArrayList<Integer>();
    List<Integer> Time2 = new ArrayList<Integer>();

    // inputs the two number in save two List
    public void changeTime(String inputTime, String inputTime2) {
        for (int i = 0; i < inputTime.length(); i += 2) {
            Time1.add(Integer.parseInt(inputTime.substring(i, i + 2)));
        }
        for (int i = 0; i < inputTime2.length(); i += 2) {
            Time2.add(Integer.parseInt(inputTime2.substring(i, i + 2)));
        }
    }

    // Compare two list values
    public int calculatorTime() {
        int h = 0;
        int m = 0;
        int s = 0;

        for (int i = 0; i < 3; i++) {
            switch (i) {
            case 0:
                h = (Time1.get(i) - Time2.get(i)) * 3600;
            case 1:
                m = (Time1.get(i) - Time2.get(i)) * 60;
            case 2:
                s = (Time1.get(i) - Time2.get(i));
            }
        }

        int sum = Math.abs(h + m + s);
        System.out.println(sum + "s");

        return sum;
    }

}
