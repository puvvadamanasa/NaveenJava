package oop_interface;

public interface UKMedical extends WHO{
	public void dentalservices();
	public void neuroservices();
	public void padiatricservices();
	public void emergencyservices();
	
	public static void dead() {
		System.out.println("UKMedical allowed");
	}

	

}
