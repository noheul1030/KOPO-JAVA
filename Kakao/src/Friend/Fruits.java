package Friend;

public class Fruits {
	String name = "";
	int price = 0;
	
	public Fruits(String name,int price) {
		this.name = name;
		this.price = price;
	}
	
	public Fruits() {
		this("apple",1000);
	}
	
	

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	
}
