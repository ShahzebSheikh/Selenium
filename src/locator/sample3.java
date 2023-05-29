package locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class sample3 
{
  public static void main(String[] args) throws InterruptedException 
  {
	WebDriver  driver=new ChromeDriver();
	driver.get("https://www.facebook.com/");
	Thread.sleep(3000);
	driver.manage().window().maximize();
	//Thread.sleep(2000);
	//driver.manage().window().minimize();
	
}
}