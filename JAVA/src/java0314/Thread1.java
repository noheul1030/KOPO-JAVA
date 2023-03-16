package java0314;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Thread1 {

	public static void main(String[] args) {
//		SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd:mm:ss");
//		Date time = new Date();
//		String dateAndTime = format.format(time);
//
//		System.out.println(dateAndTime);
//		System.out.println("start");
//
//		try {
//			Thread.sleep(3000);
//		} catch (InterruptedException e) {
//			e.printStackTrace();
//		}
//
//		time = new Date();
//		dateAndTime = format.format(time);
//		System.out.println(dateAndTime);
//		System.out.println("end");
		int i = 0;
		while (i < 6) {
			int lottoNum = (int)(Math.random()* 46);
			System.out.println(getLottoNumber());
			i++;
			try {
				Thread.sleep(1000);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
	
	public static int getLottoNumber() {
		return (int)(Math.random()* 46);
	}
}
