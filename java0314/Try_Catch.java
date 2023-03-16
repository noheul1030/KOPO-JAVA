package java0314;

public class Try_Catch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] number = { 5, 10, 12 };

		try {
			System.out.println(number[2]);
		} catch (ArrayIndexOutOfBoundsException e) {
			// TODO: handle exception
			System.out.println("exception");
			e.printStackTrace();
		} catch (ArithmeticException e) {
			System.out.println("exception");
			e.printStackTrace();
		}
		finally {
			System.out.println("finally");
		}
	}

}
