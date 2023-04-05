package java0309;

import java.util.Scanner;

// A5 Data Confirmation
// "당신의 조건을 설정하세요. 조건의 수는 최소 5개 이상이어야 합니다."
// 완료
public class A5 {

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        A5 a5 = new A5();
        while (true) {
            System.out.print("-> ");
            String passward = a5.passwardInput();

            boolean fail1 = a5.fail1(passward);
            boolean fail2 = a5.fail2(passward);

            if (fail1 && fail2 == true) {
                System.out.println("PASS");
                break;
            } else {
                System.out.println("FAIL");
            }
        }
    }

    // passward 입력받기
    public String passwardInput() {
        return scanner.next();
    }

    // fail 조건 5가지 검증
    public boolean fail1(String passward) {
        // 1. passward의 길이가 10보다 작으면 FAIL
        // 2. passward의 길이가 20을 넘으면 FAIL
        if (passward.length() >= 10 && passward.length() < 20) {
            // 3. passward에 "k"가 포함되어 있지 않으면 FAIL
            if (!(passward.contains("k"))) {
                return false;
            }
            return true;
        } else {
            return false;
        }
    }

    public boolean fail2(String passward) {
        String pass1 = "1234567890";
        String pass2 = "@!";

        // 4. passward에 숫자가 포함되어 있으면 break ---> true pass

        int count = 0;
        for (int i = 0; i < pass1.length(); i++) {
            if (passward.contains(pass1.substring(i, i + 1)) == true) {
                count = 0;
                break;
            } else {
                count++;
            }
            if (i + 1 == pass1.length()) {
                if (count == pass1.length()) {
                    return false;
                }
            }
        }

        // 5. passward에 특수문자 @나 !가 포함되어 있으면 break ---> true pass
        for (int i = 0; i < pass2.length(); i++) {
            if (passward.contains(pass2.substring(i, i + 1)) == true) {
                count = 0;
                break;
            } else {
                count++;
            }
            if (i + 1 == pass2.length()) {
                if (count == pass2.length()) {
                    return false;
                }
            }
        }
        return true;
    }
}
