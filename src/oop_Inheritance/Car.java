package oop_Inheritance;

public  class Car extends Vehicle{
	public final void  logo() {
		//final class cannot be parent
		//final method cannot be overwritten
		//static method can be inherited but cannot be overwritten
	}
	public  void start() {
		System.out.println("car start");
	}
	public void stop() {
		System.out.println("car stop");
	}
	public void refuel() {
		System.out.println("car refuel");
	}
	public static void drive() {
		System.out.println("car drive");
	}

}
