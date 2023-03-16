package java0314;

import java.io.FileInputStream;
import java.io.IOException;

// 해당 주소의 파일에 쓰인 "Line #" + i + "\n" 을 불러오기. 
public class FileInputStream1 {

	public static void main(String[] args) throws IOException {
		byte[] content = new byte[1000];
		FileInputStream input = new FileInputStream("C:\\Users\\노을\\Desktop\\과제\\out.txt");
		
		input.read(content);
		String allLine = new String(content);
		System.out.println(allLine);
		
		input.close();
	}

}
