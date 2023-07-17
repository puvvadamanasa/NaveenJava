package javasessions;

public class Customers {
	String name;
	int id;
	static String city="Bangalore";
	static String payment="CC";
	public void getInfo() {
		System.out.println("get info");
	}
	public static void sendMail() {
		System.out.println("send mail");
	}

	public static void main(String[] args) {
		Customers c = new Customers();
		c.name="manasa";
		c.id=12;
		System.out.println(c.name+" "+c.id+" "+Customers.city+" "+Customers.payment);
		c.getInfo();
		sendMail();
		Customers.sendMail();
		c.sendMail();
		
	
	}

}
