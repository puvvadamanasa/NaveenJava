package mapconcept;

import java.util.HashMap;


public class LoginPage {
	public static String getUserCred(String role) {
		HashMap<String, String> map1 = new HashMap<String, String>();
		map1.put("admin", "admin@az.com;admin123");
		map1.put("customer", "cust@gmail.com;cust123");
		map1.put("seller", "seller@yahoo.com;seller123");
		map1.put("partner", "partner@yo.com;partner123");
		map1.put("distributor", "distributor@nm.com;distributor123");
		map1.put("catmanager", "catmanager@qw.com;catmanager123");
		return map1.get(role);
		
	}
	public static void main(String[] args) {
		String s = LoginPage.getUserCred("partner");
		System.out.println(s);
		String[] s1 = s.split(";");
		System.out.println(s1[0]);
		System.out.println(s1[1]);
		String un = s1[0].trim();
		String pwd = s1[1].trim();
		
	}

}
