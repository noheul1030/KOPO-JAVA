package Friend;

import java.util.Scanner;

public class Main {

	Fruits apple;
	Fruits strawberry;
	Fruits grape;
	Fruits watermelon;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// PrintClass 호출
//		PrintClass pc = new PrintClass(19, 1); // Constructor (생성자)
//		System.out.println(pc.printAdd());
//		System.out.println(pc.printMulti());
////		int result = pc.printAdd(19, 1);
////		System.out.println(result);
//
//		PrintClass pc2 = new PrintClass(19, 2);
//		System.out.println(pc2.printAdd());
//		System.out.println(pc2.printMulti());

//		Main main = new Main();
//		main.initializing();
//		
//		while (true) {
//			int num = main.showMenu();
//			main.showInformation(num);
//		}

		Fruits f = new Fruits();
		System.out.println(f.getName());
		System.out.println(f.getPrice());
		Fruits f2 = new Fruits("melon", 3000);
		System.out.println(f2.getName());
		System.out.println(f2.getPrice());
		
		
		Sub sub = new Sub();
		sub.showInformation();
	}
}

class Sub {
	public void showInformation() {
		System.out.println("Nothing");
	}
}


//	public void showInformation(int number) {
//		String name = "";
//		int price = 0;
//
//		if (number == 1) {
//			name = apple.getName();
//			price = apple.getPrice();
//		} else if (number == 2) {
//			name = strawberry.getName();
//			price = strawberry.getPrice();
//		} else if (number == 3) {
//			name = grape.getName();
//			price = grape.getPrice();
//		} else if (number == 4) {
//			name = watermelon.getName();
//			price = watermelon.getPrice();
//		}
//		System.out.println("This fruit is " + name + ", and the price of it is " + price);
//	}
//
//	public void initializing() {
//		apple = new Fruits("red apple", 1000);
//		strawberry = new Fruits("blue strawberry", 2000);
//		grape = new Fruits("white grape", 3000);
//		watermelon = new Fruits("yello watermelon", 4000);
//
//		grape.setName("Black grape");
//		grape.setPrice(5000);
//	}
//
//	public int showMenu() {
//		Scanner scanner = new Scanner(System.in);
//		System.out.println("1. Apple");
//		System.out.println("2. Strawberry");
//		System.out.println("3. Grape");
//		System.out.println("4. Watermelon");
//		int num = scanner.nextInt();
//		return num;
//	}
//}
