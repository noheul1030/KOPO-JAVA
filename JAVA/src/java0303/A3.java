package java0303;

public class A3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		구구단();
//		NumberGame();
//		NumberGame2();
	}
	
	public static void 구구단() {
		
		for (int i = 2; i <= 9; i++) {
			for (int j = 1; j <= 9; j++) {
				System.out.println(i + " X " + j + " = " + (i * j));
			}
		}
		
	}

	public static void NumberGame() {
		int i = 2;
		while (i <= 9) {
			for (int j = 1; j <= 9; j++) {
				System.out.print(i + " * " + j + "= " + (i * j) + "\t");
			}
			i++;
			System.out.println();
		}
	}

	public static void NumberGame2() {
		System.out.println();
		System.out.println(
				"==========================================================================================================================================");
		System.out.println();
		
		for (int i = 2; i <= 9; i++) {
			for (int j = 1; j <= 9; j++) {
				System.out.print(j + " * " + i + " = " + (i * j) + "\t");
			}
			System.out.println();
		}
	}

}
