package oop_interface;

public interface USMedical extends WHO{
	public int minfee=100;
	public void orthoservices();
	public void opdservices();
	public void cardioservices();
	public void emergencyservices();
	public static void dead() {
		System.out.println("Not allowed");
	}
	default void escape() {
		System.out.println("escape");
	}

}
