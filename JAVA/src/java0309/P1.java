package java0309;

import java.util.Scanner;

public class P1 {
	public static final String FatherName = "Piter";
	public static final String MotherName = "kate";
	public static final String SonName = "John";
	public static final String DaughterName = "Minji";
	
	public static final int FatherINDEX = 1;
	public static final int MotherINDEX = 2;
	public static final int SonINDEX = 3;
	public static final int DaughtINDEX = 4;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		P1 clas = new P1();
		while (true) {
			clas.famileManu();
			int num = clas.selects();
			String name = clas.familyName(num);
			System.out.println(name);
			break;
		}
	}

	private void famileManu() {
		System.out.println("1. Father \n" + "2. Mother \n" + "3. Son \n" + "4. Daughter \n");
	}

	public int selects() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("selects a number for a family member >>> ");
		int num1 = scanner.nextInt();
		return num1;
	}

	public String familyName(int selects) {
		String str = "";
		switch (selects) {
		case FatherINDEX:
			str = FatherName;
			break;
		case MotherINDEX:
			str = MotherName;
			break;
		case SonINDEX:
			str = SonName;
			break;
		case DaughtINDEX:
			str = DaughterName;
			break;
		}
		return str;
	}
}
