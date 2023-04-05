package java0309;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

// 완료
public class A4 {
    static Scanner scanner = new Scanner(System.in);

    // A4 Encryption and Decryption
    // Create your own encryption algorithm
    // 완료

    public static void main(String[] args) {

        A4 a4 = new A4();
        a4.AA4();
        while (true) {
            string.clear();
            a4.Menu();
            a4.inputStringList();
            a4.EncryptionString(string);
        }
    }

    static List<String> list1 = new ArrayList<String>();
    static List<String> list2 = new ArrayList<String>();
    static List<String> string = new ArrayList<String>();

    public void AA4() {

        char ch = ' ';
        // 소문자 a 97 ~ z 122 까지
        for (int i = (byte) 'a'; i <= (byte) 'z'; i++) {
            ch = (char) i;
            list1.add(String.valueOf(ch));
        }
        // 소문자 z 122 ~ a 97 까지
        for (int i = (byte) 'z'; i >= (byte) 'a'; i--) {
            ch = (char) i;
            list2.add(String.valueOf(ch));
        }
    }

    public void Menu() {
        System.out.println("#Menu \n" + "1. Encryption \n" + "2. Decryption \n");
    }

    public void inputStringList() {
        String input = scanner.next();
        System.out.println("-> " + input);

        for (int i = 0; i < input.length(); i++) {
            string.add(String.valueOf(input.charAt(i)));
        }
    }

    public void EncryptionString(List<String> string) {
        String str = "";
        for (int i = 0; i < string.size(); i++) {
            for (int j = 0; j < list1.size(); j++) {
                if (string.get(i).equals(list1.get(j))) {
                    str += list2.get(j);
                }
            }
        }
        System.out.println("Result : " + str);
    }
}
