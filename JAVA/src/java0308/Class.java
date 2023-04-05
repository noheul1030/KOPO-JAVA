package java0308;

import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;
import java.util.TimeZone;

public class Class {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		p1();

//		TestA testA = new TestA();
//		TestA testA2 = new TestA();
//		testA.showName();
//		testA2.showName();
//		TestB tetB = new TestB();
//		TestB.showHobby();

//		p2();
//		p3();
		p4();
//		p5();
//		p6();
//		p7();
//		p8();
//		p9();

//		int p10_Result = p10(3,9);
//		System.out.println(p10_Result);

//		while (true) {
//			int num = showMenu();
//			if(num ==1) {
//				// To do
//			}else if(num == 3) {
//				break;
//			}
//		}

	}

	public static void p1() {

		String typo = "두근거렸지 누군가 나의 뒤를 쫓고있었고" + "검은 절벽 끝 더 이상 발 디딜 곳 하나 없었지";

		// typo스트링의 글자수 만큼 list에 담아둡니다.
		int count = 0;

		for (int i = 0; i < typo.length(); i++) {
			char comVal = (char) (typo.charAt(i) - 0xAC00);

			if (comVal >= 0 && comVal <= 11172) {
				// 한글일경우

				// 초성만 입력 했을 시엔 초성은 무시해서 List에 추가합니다.
				char uniVal = (char) comVal;
				// 유니코드 표에 맞추어 초성 중성 종성을 분리합니다..
				char cho = (char) ((((uniVal - (uniVal % 28)) / 28) / 21) + 0x1100);
				char jung = (char) ((((uniVal - (uniVal % 28)) / 28) % 21) + 0x1161);
				char jong = (char) ((uniVal % 28) + 0x11a7);

				if (cho != 4519) {
					System.out.print(cho + " ");
				}
				if (jung != 4519) {
					System.out.print(jung + " ");
				}
				if (jong != 4519) {
					System.out.print(jong + " ");
				}
				if (cho == 4352) {
					count++;
				}
				if (jong == 4520) {
					count++;
				}

			} else {
				// 한글이 아닐경우
				comVal = (char) (comVal + 0xAC00);
				System.out.print(comVal + " ");
			}
		}

		System.out.print(count);
		System.out.println();

		for (int i = 4352; i < 4352 + 50; i++) {
			System.out.print((char) i);
		}

	}

	public static void p2() {
		// Date 사용
		Date date = new Date();
		System.out.println(date.toString());
		System.out.println(date.getTime());
	}

	public static void p3() {
		for (int i = 0; i < 6; i++) {
			int num = (int) (Math.random() * 45);
			System.out.println(num);

		}
	}

	static Scanner scanner = new Scanner(System.in);

// P6 달력 만들기
	public static void p4() {

//		System.out.println(calendar.getTime());
//		System.out.println(calendar.get(Calendar.YEAR));
//		System.out.println(calendar.get(Calendar.YEAR) + 1);
//		System.out.println(calendar.get(Calendar.MONTH));
//		System.out.println(calendar.get(Calendar.MONTH) + 3);
//		System.out.println(calendar.get(Calendar.DATE));
//		System.out.println(calendar.get(Calendar.DATE) - 7);
//		System.out.println(calendar.get(Calendar.DAY_OF_WEEK));

		System.out.println("input the two numbers for year and month");
		int year = scanner.nextInt();
		int month = scanner.nextInt();

		Calendar calendar = Calendar.getInstance();
		calendar.set(year, month - 1, 1);

		int end = calendar.getActualMaximum(Calendar.DAY_OF_MONTH);
		int week = calendar.get(Calendar.DAY_OF_WEEK);
		System.out.println(week);

		System.out.println("================== " + year + " 년 " + month + " 월 ===================");
		System.out.println("일\t월\t화\t수\t목\t금\t토\t");

		for (int i = 1; i <= end; i++) {
			if (i == 1) {
				for (int j = 1; j < week; j++) {
					System.out.print("\t");
				}
			}
			if (i == week+1) {
				System.out.println();
				week += 7;
			}
			System.out.print(i);
			System.out.print("\t");
		}
	}

// Math Class 
	public static void p5() {
		System.out.println(Math.min(3, 13));
		System.out.println(Math.max(123, 54));
		System.out.println(Math.abs(-23.1));
		System.out.println(Math.sqrt(3));
		System.out.println(Math.random());
	}

// TimeZone Class
	public static void p6() {
		TimeZone time;
		Date date = new Date();
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

		// 대한민국 표준시
		time = TimeZone.getTimeZone("Asia/Seoul");
		dateFormat.setTimeZone(time);
		System.out.println(time.getDisplayName() + " : " + dateFormat.format(date));

		// 중부유럽 프랑스 표준시
		time = TimeZone.getTimeZone("Europe/Paris");
		dateFormat.setTimeZone(time);
		System.out.println(time.getDisplayName() + " : " + dateFormat.format(date));
	}

// String Class
	public static void p7() {
		String text = "Hello,hi,";
		System.out.println(text);
		System.out.println(text.length());
		System.out.println(text.charAt(2));

		char[] c = text.toCharArray();
		System.out.println(c[0]);

		// replace --> 앞에 있는 "H"를 "h"로 바꿔주는 함수
		System.out.println(text.replace("H", "h"));

		// split --> , 를 기준으로 짜르기 함수
		String[] t = text.split(",");
		System.out.println(t[0]);
		System.out.println(t[1]);
//		System.out.println(t[2]); -----> exception 오류 
	}

// Numeric Class
	public static void p8() {

		String text = "-31.5123121231231212312315342137";
		System.out.println(text);
		System.out.println(Float.parseFloat(text));
		System.out.println(Double.parseDouble(text));

		Double d = Double.parseDouble(text);
		System.out.println(d);
		System.out.println(d.intValue());

		BigDecimal bd = new BigDecimal(text);
		System.out.println(bd);
		System.out.println(Math.round(d));
		System.out.println(Math.floor(d));
		System.out.println(Math.ceil(d));

		float f = 3.26f;
		System.out.println(f);
		System.out.println((int) f);
	}

// Currency Converter 환율 계산기
	public static void p9() {

		double USD = 1320.40; // 미국 달러
		double JPY = 959.20; // 일본 엔화
		double dd = 0;

		System.out.println("selects a number from the menu");
		System.out.println();
		System.out.println("#Current COnvenrter \n" + "1. South Korean won -> Unitied States Dollar \n"
				+ "2. United States Dollar -> South Korean won");
		System.out.println();

		int selectNum = scanner.nextInt();

		System.out.println("User input a number >>> ");
		System.out.println();

		int inputNum = scanner.nextInt();

		switch (selectNum) {
		case 1:
			dd = inputNum / USD;
			System.out.println(inputNum + "원 --------> " + Math.round(dd * 100) / 100.0 + " 달러");
			break;
		case 2:
			dd = inputNum * USD;
			System.out.println(inputNum + "달러 --------> " + Math.round(dd * 100) / 100.0 + " 원");
			break;
		}
	}

// MultiplicationTable	
	public static int p10(int n, int m) {

//		for (int i = 1; i <= m; i++) {
//			System.out.println(n + " X " + i + " = " + (n * i));
//		}

		int result = n * m;

		return result;
	}

	public static int showMenu() {
		System.out.println("#Menu");
		System.out.println("1. Coke");
		System.out.println("2. Orange");
		System.out.println("3. exit");

		int num = scanner.nextInt();
		return num;
	}

}
