package oop_Encapsulation;

public class Employee {

	public static void main(String[] args) {
		Company c1 = new Company();
		c1.setShareprice(134);
		int sp = c1.getShareprice();
		System.out.println(sp);
		c1.name="sdkj";
		c1.hq="hyd";

	}

}
