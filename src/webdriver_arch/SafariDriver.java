package webdriver_arch;

public class SafariDriver implements WebDriver{
	public SafariDriver() {
		System.out.println("safari driver");
	}

	@Override
	public void findElement() {
		System.out.println("findElement");
	}

	@Override
	public void findElements() {
		System.out.println("findElements");
	}

	@Override
	public void click() {
		System.out.println("click");
	}

	@Override
	public void sendkeys(String value) {
		System.out.println("send keys");
	}

	@Override
	public void get(String url) {
		System.out.println("get");
	}

	@Override
	public String getTitle() {
		System.out.println("gettitle");
		return null;
	}

	@Override
	public void close() {
		System.out.println("close");
	}

}
