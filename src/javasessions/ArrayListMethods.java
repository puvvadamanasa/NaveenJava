package javasessions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ArrayListMethods {

	public static void main(String[] args) {
		ArrayList<String> list1 = new ArrayList<>(Arrays.asList("a","b","c","d","e"));
		System.out.println(list1);
		System.out.println(list1.size());
		int[] a = {10,20,30,40};
		System.out.println(Arrays.toString(a));
		ArrayList<String> list2 = new ArrayList<>(Arrays.asList("a","b","c","d","f"));
		System.out.println(list2);
		System.out.println(list1.removeAll(list2));
		System.out.println(list1);//e
		System.out.println(list2);//abcdf
		ArrayList<String> list3 = new ArrayList<>(Arrays.asList("a","b","c","d","f"));
		list3.removeAll(list3);
		System.out.println(list3);
		ArrayList<String> list4 = new ArrayList<>(Arrays.asList("a","b","c","d","e"));
		ArrayList<String> list5 = new ArrayList<>(Arrays.asList("a","b","c","d","f"));
		System.out.println(list5.removeAll(list4));
		System.out.println(list4);//abcde
		System.out.println(list5);//f
		ArrayList<String> list6 = new ArrayList<>(Arrays.asList("z","g","h","i","e"));
		ArrayList<String> list7 = new ArrayList<>(Arrays.asList("a","b","c","d","f"));
		System.out.println(list6.removeAll(list7));
		Collections.sort(list6);
		System.out.println(list6);
		ArrayList<String> list8 = new ArrayList<>(Arrays.asList("a","b","c","d","e"));
		ArrayList<String> list9 = new ArrayList<>(Arrays.asList("a","b","c","d","f"));
		list8.retainAll(list9);
		System.out.println(list8);
		System.out.println(list9);
		//find out the common elements
		ArrayList<String> list10 = new ArrayList<>(Arrays.asList("a","b","c","d","e"));
		ArrayList<String> list11= new ArrayList<>(Arrays.asList("a","b","c","d","f"));
		list11.retainAll(list10);
		System.out.println(list10);
		System.out.println(list11);
		ArrayList<String> list12 = new ArrayList<>(Arrays.asList("a","b","c","d","e"));
		ArrayList<String> list13= new ArrayList<>(Arrays.asList("a","b","d","c","e"));
		System.out.println(list12.equals(list13));
		ArrayList<String> list14 = new ArrayList<>(Arrays.asList("a","b","c","d","e"));
		ArrayList<String> list15= new ArrayList<>(Arrays.asList("a","b","d","c","f"));
		list14.addAll(list15);
		System.out.println(list14);
		System.out.println(list15);
		list15.clear();
		ArrayList<String> list16=(ArrayList<String>) list14.clone();
		System.out.println(list16);
		ArrayList<String> list17 = new ArrayList<>(Arrays.asList("java","python","php"));
		list17.add(0, "rpa");
		System.out.println(list17);
		//list17.add(10, "456");
		//System.out.println(list17);
		ArrayList<String> list18 = new ArrayList<>(Arrays.asList("a","b","c","d","e"));
		ArrayList<String> list19 = new ArrayList<>(Arrays.asList("a","c","d","d","e","g"));
		System.out.println(list18.contains("a"));
		System.out.println(list18.containsAll(list19));
		
		
		

	}

}
