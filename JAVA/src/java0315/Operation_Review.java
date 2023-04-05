package java0315;

public interface Operation_Review {
	public String chat(String text);

	public void writeFile(String text);
}

/*
 * 다음 컴퓨터와의 채팅 프로그램을 작성하세요 1. Operation이라는 이름으로 인터페이스 생성[1점] 2. 위 인터페이스에서 인자와 리턴
 * 데이터 타입을 String으로 하는 chat() 함수와 인자는 String이며 리턴값이 없는 writeFile() 함수 선언[1점] 3.
 * 위 인터페이스를 구현할 Main 클래스 생성 후 unimplemented methods를 모두 override 함[1점] 4. main()
 * 함수에서는 사용자의 입력값이 "bye"가 포함된 문자열이 입력되기 전까지는 무한히 실행되는 반복문을 수행함[2점] 5. 위 반복문에서는
 * 사용자로부터 받은 입력값을 chat()의 인자로 넘기고 chat()로부터 받은 반환값은 writeFile()의 인자로 넘김[2점] 6.
 * chat() 함수 내부에는 String형 Array가 question과 answer로 선언되어 아래의 데이터가 초기화 되어있음[2점]
 * question에는 "happy", "hello", "old", "name", "bye" answer에는 "it's dope, man",
 * "hey ya", "take a guess", "it's confidential", "see ya" 7. question과 answer는
 * 같은 인덱스끼리 매칭되며 question의 문구가 포함되었다면 같은 인덱스의 answer를 return 함[2점]. 예) hello
 * bro! hey ya 8. 아무 조건도 만족시키지 않는 문구면 "lol"을 리턴함[1점] 9. writeFile() 함수의 인자로
 * "질문","응답"의 형태로 넘기고 바탕화면에 chat.csv 파일을 생성함 (질문과 응답은 어떠한 값이 와도 셀을 한 개씩 차지해야 하며
 * 파일에 계속 이어써져야함)[3점]
 */
