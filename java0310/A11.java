package java0310;

import java.util.Scanner;

public class A11 {

	public static void main(String[] args) {
		A11 a11 = new A11();
		a11.result();
	}

	
	public double scanner() {
		Scanner scanner = new Scanner(System.in);
		return scanner.nextDouble();
	}
	
	// m/s 값 받기
	public double ms() {
		double ms = this.scanner();
		return ms;
	}
	// km/h 값 받기
	public double kmh() {
		double kmh = this.scanner() / 3.6;
		
		return kmh;
	}
	// m/ms 값 받기
	public double mms() {
		double mms = this.scanner() * 1000;
		return mms;
	}
	
	public void result() {
		double ms = this.ms();
		double kmh = this.kmh();
		double mms = this.mms();
		System.out.println();
		
		double big = 0;
		
		if(ms > mms) 
			big = ms;
		else if(mms > ms) 
			big = mms;
		else if(ms == mms)
			big = ms;
		
		if(big < kmh)
			big = kmh;
			
		if(big == ms) 
			System.out.println((int)ms + "m/s");
		else if(big == kmh)
			System.out.println((int)(kmh * 3.6) +"km/h");
		else if(big == mms)
			System.out.println((int)(mms / 1000) +"m/ms");
		
	}
}

