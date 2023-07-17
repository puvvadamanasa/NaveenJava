package constructor_concept;

public class Customer {
	private String name;
	private int age;
	private String comp;
	
	public Customer() {
		System.out.println("Dfautl customer");
	}
	

	public Customer(String name, String comp) {
		
		this.name = name;
		this.comp = comp;
	}


	public Customer(String name, int age, String comp) {
		
		this.name = name;
		this.age = age;
		this.comp = comp;
	}


	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getComp() {
		return comp;
	}

	public void setComp(String comp) {
		this.comp = comp;
	}
	public String getCustomerInfo() {
		return this.name+" "+this.age+this.comp;
	}

}
