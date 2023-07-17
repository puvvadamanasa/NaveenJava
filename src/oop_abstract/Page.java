package oop_abstract;

public abstract class Page {
	
	public Page() {
		System.out.println("page default");
	}
	public Page(int t) {
		System.out.println(t);
	}
	public abstract void title();
	public abstract void url();
	public void header() {
		System.out.println("page header");
	}
	public final void logo() {
		System.out.println("page logo");
	}
	public static void hi() {
		System.out.println("Page hi");
	}

}
