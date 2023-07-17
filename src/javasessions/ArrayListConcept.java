package javasessions;

import java.util.ArrayList;

public class ArrayListConcept {

	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		System.out.println(list.size());
		list.add(10);
		list.add(20.5);
		list.add(true);
		list.add('c');
		System.out.println(list);
		System.out.println(list.size());
		System.out.println(list.get(0));
		System.out.println(list.get(3));
		System.out.println(list.size());
		list.remove(2);
		System.out.println(list);
		System.out.println(list.get(2));
		for(int i=0;i<list.size();i++) {
			System.out.println(list.get(i));
		}
	}

}
