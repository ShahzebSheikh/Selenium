package mock_21;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class ex1 
{
public static void main(String[] args) throws InterruptedException 
{
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.flipkart.com");
	Thread.sleep(2000);
	driver.manage().window().maximize();
	//driver.navigate();
	Thread.sleep(2000);
	driver.navigate().to("https://www.amazon.in");
	driver.navigate().to("https://www.google.com");
	driver.switchTo().newWindow(WindowType.WINDOW);
	Thread.sleep(2000);
	driver.navigate().forward();
	driver.navigate().back();
	driver.navigate().refresh();

	System.out.println(driver.getCurrentUrl());
	System.out.println(driver.getTitle());
	driver.close();
	driver.quit();
	
}
}
