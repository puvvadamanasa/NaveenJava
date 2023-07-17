package javasessions;

public class LoopsConcept {

	public static void main(String[] args) {
//		int i=1;
//		while(i<=10) {
//			System.out.println(i);
//			i++;
//		}
		int k=1;
		while(true) {
			System.out.println(k);
			k++;
			if(k==20) {
				break;
			}
		}
//		while(true) {
//			System.out.println("welcome to taj");
//		}
//		int i=1;
//		for(;i<=10;) {
//			System.out.println(i);
//			i++;
//		}
//		for(;;) {
//			System.out.println(i);
//		}
		for(int i=1;i<=10;i++) {
			if(i%2!=0) {
				System.out.println(i);
			}
		}
		for(double d=1.0;d<=10.0;d++) {
			System.out.println(d);
		}
		for(char c='A';c<='Z';c++) {
			System.out.println((int)c);
		}
		for(int c1=65;c1<=90;c1++) {
			System.out.println((char)c1);
		}
		System.out.println(10/3);
		System.out.println(10.0/3);
		System.out.println(10/3.0);
		System.out.println(10.0/3.0);
		for(int i=1;i<=100;i++) {
			if(i%5==0) {
				System.out.println(i);
			}
		}
		int r=1;
		do {
			System.out.println(r);
			r++;
		}
		while(r<0);
	}

}
