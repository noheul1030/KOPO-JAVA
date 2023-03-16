package java0314;

import java.time.LocalDateTime;

public class Syncronization {

	public static void main(String[] args) {
		Syncronization sync1 = new Syncronization();
//		Syncronization sync2 = new Syncronization();
//		Syncronization sync3 = new Syncronization();
		
		
		Thread thread1 = new Thread(() -> {
            System.out.println("스레드1 시작 " + LocalDateTime.now());
            sync1.syncMethod1("스레드1");
            System.out.println("스레드1 종료 " + LocalDateTime.now());
        });

        Thread thread2 = new Thread(() -> {
            System.out.println("스레드2 시작 " + LocalDateTime.now());
            sync1.syncMethod2("스레드2");
            System.out.println("스레드2 종료 " + LocalDateTime.now());
        });
        Thread thread3 = new Thread(() -> {
        	System.out.println("스레드3 시작 " + LocalDateTime.now());
        	sync1.syncMethod2("스레드3");
        	System.out.println("스레드3 종료 " + LocalDateTime.now());
        });

        thread1.start();
        thread2.start();
        thread3.start();
	}
	private synchronized void syncMethod1(String msg) {
        System.out.println(msg + "의 syncMethod1 실행중" + LocalDateTime.now());
        try {
            Thread.sleep(5);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    private synchronized void syncMethod2(String msg) {
        System.out.println(msg + "의 syncMethod2 실행중" + LocalDateTime.now());
        try {
        	 Thread.sleep(5);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    
    private void syncMethod3(String msg) {
    	System.out.println(msg + "의 syncMethod3 실행중" + LocalDateTime.now());
    	try {
    		Thread.sleep(5);
    	} catch (InterruptedException e) {
    		e.printStackTrace();
    	}
    }


}
