package java0313;

import java.util.Arrays;

public class A1 {

	// A1 Descriptive Statistics
	// 2차원 문자열 배열 생성
	// 각 과목 및 개인의 점수 합계, 평균, 최소값, 최대값 계산
	// 힌트, Integer.parseInt
	// 완료
	public static void main(String[] args) {
		A1 a1 = new A1();
		String[][] statistics = a1.str();
		System.out.println("-------------------------------------------------");
		a1.Jeong(statistics);
		a1.Pyo(statistics);
		a1.Choi(statistics);
		a1.Mike(statistics);
		System.out.println("-------------------------------------------------");
		a1.Korean(statistics);
		a1.English(statistics);
		a1.Math(statistics);
	}
	
	public String[][] str () {
		String[][] statistics = {{"Name","Korean","English","Math"},{"Jeong","70","80","100"}
		,{"Pyo","60","70","86"},{"Choi","54","100","82"},{"Mike","87","95","79"}};
		for (int i = 0; i < statistics.length; i++) {
			for (int j = 0; j < statistics[i].length; j++) {
				System.out.print(statistics[i][j] + "\t");
			}
			System.out.println();
		}
		return statistics;
	}
	
	// Korean 점수 계산
	public void Korean(String[][] statistics) {
		int Korean[] = new int[4];
		for (int i = 0; i < statistics.length-1; i++) {
			if(String.valueOf(statistics[0][i]).equals("Korean")) {
				for (int j = 1; j <= statistics[i].length; j++) {
					Korean[j-1] =  Integer.parseInt(statistics[j][i]);
				}
			}
		}
		// 배열 오름차순 정렬
				Arrays.sort(Korean);
				
				int summation = 0;
				int average = 0;
				int minimum = 0;
				int maximim = 0;
				// 합계
				for (int i = 0; i < Korean.length; i++) {
					summation += Korean[i]; 
					if(i == 0) {
						minimum = Korean[i];
					}
					if(i+1 == Korean.length) {
						maximim = Korean[Korean.length-1];
					}
				}
				// 평균
				average = summation/Korean.length;
				
				System.out.println("Korean의 합계 : " + summation + " 평균 : " + average + " 최소값 : " + minimum + " 최대값 : " + maximim);
	}
	
	// English 점수 계산
	public void English(String[][] statistics) {
		int English[] = new int[4];
		for (int i = 0; i < statistics.length-1; i++) {
			if(String.valueOf(statistics[0][i]).equals("English")) {
				for (int j = 1; j <= statistics[i].length; j++) {
					English[j-1] =  Integer.parseInt(statistics[j][i]);
				}
			}
		}
		// 배열 오름차순 정렬
				Arrays.sort(English);
				
				int summation = 0;
				int average = 0;
				int minimum = 0;
				int maximim = 0;
				// 합계
				for (int i = 0; i < English.length; i++) {
					summation += English[i]; 
					if(i == 0) {
						minimum = English[i];
					}
					if(i+1 == English.length) {
						maximim = English[English.length-1];
					}
				}
				// 평균
				average = summation/English.length;
				
				System.out.println("English의 합계 : " + summation + " 평균 : " + average + " 최소값 : " + minimum + " 최대값 : " + maximim);
		
	}
	
	// Math 점수 계산
	public void Math(String[][] statistics) {
		int Math[] = new int[4];
		for (int i = 0; i < statistics.length-1; i++) {
			if(String.valueOf(statistics[0][i]).equals("Math")) {
				for (int j = 1; j <= statistics[i].length; j++) {
					Math[j-1] =  Integer.parseInt(statistics[j][i]);
				}
			}
		}
		// 배열 오름차순 정렬
				Arrays.sort(Math);
				
				int summation = 0;
				int average = 0;
				int minimum = 0;
				int maximim = 0;
				// 합계
				for (int i = 0; i < Math.length; i++) {
					summation += Math[i]; 
					if(i == 0) {
						minimum = Math[i];
					}
					if(i+1 == Math.length) {
						maximim = Math[Math.length-1];
					}
				}
				// 평균
				average = summation/Math.length;
				
				System.out.println("Math의 합계 : " + summation + " 평균 : " + average + " 최소값 : " + minimum + " 최대값 : " + maximim);
		
	}
	
	// Jeong 점수 계산
	public void Jeong(String[][] statistics) {
		int[] Jeong = new int[3];
		for (int i = 0; i < statistics.length; i++) {
			if(String.valueOf(statistics[i][0]).equals("Jeong")) {
				for (int j = 1; j < statistics[i].length; j++) {
					Jeong[j-1] =  Integer.parseInt(statistics[i][j]);
				}
			}
		}
		// 배열 오름차순 정렬
		Arrays.sort(Jeong);
		
		int summation = 0;
		int average = 0;
		int minimum = 0;
		int maximim = 0;
		// 합계
		for (int i = 0; i < Jeong.length; i++) {
			summation += Jeong[i]; 
			if(i == 0) {
				minimum = Jeong[i];
			}
			if(i+1 == Jeong.length) {
				maximim = Jeong[Jeong.length-1];
			}
		}
		// 평균
		average = summation/Jeong.length;
		
		System.out.println("Jeong의 합계 : " + summation + " 평균 : " + average + " 최소값 : " + minimum + " 최대값 : " + maximim);
	}
	
	// Pyo 점수 계산
	public void Pyo(String[][] statistics) {
		int[] Pyo = new int[3];
		for (int i = 0; i < statistics.length; i++) {
			if(String.valueOf(statistics[i][0]) .equals("Pyo")) {
				for (int j = 1; j < statistics[i].length; j++) {
					Pyo[j-1] =  Integer.parseInt(statistics[i][j]);
				}
			}
		}
		// 배열 오름차순 정렬
		Arrays.sort(Pyo);
		
		int summation = 0;
		int average = 0;
		int minimum = 0;
		int maximim = 0;
		// 합계
		for (int i = 0; i < Pyo.length; i++) {
			summation += Pyo[i]; 
			if(i == 0) 
				minimum = Pyo[i];
			if(i+1 == Pyo.length)
				maximim = Pyo[Pyo.length-1];
		}
		// 평균
		average = summation/Pyo.length;
		
		System.out.println("Pyo의 합계 : " + summation + " 평균 : " + average + " 최소값 : " + minimum + " 최대값 : " + maximim);
	}
	
	// Choi 점수 계산
	public void Choi(String[][] statistics) {
		int[] Choi = new int[3];
		for (int i = 0; i < statistics.length; i++) {
			if(String.valueOf(statistics[i][0]) .equals("Choi")) {
				for (int j = 1; j < statistics[i].length; j++) {
					Choi[j-1] =  Integer.parseInt(statistics[i][j]);
				}
			}
		}
		// 배열 오름차순 정렬
		Arrays.sort(Choi);
		
		int summation = 0;
		int average = 0;
		int minimum = 0;
		int maximim = 0;
		// 합계
		for (int i = 0; i < Choi.length; i++) {
			summation += Choi[i]; 
			if(i == 0) 
				minimum = Choi[i];
			if(i+1 == Choi.length)
				maximim = Choi[Choi.length-1];
		}
		// 평균
		average = summation/Choi.length;
		
		System.out.println("Choi의 합계 : " + summation + " 평균 : " + average + " 최소값 : " + minimum + " 최대값 : " + maximim);
	}
	
	// Mike 점수 계산
	public void Mike(String[][] statistics) {
		int[] Mike = new int[3];
		for (int i = 0; i < statistics.length; i++) {
			if(String.valueOf(statistics[i][0]) .equals("Mike")) {
				for (int j = 1; j < statistics[i].length; j++) {
					Mike[j-1] =  Integer.parseInt(statistics[i][j]);
				}
			}
		}
		// 배열 오름차순 정렬
		Arrays.sort(Mike);
		
		int summation = 0;
		int average = 0;
		int minimum = 0;
		int maximim = 0;
		// 합계
		for (int i = 0; i < Mike.length; i++) {
			summation += Mike[i]; 
			if(i == 0) 
				minimum = Mike[i];
			if(i+1 == Mike.length)
				maximim = Mike[Mike.length-1];
		}
		// 평균
		average = summation/Mike.length;
		
		System.out.println("Mike의 합계 : " + summation + " 평균 : " + average + " 최소값 : " + minimum + " 최대값 : " + maximim);
	}
	
	
	
}
