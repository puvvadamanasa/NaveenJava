package oop_abstract;

public class AmazonTest {

	public static void main(String[] args) {
		LoginPage lp = new LoginPage();
//		lp.title();
//		lp.url();
//		lp.header();
//		lp.doLogin();
//		lp.logo();
		LoginPage.hi();
		Page p = new LoginPage();
		p.title();
		p.url();
		p.header();
		p.logo();
		p.hi();//static methods cannot be overwritten
		
	}

}
