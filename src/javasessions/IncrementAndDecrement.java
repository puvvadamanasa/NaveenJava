package javasessions;

public class IncrementAndDecrement {

	public static void main(String[] args) {
		int a=1;
		int b=a++;
		System.out.println(a);//2
		System.out.println(b);//1
		
		int g=-99;
		int h=g++;
		System.out.println(g);//-98
		System.out.println(h);//-99
		
		int c=1;
		int d=++c;
		System.out.println(c);//2
		System.out.println(d);//2
		
		int m=-97;
		int n=++m;
		System.out.println(m);//-96
		System.out.println(n);//-96
		
		int p=2;
		int q=p--;
		System.out.println(p);//1
		System.out.println(q);//2
		
		int u=2;
		int y=--u;
		System.out.println(u);//1
		System.out.println(y);//1
		
		int t1=2;
		System.out.println(t1++);//2
		System.out.println(t1);//3
		
		int i=5;
		System.out.println(++i);//6
		System.out.println(i);//6

	}

}
