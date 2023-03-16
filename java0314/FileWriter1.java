package java0314;

import java.io.FileWriter;
import java.io.IOException;

//해당 주소의 파일에 "HI #" + i + "\n" 을 입력. 
public class FileWriter1 {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		FileWriter fw = new FileWriter("C:\\Users\\노을\\Desktop\\과제\\out.txt", true);
		// true 값을 줬을 때는 out.txt의 기존 값에 추가 입력.
		// false 값을 줬을 때는 out.txt의 내용을 초기화하고 입력.
		
		for (int i = 11; i < 16; i++) {
			String data = "HI! #" + i + "\n";
			fw.write(data);
		}
		fw.close();
	}

}
