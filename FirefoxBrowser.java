package browsers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FirefoxBrowser
{
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.gecko.driver", "C:\\Selenium\\Drivers\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://google.com");
	}
}
