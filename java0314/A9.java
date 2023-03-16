package java0314;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class A9 {

	static Scanner scanner = new Scanner(System.in);
	
	public static void main(String[] args) {
		A9();

	}
	public static void A9() {
        int result = 0;
        List<Integer> inputNum = new ArrayList<Integer>();
        int sum = 0;
        int mean = 0;
        int max = 0;
        int min = 0;

        
        try {
        	while (true) {
        		inputNum.add(scanner.nextInt());
        		int i = 0;
        		sum += inputNum.get(result);
        		result++;
        		if (result == 1) {
        			mean = inputNum.get(i);
        			max = inputNum.get(i);
        			min = inputNum.get(i);
        		}
        		if (result != 1) {
        			mean = sum / result;
        			for (int num : inputNum) {
        				if (num > max) {
        					max = num;
        				}
        				if (num < min) {
        					min = num;
        				}
        			}
        			
        		}
        		i++;
        		System.out.println("Result : " + result + " - Mean " + mean 
        				+ ", Max " + max + ", Min " + min);
        		System.out.println();
        	}
			
		} catch(InputMismatchException e) {
			System.out.println("InputMismatchException!");
		}
        
        catch (Exception e) {
			// TODO: handle exception
		}

    }


}
