package java0314;

public class Thread4_try_catch implements Runnable {

	public static void main(String[] args) {
		Thread4_try_catch main = new Thread4_try_catch();
		Thread thread = new Thread(main);
		thread.start();
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("Thread");
	}
}
