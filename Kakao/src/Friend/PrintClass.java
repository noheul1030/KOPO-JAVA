package Friend;

public class PrintClass {
	int a;
	int b;
	public PrintClass(int a, int b) {
		this.a = a;
		this.b = b;
		
	}
	public int printAdd() {
		return this.a + this.b;
//		int sum = a + b;
//		return sum;
	}
	public int printMulti() {
		return this.a * this.b;
	}
}
