package java0314;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Thread2 extends Thread {

	public static void main(String[] args) throws InterruptedException {
		Thread2 thread = new Thread2();
		thread.start();
		System.out.println("Check 1 : " + getCurrentTime() + "-" + thread.isAlive());
		Thread.sleep(3000);
		System.out.println("Check 2 : " + getCurrentTime() + "-" + thread.isAlive());

	}

	public static String getCurrentTime() {
		SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		Date time = new Date();
		String dateAndTime = format.format(time);
		return dateAndTime;
	}

	public void run() {
		int count = 0;
		while (true) {
			if (count == 5) {
				break;
			}
			try {
				System.out.println(getCurrentTime() + "-" + count);
				Thread.sleep(100);
				count++;
			} catch (Exception e) {
				// TODO: handle exception
				e.printStackTrace();
			}
		}
	}
}
