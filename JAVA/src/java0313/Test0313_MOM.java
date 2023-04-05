package java0313;

public class Test0313_MOM {
	
//	1. 부모 클래스를 생성하고, 변수는 이름, 국어 점수, 영어 점수, 수학 점수를 선언하세요.[1점]
	public String name = "노을";
	public int Korean = 80;
	public int Math = 70;
	public int English = 90;
	
	
//	2. 위 클래스의 1번 생성자는 이름만 받고, 국어, 영어, 수학 점수는 0점으로 초기화 하세요.[2점] // this()를 사용하면 2점, 안 사용하면 1점. 
	public Test0313_MOM(String name) {
		name = this.name;
		this.Korean = 0;
		this.Math = 0;
		this.English = 0;
	}

//	3. 2번 생성자는 이름과 국어, 영어, 수학을 모두 받으세요.[1점]
	
	public Test0313_MOM(int Korean, int Math, int English) {
		Korean = this.Korean;
		Math = this.Math;
		English = this.English;
	}

	
//	4. 1번의 4개 변수에 대한 setter(), getter() 함수를 생성하세요.[1점]
	
	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getKorean() {
		return Korean;
	}


	public void setKorean(int korean) {
		Korean = korean;
	}


	public int getMath() {
		return Math;
	}


	public void setMath(int math) {
		Math = math;
	}


	public int getEnglish() {
		return English;
	}


	public void setEnglish(int english) {
		English = english;
	}
	
//	5. 부모 클래스에서 showInformation() 이라는 함수를 생성하세요.(return value = void)[2점]
//	6. showInformation() 함수는 이름, 국어, 영어, 수학 점수를 출력해주세요[2점].
	
	public void showInformation() {
		System.out.println("name is : " + name);
		System.out.println("Korean score is : " + Korean);
		System.out.println("Math score is : " + Math);
		System.out.println("English score is : " + English);
	}

}



