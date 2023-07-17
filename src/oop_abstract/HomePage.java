package oop_abstract;

public class HomePage extends Page{

	@Override
	public void title() {
		System.out.println("Homepage title");
	}

	@Override
	public void url() {
		System.out.println("Homepage url");
	}
	@Override
	public void header() {
		System.out.println("Homepage header");
	}
	public void logout() {
		System.out.println("logout");
	}
	

}
