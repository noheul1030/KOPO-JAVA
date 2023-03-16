package java0310;

public class TestReview {
	// 1. int형 final 전역변수를 2개 선언함
	public final static int ONETIME = 35;
	public final static int RANDOM = 27;
	public final static int EVENNUMBER = 0;
	public final static int ODDNUMBER = 1;

	public static void main(String[] args) {
		TestReview test = new TestReview();
		System.out.println(test.getRandomNumber(ONETIME));
		
		inEvenNumber(20);
	}

	// 2. 다른 클래스에서는 접근 불가능한 getRandomNumber() 함수를 선언하고,
	// 파라미터로 1번의 변수를 받고, return data type은 int형임
	private int getRandomNumber(int num) {

		int retValue = 0;
		int cnt = 0;
		
		if (num == ONETIME) {
			return (int) (Math.random() * 100);
		} else if (num == RANDOM) {
			while (retValue < 100) {
				retValue = retValue + (int) (Math.random() * 100);
				cnt++;
			}
		}
		return cnt;
	}
	
	public static void inEvenNumber(int number) {
		if (number % 2 == EVENNUMBER) {
			System.out.println("짝수");
		} else {
			System.out.println("홀수");
		}
	}

}

/*
다음 조건을 만족하는 프로그램을 작성하세요
1. int형 final 전역변수를 2개 선언함[1점]
 // 변수명 : ONETIME, RANDOM

2. 다른 클래스에서는 접근 불가능한 getRandomNumber() 함수를 선언하고, 파라미터로 1번의 변수를 받고, return data type은 int형임[2점]

3. 2번에서 만든 함수의 내용[4점]
ONETIME 값이 들어오면 (int)(math.random() * 100)의 값을 리턴하고
RANDOM 값이 들어오면 (int)(math.random() * 100) 값을 누적시켜서 100을 돌파하기까지 몇 회가 실행됐는지를 리턴한다(예, 35+5+27+30+7->5)

4. main() 함수에서는 getRandomNumber()를 호출 후, return 값을 출력함[2점]

5. int형 final 전역변수를 2개 선언함[1점]
 // 변수 : EVENNUMBER = 0, ODDNUMBER = 1

6. 객체 생성없이도 접근가능한 isEvenNumber() 함수를 선언하고 파라미터는 int형, return value는 없음[2점]
 
7. 6번에서 만든 함수의 내용
파라미터로 받은 값이 짝수인지 홀수인지 출력하고 홀짝 구분을 위해 5번에서의 전역변수를 활용해야함[2점]

8. main()에서 6번 함수의 인자를 7을 넣고 호출함[1점]
*/

