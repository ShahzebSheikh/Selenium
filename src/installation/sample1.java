package installation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class sample1 
{
public static void main(String[] args) throws InterruptedException 
{
	WebDriver driver = new FirefoxDriver();
   Thread.sleep(3000);
	driver.get("https://www.google.com");
	//driver.manage().window().maximize();
	// Thread.sleep(2000);
	//driver.manage().window().minimize();
	 Thread.sleep(2000);
	driver.navigate().to("https://www.facebook.com");
	 Thread.sleep(2000);
	driver.navigate().back();
	//driver.manage().window().minimize();
	Thread.sleep(3000);
	
	
	driver.switchTo().newWindow(WindowType.WINDOW);
	driver.get("https://www.amazon.com");
	//driver.close();
	driver.quit();
}
}
