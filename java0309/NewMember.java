package java0309;

public class NewMember {
	public static void main(String[] args) {
		// 재귀함수 호출
		
		int n = addToOne(5);
		System.out.println(n);
	}
	
	public static int addToOne(int n) {
		if(n == 1) {
			return 1;
		}else {
			return n * addToOne(n - 1);
		}
	}
}
