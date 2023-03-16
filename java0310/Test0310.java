package java0310;

import java0309.Test0309;

public class Test0310 {

	// 1. int형 final 전역변수를 2개 선언함
	public final static int ONETIME = 35;
	public final static int RANDOM = 27;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test0310 test = new Test0310();
		test.getRandomNumber(ONETIME, RANDOM);
		
		test.count(ONETIME, RANDOM);
//		int num = inEvenNumber(n);
//		bb(num);
	}

	// 2. 다른 클래스에서는 접근 불가능한 getRandomNumber() 함수를 선언하고,
	// 파라미터로 1번의 변수를 받고, return data type은 int형임
	private int getRandomNumber(int num1, int num2) {
		num1 = this.ONETIME;
		num2 = this.RANDOM;
		
		System.out.println(num1);
		System.out.println(num2);
		
		return getRandomNumber(num1, num2);
	}

	// 3. 2번에서 만든 함수의 내용
	// ONETIME 값이 들어오면 (int)(math.random() * 100)의 값을 리턴하고
	// RANDOM 값이 들어오면 (int)(math.random() * 100) 값을 누적시켜서
	// 100을 돌파하기까지 몇 회가 실행됐는지를 리턴한다(예, 35+5+27+30+7->5)

	public int count(int num1, int num2) {
		int num = 0;
		int count = 0;
		
//		int[] aa = new int[] {};

		if (num < 100) {
			if (num1 < 100 && (num + num1) < 100) {
				for (int i = 0; i < Integer.MAX_VALUE; i++) {
					num += (int) (Math.random() * 100);
					count++;
				}
			}
			if (num2 < 100 && (num + num2) < 100) {
				for (int i = 0; i < Integer.MAX_VALUE; i++) {
					num += (int) (Math.random() * 100);
					count++;
				}
			}
		}
		System.out.println("count :" + count);
		return num2;

	}
	
	//5. int형 final 전역변수를 2개 선언함
	public final static int EVENNUMBER = 0;
	public final static int ODDNUMBER = 1;
	
	
	//6. 객체 생성없이도 접근가능한 isEvenNumber() 함수를 선언하고 파라미터는 int형, return value는 없음
	public static void inEvenNumber(int num) {
		num = 8;
	}
	
	
//	7. 6번에서 만든 함수의 내용
//	파라미터로 받은 값이 짝수인지 홀수인지 출력하고 홀짝 구분을 위해 5번에서의 전역변수를 활용해야함
	public static void bb () {
		
	}
}
