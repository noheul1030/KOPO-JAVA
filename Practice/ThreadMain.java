package Practice;

public class ThreadMain {
	public static void main(String[] args) {
		MultiThreadTest thread2 = new MultiThreadTest("thread2", 2);
		thread2.setPriority(10);
		thread2.start();
		MultiThreadTest thread3 = new MultiThreadTest("thread3", 3);
		thread2.setPriority(5);
		thread3.start();
		MultiThreadTest thread4 = new MultiThreadTest("thread4", 4);
		thread4.setPriority(1);
		thread4.start();
	
	}
}

class MultiThreadTest extends Thread{
	int n = 2;
	
	public MultiThreadTest(String name,int n) {
		this.setName(name);
		this.n = n;
	}
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		super.run();
		
		int cnt = 1;
		while(cnt < 20) {
			System.out.println(n + " X "+ cnt + " = " +(n*cnt));
			cnt++;
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}