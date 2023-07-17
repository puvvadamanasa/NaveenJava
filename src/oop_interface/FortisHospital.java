package oop_interface;

public class FortisHospital extends UNHG implements USMedical,UKMedical,IndianMedical{

	@Override
	public void cancerservices() {
		System.out.println("IndianMedical cance");
	}

	@Override
	public void aidsservices() {
		System.out.println("IndianMedical aids");
		
	}

	@Override
	public void feverservices() {
		System.out.println("IndianMedical fever");
	}

	@Override
	public void dentalservices() {
		System.out.println("UKMedical dental");
		
	}

	@Override
	public void padiatricservices() {
		System.out.println("UKMedical pedia");
	}

	@Override
	public void orthoservices() {
		System.out.println("UsMedical ortho");
	}


	@Override
	public void cardioservices() {
		System.out.println("UsMedical cardio");
	}

	@Override
	public void opdservices() {
		System.out.println("UsMedical opd");
	}

	@Override
	public void neuroservices() {
		System.out.println("UKMedical neuro");
	}
	public void inpatient() {
		System.out.println("fortis inpatient");
	}

	@Override
	public void emergencyservices() {
		System.out.println("Emergency");
	}

	@Override
	public void escape() {
		System.out.println("fotis escape");
		
	}

	@Override
	public void covidtest() {
		System.out.println("fh covidtest");
	}
	@Override
	public void medicalinfo() {
		System.out.println("fortis medical info");
	}
	
}
