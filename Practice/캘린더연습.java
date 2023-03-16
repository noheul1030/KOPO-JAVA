package Practice;

import java.util.Calendar;
import java.util.Scanner;

public class 캘린더연습 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calendar cal = setDate();
		showCalendar(cal);

	}
	
	public static void showCalendar(Calendar cal) {
		int maxNumber = cal.getActualMaximum(Calendar.DAY_OF_MONTH);
		int firstDay = cal.get(Calendar.DAY_OF_WEEK);
		
		int n = 7 - firstDay + 1;	// 첫줄 개수
		int m = m = 7 - firstDay;	// 첫줄 탭 개수
		
		System.out.println("일\t월\t화\t수\t목\t금\t토\t");
		
		// 탭 찍기
		for (int i = 0; i < m; i++) {
			System.out.print("\t");
		}
		// 첫줄 찍기
		for (int i = 1; i <= n; i++) {
			System.out.print(i + "\t");
		}
		System.out.println();
		// 두번째줄부터 찍기
		for (int i = n + 1; i <= maxNumber; i++) {
			System.out.print(i + "\t");
			if((i - n) % 7 == 0)
				System.out.println();
		}
	}

	public static Calendar setDate() {
		Calendar cal = Calendar.getInstance();
		
		System.out.println(cal.getTime());
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Year : ");
		int year = scanner.nextInt();
		System.out.println("Month : ");
		int month = scanner.nextInt();
		System.out.println("Date : ");
		int date = scanner.nextInt();
		
		cal.set(Calendar.YEAR, year);
		cal.set(Calendar.MONTH, month - 1);
		cal.set(Calendar.DATE, date);
		
		System.out.println("================== " + year + " 년 " + month + " 월 ===================");
		
		return cal;
	}
}
