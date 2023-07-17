package webdriver_arch;

public interface WebDriver extends SearchContext{
	public void findElement();
	public void findElements();
	public void click();
	public void sendkeys(String value);
	public void get(String url);
	public String getTitle();
	public void close();

}
