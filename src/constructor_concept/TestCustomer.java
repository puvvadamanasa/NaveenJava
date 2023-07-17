package constructor_concept;

public class TestCustomer {
      public static void main(String[] args) {
		Customer c = new Customer();
		String s = c.getCustomerInfo();
		System.out.println(s);
		Customer c1 = new Customer("manasa","capgemini");
		String s1 = c1.getCustomerInfo();
		System.out.println(s1);
		Customer c2 = new Customer("manasa",20,"capgemini");
		String s2 = c2.getCustomerInfo();
		System.out.println(s2);
		c2.setComp("morgan stanley");
		c2.getComp();
		 s2 = c2.getCustomerInfo();
		System.out.println(s2);
		//MySystem s = new MySystem();
		
	 }

}
