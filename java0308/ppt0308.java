package java0308;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.Period;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class ppt0308 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//        P6();
//        P7();
		P8();
//        P11();
//        P12();
//        P13();
//        P14();
//        P15();
//        A1();
//		  A2();
//        A3();

	}

	static Scanner scanner = new Scanner(System.in);

	// P6 Calendar Application
	// 완료
	public static void P6() {
		System.out.println("input the two numbers for year and month");
		int year = scanner.nextInt();
		int month = scanner.nextInt();

		Calendar calendar = Calendar.getInstance();
		calendar.set(year, month - 1, 1);

		int end = calendar.getActualMaximum(Calendar.DAY_OF_MONTH);
		int week = calendar.get(Calendar.DAY_OF_WEEK);
//		System.out.println(week); 해당 달의 첫째주 마지막 일자 확인

		System.out.println("================== " + year + " 년 " + month + " 월 ===================");
		System.out.println("일\t월\t화\t수\t목\t금\t토\t");

		for (int i = 1; i <= end; i++) {
			if (i == 1) {
				for (int j = 0; j < week - 1; j++) {
					System.out.print("\t");
				}
			}
			if (i == week + 1) {
				System.out.println();
				week += 7;
			}
			System.out.print(i);
			System.out.print("\t");
		}
	}

	// P7 Calendar Application II
	// 완료
	public static void P7() {
		System.out.println("User inputs the two dates >>>  yyyy-MM-dd ");
		int year1 = 0;
		int month1 = 0;
		int day1 = 0;

		int year2 = 0;
		int month2 = 0;
		int day2 = 0;

		for (int i = 0; i < 2; i++) {
			String input = scanner.next();
			if (i == 0) {
				year1 = Integer.parseInt(input.substring(0, 4));
				month1 = Integer.parseInt(input.substring(4, 6)) - 1;
				day1 = Integer.parseInt(input.substring(6, 8));
			}
			if (i == 1) {
				year2 = Integer.parseInt(input.substring(0, 4));
				month2 = Integer.parseInt(input.substring(4, 6)) - 1;
				day2 = Integer.parseInt(input.substring(6, 8));
			}
		}
		LocalDate date1 = LocalDate.of(year1, month1, day1);
		LocalDate date2 = LocalDate.of(year2, month2, day2);

		Period result = Period.between(date1, date2);

		System.out.printf("두 날짜 사이 기간: %d년 %d월 %d일", result.getYears(), result.getMonths(), result.getDays() - 1);
	}

	
	// P8 Calendar Application III
	// 완료
	public static void P8() {
		System.out.println("User inputs the dates >>>  yyyy-MM-dd ");
		String input = scanner.next();
		System.out.println("User input Plus date Number >>> ");
		int plus = scanner.nextInt();
		
		int year = Integer.parseInt(input.substring(0, 4));
		int month = Integer.parseInt(input.substring(4, 6)) - 1;
		int day = Integer.parseInt(input.substring(6, 8));
		
		Calendar cal = Calendar.getInstance();
		SimpleDateFormat Format = new SimpleDateFormat("yyyyMMdd");
		
		cal.set(year,month,day);

		cal.add(cal.DAY_OF_MONTH, plus);
		
		Date result = new Date(cal.getTimeInMillis());

		System.out.println(Format.format(result));
		
	}

	
	// P11 Currency Converter 환율 계산기
	// 완료
	public static void P11() {
		double USD = 1320.40; // 미국 달러
		double JPY = 959.48; // 일본 엔화
		double dd = 0.00;

		System.out.println("selects a number from the menu");
		System.out.println();
		System.out.println("#Current COnvenrter \n" + "1. South Korean won -> Unitied States Dollar \n"
				+ "2. United States Dollar -> South Korean won \n" + "3. South Korean won -> Japan JPY ");
		System.out.println();

		int selectNum = scanner.nextInt();

		System.out.println("User input a number >>> ");
		System.out.println();

		int inputNum = scanner.nextInt();

		switch (selectNum) {
		case 1:
			dd = inputNum / USD;
			System.out.println(inputNum + " 원 --------> " + Math.round(dd * 100) / 100.0 + " 달러");
			break;
		case 2:
			dd = inputNum * USD;
			System.out.println(inputNum + " 달러 --------> " + Math.round(dd * 100) / 100.0 + " 원");
			break;
		case 3:
			dd = inputNum / JPY;
			System.out.println(inputNum + " 원 --------> " + Math.round(dd * 100) / 100.0 + " 엔");
			break;
		}
	}

	// P12 Temperature Converter 온도 변환기
	// 완료
	public static void P12() {
		System.out.println("selects a number from the menu");
		System.out.println();

		System.out.println("#Current Converter \n" + "1. Celsius -> Fahrenheit \n" + "2. Fahrenheit -> Celsius");
		int selectNum = scanner.nextInt();

		System.out.println("User input a Numver >>> ");
		int Num = scanner.nextInt();

		double dd = 0.00;
		switch (selectNum) {
		case 1:
			dd = (Num * 1.8) + 32;
			System.out.println("섭씨온도 :" + Num + " ------> 화씨온도 : " + dd);
			break;
		case 2:
			dd = (Num - 32) / 1.8;
			System.out.println("화씨온도 :" + Num + " ------> 섭씨온도 : " + Math.round(dd * 100) / 100.0);
			break;
		}

	}

	// P13 Extracting Word from String 문자열 추출 -> 'cool' 단어 갯수 찾기
	// 완료
	public static void P13() {
		ArrayList<String> listA = new ArrayList<String>();

		String word = scanner.nextLine();
		for (int i = 0; i < word.length(); i++) {
			if (word.charAt(i) == 'o' || word.charAt(i) == 'c' || word.charAt(i) == 'l') {
				listA.add(word.substring(i, i + 1));
			}
		}
		System.out.println(listA);

		int count = 0;
		for (int i = 0; i < listA.size(); i++) {
			if (listA.get(i).equals("c")) {
				if (listA.get(i + 1).equals("o") && listA.get(i + 2).equals("o") && listA.get(i + 3).equals("l")) {
				}
				count++;
			}
		}
		System.out.println(count);

	}

	// P14 Modify the article if needed
	// 완료
	public static void P14() {
		String[] str = scanner.nextLine().split(" ");

		for (int i = 0; i < str.length; i++) {
			if (str[i].equals("a") || str[i].equals("an")) {
				if (str[i + 1].charAt(0) == 'a') {
					str[i] = "an";
				} else if (str[i + 1].charAt(0) == 'e') {
					str[i] = "an";
				} else if (str[i + 1].charAt(0) == 'i') {
					str[i] = "an";
				} else if (str[i + 1].charAt(0) == 'o') {
					str[i] = "an";
				} else if (str[i + 1].charAt(0) == 'u') {
					str[i] = "an";
				} else {
					str[i] = "a";
				}
			}

		}
		for (int i = 0; i < str.length; i++) {
			System.out.print(str[i] + " ");
		}
	}

	// P15 Calculator
	// 완료
	public static void P15() {
		System.out.println("inputs an equation >>> ");
		String input = scanner.next();
		System.out.println(input);

		int n = 0;
		if (input.contains("*")) {
			n = input.indexOf("*");
		} else if (input.contains("/")) {
			n = input.indexOf("/");
		} else if (input.contains("+")) {
			n = input.indexOf("+");
		} else if (input.contains("-")) {
			n = input.indexOf("-");
		}

		double num1 = Double.parseDouble(input.substring(0, n));
		double num2 = Double.parseDouble(input.substring(n + 1, input.length()));
		double re = 0.0;

		if (input.contains("*")) {
			re = num1 * num2;
		} else if (input.contains("+")) {
			re = num1 + num2;
		} else if (input.contains("-")) {
			re = num1 - num2;
		} else if (input.contains("/")) {
			re = num1 / num2;
		}

		if (re != (int) re) {
			System.out.println(re);
		} else {
			System.out.println((int) re);
		}
	}

	// A1 Descriptive Statistics Calculation
	// 숫자의 개수, 평균, 최댓값, 최솟값을 출력합니다.
	// 완료

	public static void A1() {
		int result = 0;
		List<Integer> inputNum = new ArrayList<Integer>();
		int sum = 0;
		int mean = 0;
		int max = 0;
		int min = 0;

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
			System.out.println("Result : " + result + " - Mean " + mean + ", Max " + max + ", Min " + min);
			System.out.println();
		}

	}

	// A2 Counting by Time of Number
	// 양수, 음수, 홀수 및 짝수의 숫자를 출력합니다.
	// 완료

	public static void A2() {
		int P = 0; // 양수
		int N = 0; // 음수
		int O = 0; // 홀수
		int E = 0; // 짝수

		while (true) {
			int input = scanner.nextInt();
			if (input > 0)
				P++;
			if (input < 0)
				N++;
			if (Math.abs(input) % 2 == 1)
				O++;
			if (Math.abs(input) % 2 == 0)
				E++;

			System.out.println("P - " + P + ",N - " + N + ",O - " + O + ",E - " + E);
			System.out.println();
		}
	}

	// A3 Compose a program with the conditions below
	// 알파벳 갯수 구하기
	// "알파벳의 개수를 계산하는 프로그램을 작성하십시오.
	// 문자열은 변수로 선언되며, '나는 학교에 갑니다'로 지정됩니다."
	// 완료

	public static void A3() {
		int[] arr = new int[26];
		String str = "I go to school";

		for (int i = 0; i < str.length(); i++) {
			// 대문자 아스키 코드랑 매칭되는지 찾고 i번째 배열에 카운트 1씩 추가
			if (65 <= (byte) str.charAt(i) && (byte) str.charAt(i) <= 90) {
				arr[(byte) str.charAt(i) - 65] += 1;
			}
			// 소문자 아스키 코드랑 매칭되는지 찾고 i번째 배열에 카운트 1씩 추가
			if (97 <= (byte) str.charAt(i) && (byte) str.charAt(i) <= 122) {
				arr[(byte) str.charAt(i) - (65 + 32)] += 1;
			}
		}

		// arr배열에 입력된 값이 0이 아니면 출력
		int count = 65;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] != 0) {
				System.out.println((char) count + " - " + arr[i]);
			}
			count++;
		}
	}
}
