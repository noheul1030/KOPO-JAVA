package java0314;

import java.io.FileOutputStream;
import java.io.IOException;

// 해당 주소의 파일에 "Line #" + i + "\n" 을 입력하고 out.txt 파일을 생성. 
public class FileOutputStream1 {

	public static void main(String[] args) throws IOException {
		FileOutputStream output = new FileOutputStream("C:\\Users\\노을\\Desktop\\과제\\out.txt");
		
		for (int i = 1; i < 11; i++) {
			String data = "Line #" + i + "\n";
			output.write(data.getBytes());
		}
		output.close();
	}

}
