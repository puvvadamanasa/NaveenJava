package javasessions;

public class IfElseCondition {

	public static void main(String[] args) {
		int a=20;
		int b=20;
		if(a>b) {
			System.out.println("a is big");
		}
		else {
			System.out.println("b is big");
		}
		if(a==b) {
			System.out.println("Both are equal");
		}
//		if(true) {
//			System.out.println("Hi");
//		}
//		else {
//			System.out.println("Hello");
//		}
		boolean t=true;
		if(t) {
			System.out.println("Hi");
		}
		else {
			System.out.println("hello");
		}
		int number=90;
		if(number>100) {
			if(number<90) {
				System.out.println("No");
			}
			else {
				System.out.println("not");
			}
		}
		else {
			System.out.println("come agin");
		}

	}

}
