package javasessions;

public class Datatypes {

	public static void main(String[] args) {
		//primitive
		  //boolean
		  //numeric
		     //character 2 bytes
		     //integral
		       //byte 1 byte short 2 bytes int 4 bytes long 8bytes
		       //float 4 double 8
		//non-primitive
		byte b=-128;
		System.out.println(b);
		//byte b1=130;
		//System.out.println(b1);
		short s=20;
		System.out.println(s);
		//int i=20;
		//System.out.println(i);
		long g=1903243924230L;
		System.out.println(g);
		float f=12.5f;
		System.out.println(f);
		float f1=(float)12.45;
		double d=12.45;
		System.out.println(d);
		char c='a';
		System.out.println(c);
		System.out.println((int)c);
		//00 01 02
		//10 11 12
		//21 22 23
		for(int i=0;i<=2;i++) {
			for(int j=0;j<=2;j++) {
				System.out.print(i+""+j+" ");
			}
			System.out.println();
		}
	}

}
