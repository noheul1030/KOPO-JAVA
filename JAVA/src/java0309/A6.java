package java0309;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class A6 {

    // A6 Compose a program with the conditions below
    // 당신의 스마트폰을 사용하여 웹에서 프로그램을 작성하세요.
    // 자음과 모음의 수를 계산하는 프로그램을 작성하세요.
    // 이 프로그램은 사용자의 입력 문자열에 따라 동적으로 작동해야 합니다."
    // 완료

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        A6 a6 = new A6();

        while (true) {
            String input = a6.inputString();
            List<String> stringList = a6.stringList(input);

            int vowelsNum = a6.vowels(stringList);
            int consonantNum = a6.consonant(stringList, vowelsNum);

            System.out.println("Num.of Consonant : " + consonantNum);
            System.out.println("Num.of Vowels : " + vowelsNum);
        }
    }

    // 값을 입력받는다.
    public String inputString() {
        return scanner.nextLine();
    }

    // 입력받은 값을 쪼개서 list에 저장한다.
    public List<String> stringList(String input) {
        List<String> stringList = new ArrayList<String>();

        for (int i = 0; i < input.length(); i++) {
            stringList.add(input.substring(i, i + 1));
        }
        while (stringList.remove(" "))
            ;
        return stringList;
    }

    String vowels = "AEIOUaeiou";

    // 자음의 개수를 구한다.
    public int consonant(List<String> stringList, int vowelsNum) {

        return stringList.size() - vowelsNum;
    }

    // 모음의 개수를 구한다.
    public int vowels(List<String> stringList) {
        int vowelsNum = 0;
        for (int i = 0; i < stringList.size(); i++) {
            for (int j = 0; j < vowels.length(); j++) {
                if (stringList.get(i).contains(vowels.substring(j, j + 1))) {
                    vowelsNum++;
                }
            }
        }
        return vowelsNum;
    }
}
