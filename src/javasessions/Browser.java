package javasessions;

public class Browser {
	String name;
	double version;
	String vendor;
	public void getInfo(Browser br) {
		System.out.println(br.name+" "+br.version+" "+br.vendor);
	}
	public void sum(int a,int b) {
		System.out.println(a+b);
	}

	public static void main(String[] args) {
		Browser b = new Browser();
		b.name="chrome";
		b.version=1.2;
		b.vendor="google";
		b.getInfo(b);
		

	}

}
