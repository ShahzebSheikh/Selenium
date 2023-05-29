package locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class sample5 
{
  public static void main(String[] args) throws InterruptedException 
  {
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.facebook.com");
	Thread.sleep(2000);
	driver.manage().window().maximize();
	WebElement shazeb =driver.findElement(By.xpath("//input[@name='email']"));
	shazeb.sendKeys("abc");
	Thread.sleep(2000);
	//shazeb.clear();
	String shazeb1=driver.findElement(By.xpath("//a[text()='Forgotten password?']")).getText();
System.out.println(shazeb1);
	
boolean pramod=driver.findElement(By.xpath("//button[text()='Log in']")).isEnabled();
System.out.println(pramod);

if(pramod) 
{System.out.println("element is enable");
	}
else {
	System.out.println("element is not enable");
	
}

	
	
}
}
