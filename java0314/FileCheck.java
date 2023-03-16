package java0314;

import java.io.File;

public class FileCheck {

	public static void main(String[] args) {
		File file = new File("C:\\Users\\노을\\Desktop\\과제\\out.txt");
		System.out.println(file.exists());  // 파일의 존재 여부 확인
		if(file.exists()) {
			file.delete();  // 파일 삭제
		}
		System.out.println(file.exists());
	}
}
