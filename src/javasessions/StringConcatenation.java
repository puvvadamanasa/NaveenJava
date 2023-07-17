package javasessions;

public class StringConcatenation {
	public static void main(String[] args) {
		String s="hello world";
		String s1="100";
		String ph="8978946841";
		String cc="1234 567 8910";
		String x="Hello";
		String y="Testing";
		int a=100;
		int b=200;
		System.out.println(a+b);
		System.out.println(x+y);
		System.out.println(x+a);
		System.out.println(a+x);
		System.out.println(a+b+x+y);
		System.out.println(x+y+a+b);
		System.out.println(x+y+(a+b));
		System.out.println(x+y+a+b+a+b);
		System.out.println("The valu of a: "+a);
		System.out.println("The valu of b: "+b);
		System.out.println("The valu of a+b: "+(a+b));
		System.out.println(x+" "+y);
		double c=12.3;
		double d=12.5;
		System.out.println(x+y+c+d);
		char c1='a';
		char c2='b';
		System.out.println(c1+c2);
		System.out.println(c1+""+c2);
		byte b1=10;
		byte b2=20;
		System.out.println(b1+b2);
		int b3=b1+b2;
		System.out.println(b3);
		int g=10;
		int h=3;
		System.out.println(10/3);
		System.out.println(10/2);
		System.out.println(10.0/3);
		System.out.println(10.0/3.0);
		System.out.println(10/3.0);
		//System.out.println(0/0);AE
		System.out.println(0.0/0);
		System.out.println(0/0.0);
		System.out.println(0.0/0.0);
		System.out.println(5.0/0);
		System.out.println(5/0.0);
		char t='z';
		System.out.println(t);
		System.out.println((int)t);
		char[] co = new char[3];
		co[0]='a';
		co[1]='b';
		co[2]='c';
		for(int i=0;i<co.length;i++) {
			System.out.println(co[i]);
		}
	}

}
