package mapconcept;

import java.util.HashMap;

public class Employee {

	public static void main(String[] args) {
		 HashMap<String, String> map = new HashMap<String, String>();
		 map.put("A", "Tom");
		 map.put("B", "Peter");
		 map.put("C", "Robert");
		 System.out.println(map);
		 System.out.println(map.get("A"));
		 HashMap<String, Integer> map1 = new HashMap<String, Integer>();
		 map1.put("Tom", 100);
		 map1.put("Peter", 200);
		 map1.put("Peter", 300);
		 map1.put("Naveen", 300);
		 System.out.println(map1);
		 map1.put(null, 400);
		 map1.put(null, 500);
		 System.out.println(map1);
		 map1.forEach((k,v)->System.out.println(k+" "+v));
		 System.out.println(map1.get("Peter"));
		 HashMap<Integer, Integer> map2 = new HashMap<Integer,Integer>();
		 map2.put(1, 100);
		 map2.put(2, 200);
		 System.out.println(map2);
		 HashMap<Integer, String> map3 = new HashMap<Integer,String>();
		 map3.put(1, "Tom");
		 map3.put(2, "Peter");
		 System.out.println(map3);
		 map3.forEach((k,v)->System.out.println(k+" "+v));

	}

}
