package javasessions;

public class Car {
	String name;
	int price;
	String color;
	static int wheels=4;

	public static void main(String[] args) {
		Car c = new Car();
		c.name="Audi";
		c.price=123;
		c.color="red";
		c.wheels=4;
		Car.wheels=4;
		wheels=4;
		System.out.println(c.name+" "+c.price+" "+c.color+" "+Car.wheels);
		Car c1 = new Car();
		c1.name="BMW";
		c1.price=98;
		c1.color="blue";
		System.out.println(c1.name+" "+c1.price+" "+c1.color+" "+Car.wheels);

	}

}
