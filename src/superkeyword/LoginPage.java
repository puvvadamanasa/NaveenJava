package superkeyword;

public class LoginPage extends Page{
	int timeout=200;
	public LoginPage() {
		super(10,20);
		System.out.println("Hi");
		
	}
	public void logininfo() {
		System.out.println("logininfo methods");
		display();
		super.display();
	}
	@Override
	public void display() {
		
		System.out.println("Loginpage display");
		super.display();
	}
	public void getTimeOut() {
		System.out.println(this.timeout);
		System.out.println(super.timeout);
	}

}
