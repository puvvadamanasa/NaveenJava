package stringconcept;

public class StringManipulation {

	public static void main(String[] args) {
		String s = "This is my ijava code and I am so ihappy java is best";
		System.out.println(s.length());
		System.out.println(s.charAt(3));
		//System.out.println(s.charAt(-1));
		System.out.println(s.indexOf('z'));
		System.out.println(s.indexOf('i', s.indexOf('i')+1));
		System.out.println(s.indexOf("code"));
		System.out.println(s.indexOf("python"));
		
		String msg="Welcome to Admin";
		if(msg.indexOf("Admin")>0) {
			System.out.println("pass");
		}
		System.out.println(msg.toLowerCase());
		System.out.println(msg.toUpperCase());
		String s1 = "hello world";
		System.out.println(s1.trim());
		System.out.println(s1.replace(" ", ""));
		String dob = "01-11-2021";
		System.out.println(dob.replace("-", "/"));
		String[] temp = dob.split("-");
		System.out.println(temp[1]);
		String t3="naveen automation";
		System.out.println(t3.contains("naveen"));
		String t1="hello java";
		String t2="hello java";
		System.out.println(t1.equals(t2));
		System.out.println(t1.equalsIgnoreCase(t2));
		System.out.println(t1==t2);
		String t4= new String("Hello ruby");
		String t6="Hello ruby";
		String t7=new String("Hello ruby");
		System.out.println(t4==t7);//false
		System.out.println(t4==t6);
		System.out.println(t6==t7);
		String lang="JAVA_PYTHON_RUBY_PHP";
		String[] l = lang.split("_");
		for(String e:l) {
			System.out.println(e);
		}
		String name="xXtestingxXjavaXXSeleniumXxXPython";
		String[] namearr=name.split("xX");
		for(String e1:namearr) {
			System.out.println(e1);
		}
		System.out.println(namearr[0]);
		System.out.println(namearr[1]);
		System.out.println(namearr[2]);
		System.out.println(namearr[3]);
		String message = "your order id is 12345";
		System.out.println(message.substring(8));
		System.out.println(message.substring(17));
		System.out.println(message.substring(0,3));
		System.out.println(message.substring(message.indexOf("is")+3,message.length()));
	}
}
