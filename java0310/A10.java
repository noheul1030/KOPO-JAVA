package java0310;

import java.util.Arrays;
import java.util.Scanner;

public class A10 {

    // A10 Comparing the two strings
    // User inputs the two strings
    // Show the result if those two strings are the same after relocation
    // 완료

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        A10 a10 = new A10();

        while (true) {
            String stringInput1 = a10.stringsInput();
            String stringInput2 = a10.stringsInput();
            boolean result = a10.list(stringInput1, stringInput2);
            if (result == true) {
                System.out.println("Yes");
            } else {
                System.out.println("No");
            }
        }
    }

    // input the strings
    public String stringsInput() {
        return scanner.next();
    }

    // input the strings save the list
    public boolean list(String stringInput1, String stringInput2) {
        char[] list1 = stringInput1.toCharArray();
        char[] list2 = stringInput2.toCharArray();

        Arrays.sort(list1);
        Arrays.sort(list2);

        stringInput1 = new String(list1);
        stringInput2 = new String(list2);

        if (stringInput1.equals(stringInput2))
            return true;
        else
            return false;
    }

}
