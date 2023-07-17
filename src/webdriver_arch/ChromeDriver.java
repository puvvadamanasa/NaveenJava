package webdriver_arch;

public class ChromeDriver implements WebDriver{
	public ChromeDriver() {
		System.out.println("Launch chrome driver");
	}

	@Override
	public void findElement() {
		System.out.println("find element");	
	}

	@Override
	public void findElements() {
		System.out.println("find elements");	
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
		System.out.println("url");
	}

	@Override
	public String getTitle() {
		System.out.println("get title");
		return null;
	}

	@Override
	public void close() {
		System.out.println("close");
	}

}
