package java0309;

public class Doing {
	String name = "";
	double version = 1.2;
	
	
	public Doing(String name, double version) { // 생성자
		this.name = name;
		this.version = version;
	}
	
	public void getName() {
		System.out.println(name);
	}
	
	public void getVersion() {
		System.out.println(version);
	}
}
