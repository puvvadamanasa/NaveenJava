package javasessions;

public class Functions {
	int i;
	public void test() {
		int i=10;
		System.out.println(i);
		System.out.println("test");
	}
	public void getprint() {
		System.out.println("get print");
	}
	public int getBalance() {
		int fee=20;
		int tax=5;
		int total = fee+tax;
		return total;
	}
	public String getTrainername() {
		String name="Naveen";
		return name;
	}
	public boolean isActive() {
		return true;
	}
	public int add(int a, int b) {
		return a+b;
	}
	public int getCourseFee(String course) {
		if(course.equals("selenium")) {
			return 100;
		}
		else if(course.equals("qtp")) {
			return 90;
		}
		else if(course.equals("lr")) {
			return 80;
		}
		else{
			System.out.println("not found");
			return -1;
		}
	}

	public static void main(String[] args) {
		Functions f = new Functions();
		f.i=20;
		f.test();
		f.getprint();
		int i = f.getBalance();
		System.out.println(i);
		String name = f.getTrainername();
		boolean s = f.isActive();
		int c= f.add(10, 20);
		System.out.println(c);
		int fees = f.getCourseFee("selenium");
		System.out.println(fees);
	}

}
