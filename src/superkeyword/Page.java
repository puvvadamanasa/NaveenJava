package superkeyword;

public class Page {
	int timeout=100;
	public Page() {
		System.out.println("page default");
	}
	public Page(int a) {
		System.out.println("page default: "+a);
	}
	public Page(int a,int b) {
		System.out.println("page default: "+(a+b));
	}
	public void display() {
		System.out.println("page display");
	}

}
