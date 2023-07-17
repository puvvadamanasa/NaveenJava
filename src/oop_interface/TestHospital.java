package oop_interface;

public class TestHospital {

	public static void main(String[] args) {
		FortisHospital f = new FortisHospital();
		f.aidsservices();
		f.cancerservices();
		f.cardioservices();
		f.dentalservices();
		f.emergencyservices();
		f.inpatient();
		f.feverservices();
		f.neuroservices();
		f.orthoservices();
		f.opdservices();
		f.dentalservices();
		f.escape();
		f.covidtest();
		f.medicalinfo();
		System.out.println(USMedical.minfee);
		//USMedical.minfee=200;
		System.out.println(FortisHospital.minfee);
		UNHG.covidguidelines();
		USMedical u = new FortisHospital();
		u.orthoservices();
		u.opdservices();
		u.cardioservices();
		u.emergencyservices();
		USMedical.dead();
		u.escape();
		u.covidtest();
		
		UKMedical u1 = new FortisHospital();
		u1.emergencyservices();
		u1.dentalservices();
		u1.neuroservices();
		u1.padiatricservices();
		UKMedical.dead();
		//FortisHospital f1 = new USMedical();
		

	}

}
