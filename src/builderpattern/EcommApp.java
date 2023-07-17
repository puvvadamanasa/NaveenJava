package builderpattern;

public class EcommApp {
	public EcommApp login() {
		System.out.println("login method");
		return this;
	}
	public EcommApp login(String un,String pwd) {
		System.out.println("login with un and pwd");
		return this;
	}
	public EcommApp login(String un,String pwd,int otp) {
		System.out.println("Login with un and pwd otp");
		return this;
	}
	public EcommApp search() {
		System.out.println("Search method");
		return this;
	}
	public EcommApp search(String pname) {
		System.out.println("pname");
		return this;
	}
	public EcommApp search(String pname,String pid) {
		System.out.println("pname and pid");
		return this;
	}

}
