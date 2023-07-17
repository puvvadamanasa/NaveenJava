package stringconcept;

public class StringManipulation2 {

	public static void main(String[] args) {
		String s="This is java code and I am so happy";
		System.out.println(s.length());
		System.out.println(s.charAt(0));
		System.out.println(s.charAt(s.length()-1));
		//System.out.println(s.charAt(35));
		System.out.println(s.indexOf("i"));
		System.out.println(s.indexOf("is"));
		System.out.println(s.indexOf("i",s.indexOf("i")+1));
		System.out.println(s.indexOf("z"));
		System.out.println(s.indexOf("python"));
		String msg="Welcome Admin";
		if(msg.indexOf("Admin")>0) {
			System.out.println("pass");
		}
		String s1=" hello world ";
		System.out.println(s1.trim());
		System.out.println(s1.replace(" ", ""));
		String dob="01-01-2939";
		System.out.println(dob.replace("-", "/"));
		String c="Welcome to Naveen Automation";
		System.out.println(c.contains("jhk"));
		String t1="hello java";
		String t2="hello java";
		String t3="hello java";
		t2="hello python";
		System.out.println(t1==t2);
		System.out.println(t1.equals(t2));
		System.out.println(t1.equalsIgnoreCase(t2));
		String t4 = new String("hello ruby");
		String t5 ="hello ruby";
		String t7 = new String("hello ruby");
		System.out.println(t4==t5);
		System.out.println(t5==t7);
		System.out.println(t4==t7);
		String h="XxJavaxXxPythonXxXSelenium";
		String[] sp = h.split("Xx");
		System.out.println(sp[0]);
		System.out.println(sp[1]);
		String msf = "the order id is 12345";
		System.out.println(msf.substring(3));
		System.out.println(msf.substring(0,4));
		System.out.println(msf.substring(msf.indexOf("is")+3, msf.length()));
		

	}

}
