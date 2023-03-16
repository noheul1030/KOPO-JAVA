package java0309;

import java.util.Arrays;
import java.util.Scanner;

// 완료
public class A3 {
    static Scanner scanner = new Scanner(System.in);

    // A3 Program to Calculate the Sum of Multiples of N
    // User inputs the two numbers for the M and N respectively
    // Calculate the sum of multiples of N from 1 to M
    // 완료

    public static void main(String[] args) {
        AA3();
    }

    public static void AA3() {
        int M = scanner.nextInt();
        int N = scanner.nextInt();
        int Sum = 0;
        int[] Num = new int[M / N];

        int indexcount = 0;

        for (int i = N; i <= M; i += N) {
            Sum += i;

            Num[indexcount] += i;
            indexcount++;

        }

        System.out.println("Sum : " + Sum + Arrays.toString(Num));

    }

}
