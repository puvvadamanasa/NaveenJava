package exceptionhandling;

public class Throwskey {
	public void m1() {
		System.out.println("m1");
		m2();
		
	}
	public void m2() throws ArithmeticException {
		System.out.println("m2");
		try {
			m3();
			}catch(ArithmeticException e) {
				e.printStackTrace();
			}
		
	}
	public void m3() throws ArithmeticException{
		System.out.println("m3");
		int i=10/0;
	}

	public static void main(String[] args) {
		Throwskey t = new Throwskey();
		t.m1();
	
	
	try {
		throw new Exception("naveen excep");
	}
	catch(Exception e) {
		e.printStackTrace();
	}
	
	}
}
