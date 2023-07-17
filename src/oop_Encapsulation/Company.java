package oop_Encapsulation;

public class Company {
	public String name;
	private int shareprice;
	public String hq;
	public int getShareprice() {
		return shareprice;
	}
	public void setShareprice(int shareprice) {
		this.shareprice = shareprice;
	}
	public static void main(String[] args) {
		Company c = new Company();
		c.name="IBM";
		c.hq="hyd";
		c.setShareprice(12);
		int sp = c.getShareprice();
		System.out.println(sp);
	}

}
