package javasessions;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class ArrayListGenerics {

	public static void main(String[] args) {
		ArrayList<Integer> i = new ArrayList<>();
		i.add(10);
		i.add(20);
		i.add(30);
		System.out.println(i.size());
		System.out.println(i.get(0));
		System.out.println(i.get(1));
		for(Integer l:i) {
			System.out.println(l);
		}
		for(int l:i) {
			System.out.println(l);
		}
		ArrayList<Double> d = new ArrayList<>();
		d.add(10.2);
		d.add(10.5);
		d.add(10.67);
		System.out.println(d);
		for(Double d1:d) {
			System.out.println(d1);
		}
		for(double d1:d) {
			System.out.println(d1);
		}
		ArrayList<String> s = new ArrayList<>();
		s.add("manasa");
		s.add("harish");
		s.add("jaasritha");
		for(String e:s) {
			System.out.println(e);
		}
		ArrayList<Object> o = new ArrayList<>();
		o.add("manasa");
		o.add(true);
		o.add(12.5);
		o.add(10);
		for(Object o1:o) {
			System.out.println(o1);
		}
		ArrayList list = new ArrayList<>();
		list.add(10);
  }

}
