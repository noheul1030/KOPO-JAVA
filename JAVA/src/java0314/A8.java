package java0314;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;

// 완료
public class A8 {

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        A8 a8 = new A8();
        try {
            String input1 = a8.input();
            String input2 = a8.input();

            // input한 글자의 수가 20이 넘으면 강제 예외처리!
            if (input1.length() > 20 || input2.length() > 20) {
                throw new Exception();
            }

            a8.count(a8.firstSize(input1), a8.secondSize(input2));

        } catch (Exception e) {
            System.out.println("예외처리가 발생했습니다!");
        }
    }

    public String input() {
        return scanner.next();
    }

    // 입력받은 첫번째 input을 HashSet으로 중복제거 후 List 저장
    public List<String> firstSize(String input) {
        HashSet<String> first = new HashSet<String>();
        List<String> firstList = new ArrayList<>();

        for (int i = 0; i < input.length(); i++) {
            first.add(input.substring(i, i + 1));
        }
        for (String i : first) {
            firstList.add(i);
        }
        System.out.println("1 : " + input.length());
        return firstList;

    }

    // 입력받은 두번째 input을 HashSet으로 중복제거 후 List 저장
    public List<String> secondSize(String input) {
        HashSet<String> second = new HashSet<String>();
        List<String> secondList = new ArrayList<>();

        for (int i = 0; i < input.length(); i++) {
            second.add(input.substring(i, i + 1));
        }
        for (String i : second) {
            secondList.add(i);
        }
        System.out.println("2 : " + input.length());
        return secondList;
    }

    // 중복제거된 두개의 List 값을 비교하여 중복되는 count 확인
    public void count(List<String> firstSize, List<String> secondSize) {
        int count = 0;

        for (String str1 : firstSize) {
            for (String str2 : secondSize) {
                if (str1.contains(str2) == true) {
                    count++;
                }
            }
        }

        System.out.println("3 : " + count);
    }
}