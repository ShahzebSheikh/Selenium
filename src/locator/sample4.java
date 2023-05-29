package locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class sample4 
{
public static void main(String[] args) throws InterruptedException 
{
	WebDriver driver=new ChromeDriver();
	driver.get("https://bhulekh.mahabhumi.gov.in/");
	driver.manage().window().maximize();
	Thread.sleep(3000);
	//driver.findElement(By.xpath("//select[@id='list']")).sendKeys("Pune");
   Select sc=new Select(driver.findElement(By.xpath("//select[@id='list']")));
   sc.selectByIndex(5);
   Thread.sleep(3000);
   driver.findElement(By.xpath("//input[@value='Go']")).click();
   
   driver.findElement(By.xpath("//input[@type='radio']")).click();
   
  // Select sc1=new Select(driver.findElement(By.xpath("//select[@id='distSelect']")));
  // Thread.sleep(3000);
  // driver.findElement(By.xpath("//input[@id='rb712']")).click();
 //  Select sc1=new Select(driver.findElement(By.xpath("//select[@id='distSelect']")));
  // Thread.sleep(2000);
  // sc1.selectByIndex(4);
}
}
