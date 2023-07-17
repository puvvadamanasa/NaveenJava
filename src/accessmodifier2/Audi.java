package accessmodifier2;

import accessmodifier1.Car;

public class Audi extends Car{

	public static void main(String[] args) {
		Car c = new Car();
		c.name="bmw";
		
		Audi a = new Audi();
		a.name="bmw";
		a.ln=123;
	}

}
