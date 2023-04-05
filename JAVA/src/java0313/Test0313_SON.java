package java0313;

//	7. 자식 클래스를 생성하고 부모 클래스를 상속받으세요.[2점]
public class Test0313_SON extends Test0313_MOM{
	public static void main(String[] args) {
		Test0313_SON child = new Test0313_SON(0, 0, 0);
		
		child.setKorean(80);
		child.setMath(60);
		child.setEnglish(70);
		child.showInformation();
		
//	9. 8번 함수를 재구현 시, 부모 함수의 내용에 이어서 국어, 영어, 수학의 평균 점수도 출력하세요[2점].
	}
	
//	8. 자식 클래스에서는 부모 클래스의 함수들 중 showInformation()을 override 하여 재구현하세요[2점].
	@Override
	public void showInformation() {
		// TODO Auto-generated method stub
		super.showInformation();
		System.out.println("평균점수 : " + (getKorean() + getMath() + getEnglish())/3);
	}
	
	public Test0313_SON(int Korean, int Math, int English) {
		super(Korean, Math, English);
		// TODO Auto-generated constructor stub
	}
	
}



/*
다음 조건을 만족하는 프로그램을 작성하세요
1. 부모 클래스를 생성하고, 변수는 이름, 국어 점수, 영어 점수, 수학 점수를 선언하세요.[1점]
2. 위 클래스의 1번 생성자는 이름만 받고, 국어, 영어, 수학 점수는 0점으로 초기화 하세요.[2점] // this()를 사용하면 2점, 안 사용하면 1점. 
3. 2번 생성자는 이름과 국어, 영어, 수학을 모두 받으세요.[1점]
4. 1번의 4개 변수에 대한 setter(), getter() 함수를 생성하세요.[1점]
5. 부모 클래스에서 showInformation() 이라는 함수를 생성하세요.(return value = void)[2점]
6. showInformation() 함수는 이름, 국어, 영어, 수학 점수를 출력해주세요[2점].
7. 자식 클래스를 생성하고 부모 클래스를 상속받으세요.[2점]
8. 자식 클래스에서는 부모 클래스의 함수들 중 showInformation()을 override 하여 재구현하세요[2점].
9. 8번 함수를 재구현 시, 부모 함수의 내용에 이어서 국어, 영어, 수학의 평균 점수도 출력하세요[2점].
*/