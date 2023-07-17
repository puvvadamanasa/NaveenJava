package oop_Encapsulation;

public class AmazonTest {

	public static void main(String[] args) {
		LoginPage lp = new LoginPage();
		lp.setUsername("jkl");
		lp.setPassword("pop");
		lp.login(lp.getUsername(), lp.getPassword());
		lp.setPassword("mnb0");
		lp.login(lp.getUsername(), lp.getPassword());
	

	}

}
