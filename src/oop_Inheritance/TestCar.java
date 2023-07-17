package oop_Inheritance;

public class TestCar {

	public static void main(String[] args) {
		Car c = new Car();
		c.start();
		c.stop();
		c.refuel();
		Car.drive();
		c.engine();
		c.comp();
		//c.start();
		BMW b = new BMW();
		b.start();
		b.stop();
		b.refuel();
		b.autoparking();
		BMW.drive();
		b.engine();
		Car c1 = new BMW();
		c1.start();
		c1.stop();
		c1.refuel();
		c1.drive();//static methods can be inherited but cannot be overwritten
		//BMW b1 = (BMW)new Car();down casting is not allowed during runtime
		c1.engine();
		Audi a = new Audi();
		a.start();
		a.stop();
		a.refuel();
		a.auto();
		Car c2 = new Audi();
		c2.start();
		c2.stop();
		c2.refuel();
		Vehicle v = new BMW();
		v.start();
		v.engine();
		//BMW b2 = (BMW) new Vehicle();
		Automobile au = new BMW();
		au.start();
		au.comp();	
	}

}
