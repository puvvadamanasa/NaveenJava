package constructor_concept;

public class Employee {
	String name;
	int id;
	int age;
	double salary;
	boolean isperm;
	char gender;
	public Employee() {
		System.out.println("def const");
	}
	
	public Employee(int id, int age, double salary, boolean isperm) {
		super();
		this.id = id;
		this.age = age;
		this.salary = salary;
		this.isperm = isperm;
	}

	public Employee(String name, int id, int age, double salary, boolean isperm, char gender) {
		this.name = name;
		this.id = id;
		this.age = age;
		this.salary = salary;
		this.isperm = isperm;
		this.gender = gender;
	}
	
	

}
