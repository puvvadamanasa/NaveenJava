package exceptionhandling;

public class TryCatchBlock {
	int i;

	public static void main(String[] args) {
		System.out.println("A");
		System.out.println("A");
		System.out.println("A");
		TryCatchBlock t = new TryCatchBlock();
		t=null;
		
		try {
			t.i=10;
			System.out.println("Hi");
			System.out.println(10/0);
			System.out.println("------");
		}catch(ArithmeticException e) {
			e.printStackTrace();
			System.out.println("Hello");
		}catch(NullPointerException e1) {
			System.out.println("np");
			e1.printStackTrace();
			System.out.println("Hello");
		}

	}

}
