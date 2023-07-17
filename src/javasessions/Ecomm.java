package javasessions;

public class Ecomm {
	public void login() {
		System.out.println("login");
	}
	public void login(String un,String pwd) {
		System.out.println("login un and pwd");
	}
	public void login(String un,String pwd,int otp) {
		System.out.println("login un and pwd otp");
	}
	public void login(String un,int otp) {
		System.out.println("login un and otp");
	}
	public void login(int otp,String un) {
		System.out.println("login un and otp");
	}

	public static void main(String[] args) {
		
	}

}
