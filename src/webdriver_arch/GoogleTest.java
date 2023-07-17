package webdriver_arch;

public class GoogleTest {
	static WebDriver driver;

	public static void main(String[] args) {
		String browser="chrome";
		if(browser.equals("chrome")) {
			driver=new ChromeDriver();
		}
		else if(browser.equals("firefox")) {
			driver=new Firefox();
		}
		else if(browser.equals("safari")) {
			driver=new SafariDriver();
		}
		else {
			System.out.println("Invalid browser");
		}
		WebDriver driver = new ChromeDriver();
		driver.get("gooele.com");
		driver.getTitle();
		driver.close();
		driver.click();
		driver.findElement();
		driver.findElements();
		driver.sendkeys("jfh");
		Firefox driver1 = new Firefox();

	}

}
