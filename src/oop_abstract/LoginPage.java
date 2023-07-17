package oop_abstract;

public class LoginPage extends Page{
	public LoginPage() {
		System.out.println("Loginpage default");
	}

	@Override
	public void title() {
		System.out.println("Loginpage title");
	}

	@Override
	public void url() {
		System.out.println("Loginpage url");
	}
	public void header() {
		System.out.println("Loginpage header");
	}
	public void doLogin() {
		System.out.println("do login");
	}

	public static void hi() {
		System.out.println("Lp hi");
	}

}
