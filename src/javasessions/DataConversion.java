package javasessions;

public class DataConversion {

	public static void main(String[] args) {
		String s="100";
		System.out.println(s+20);
		int i = Integer.parseInt(s);
		System.out.println(i+20);
		//String s1="100A";
		//int j = Integer.parseInt(s1);
		String s1="10.2";
		double d = Double.parseDouble(s1);
		System.out.println(d);
		//int to string
		int io=10;
		String gh = String.valueOf(io);
		System.out.println(gh);
		double jk=10.5;
		String yu = String.valueOf(jk);
		System.out.println(yu);
		String e = "true";
		boolean t = Boolean.parseBoolean(e);
		System.out.println(t);	
	}
}
