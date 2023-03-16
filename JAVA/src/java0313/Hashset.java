package java0313;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Hashset {
	// 겹치는 데이터는 저장x
	public static void main(String[] args) {
//		HashSet();
//		ArrayList();
//		list();
//		Iterator();

	}
	
	public static void HashSet() {
		HashSet<String> name = new HashSet<String>();
		name.add("kim");
		System.out.println(name);
		name.add("lee");
		System.out.println(name);
		name.add("kim");
		System.out.println(name);
	}
	
	public static void ArrayList() {
		ArrayList<String> name = new ArrayList<String>();
		name.add("kim");
		name.add("lee");
		name.add("john");
		
		System.out.println(name);
		System.out.println(name.size());
		System.out.println(name.get(2));
		
		name.remove(1);
		System.out.println(name);
		
		name.set(1, "park");
		System.out.println(name);
		System.out.println(name.size());
		
		name.add("lee");
		System.out.println(name);
		
		// sort 내림차순
		Collections.sort(name);
		System.out.println(name);
		
		// reverse 오름차순
		Collections.reverse(name);
		System.out.println(name);
	}
	
	public static void list() {
		List<Integer> list = new ArrayList<Integer>();
		
		for (int i = 0; i < 10; i++) {
			list.add((int)(Math.random()* 10));
			
		}
		System.out.println(list);
	}
	
	public static void Iterator() {
		List<String> list = new ArrayList<String>();
		list.add("kim");
		list.add("lee");
		list.add("park");
		
		java.util.Iterator<String> iterator = list.iterator();
		
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		System.out.println("----------------------");
		
		for (String name : list) {
			System.out.println(name);
		}
		
		System.out.println("-----------------------------");
		
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
	}
	
	public static void Queue() {
		Queue<String> name = new LinkedList<String>();
		name.offer("kim");
		System.out.println(name);
		name.offer("lee");
		System.out.println(name);
		System.out.println(name.poll());
		System.out.println(name.poll());
		System.out.println(name);
	}

}
