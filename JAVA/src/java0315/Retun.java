package java0315;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Retun {

	public static void main(String[] args) {
		Retun re = new Retun();
		
		re.result(re.list());
		
	}
	
	public String scanner() {
		Scanner scanner = new Scanner(System.in);
		return scanner.next();
	}
	
	public List<String> list(){
		List<String> list = new ArrayList<String>();
		
		int i = 0;
		while(i < 2) {
		list.add(this.scanner());
		i++;
		}
		return result(list);
	}
	
	public List<String> result(List<String> list) {
		List<String> result = new ArrayList<String>();
		result.add(list.get(0));
		
		System.out.println(result);
	
		return result;
		
	}
}
