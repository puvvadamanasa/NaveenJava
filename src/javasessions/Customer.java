package javasessions;

import java.util.ArrayList;

public class Customer {
	
	public ArrayList<String> doSearch(String pn) {
		ArrayList<String> list = new ArrayList<>();
		switch(pn) {
		case "Apple":
			list.add("iphone");
			list.add("ipad");
			list.add("ear buds");
			break;
		case "Samsung":
			list.add("ref");
			list.add("tv");
			list.add("phone");
			break;
		case "LG":
			list.add("dks");
			list.add("klj");
			list.add("ljlas");
			break;
		default:
			System.out.println("Invalid pn");
		}
		return list;
		
	}

	public static void main(String[] args) {
		Customer c = new Customer();
		ArrayList<String> l = c.doSearch("Aple");
		System.out.println(l);

	}

}
