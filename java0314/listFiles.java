package java0314;

import java.io.File;

// 해당 주소의 파일안에 생성된 목록 불러오기
public class listFiles {

	public static void main(String[] args) {
		File dir = new File("C:\\Users\\노을\\Desktop\\과제");
		File files[] = dir.listFiles();
		
		for (int i = 0; i < files.length; i++) {
			System.out.println(files[i]);
		}
	}
}
