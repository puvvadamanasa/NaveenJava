package oop_Encapsulation;

public class Browser {
	public void launchbrowser() {
		System.out.println("Launch browser");
		checkOSVersion();
		checkversion();
		checkEnoughRAM();
		
	}
	public void getBrversion() {
		checkversion();
	}
	private void checkversion() {
		System.out.println("check version");
	}
	private void checkOSVersion() {
		System.out.println("check OS version");
	}
	private void checkEnoughRAM() {
		System.out.println("check RAM");
	}

}
