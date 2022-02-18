package browsers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class EdgeBrowser 
{
	
	public static void main(String[] args) 
	{

	System.setProperty("webdriver.edge.driver", "C:\\Selenium\\Drivers\\msedgedriver.exe");
	WebDriver driver=new EdgeDriver();
	driver.get("https://google.com");
	
	}
}
