package javasessions;

public class Arrayss {

	public static void main(String[] args) {
		int[] a = new int[4];
		System.out.println(a.length);
		a[0]=10;
		a[1]=20;
		a[2]=30;
		a[3]=40;
		System.out.println(a);
		System.out.println(a.length);
		System.out.println(a[0]);
		System.out.println(a[1]);
		System.out.println(a[2]);
		System.out.println(a[3]);
		System.out.println("Hi: "+(a.length-1));
		System.out.println("Li: "+0);
		for(int i=0;i<a.length;i++) {
			System.out.println(a[i]);
		}
		for(int j:a) {
			System.out.println(j);
		}
		double[] d=new double[3];
		d[0]=1.2;
		d[1]=1.4;
		d[2]=3.4;
		//d[3]=4.5;
		for(double d1:d) {
			System.out.println(d1);
		}
		char[] c = new char[4];
		c[0]='a';
		c[1]='b';
		c[2]='c';
		c[3]='d';
		for(char c1:c) {
			System.out.println(c1);
		}
		String[] lang = new String[4];
		lang[0]="java";
		lang[1]="python";
		lang[2]="koi";
		for(String e:lang) {
			System.out.println(e);
		}
		for(int i=0;i<lang.length;i++) {
			System.out.println(i+" "+lang[i]);
		}
		Object[] o = new Object[4];
		o[0]=true;
		o[1]=12.5;
		o[2]="manasa";
		o[3]=100;
		for(Object o1:o) {
			System.out.println(o1);
		}
		//System.out.println(o.toString());
		//System.out.println(o);
	

	}

}
