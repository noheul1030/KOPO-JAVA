package java0315;

import java.io.IOException;

// 1. Operation이라는 이름으로 인터페이스 생성[1점]
public interface Operation {

// 2. 위 인터페이스에서 인자와 리턴 데이터 타입을 String으로 하는 chat() 함수와 인자는 String이며 리턴값이 없는 writeFile() 함수 선언[1점]
	public String chat(String str);
	
	public void writeFile(String str) throws IOException;
}

