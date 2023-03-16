package java0303;

public class A2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Fed.");
		System.out.println("Sun\tMon\tTue\tWed\tThu\tFri\tSat");
		System.out.println("\t1 \t2 \t3 \t4 \t5 \t6");
		System.out.println("7 \t8 \t9 \t10 \t11 \t12 \t13");
		System.out.println("14 \t15 \t16 \t17 \t18 \t19 \t20");
		System.out.println("21 \t22 \t23 \t24 \t25 \t26 \t27");
		System.out.println("28");
		
//		Calender();

	}

	public static void Calender() {

		System.out.println("Fed.");
		System.out.println("Sun\tMon\tTue\tWed\tThu\tFri\tSat");

		int Num = 0;
		while (Num < 28) {
			for (int i = 0; i < 7; i++) {
				Num++;
				if (i < 6) {
					System.out.print("\t" + Num);
				}
				if (i >= 6) {
					System.out.print("\n" +Num);
				}
				if (Num == 28) {
					break;
				}

			}
		}
	}
}