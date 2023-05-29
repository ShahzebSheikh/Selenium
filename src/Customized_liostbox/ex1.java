package Customized_liostbox;

import java.awt.Desktop.Action;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ex1 
{
public static void main(String[] args) throws InterruptedException 
{
	WebDriver driver=new ChromeDriver();
	driver.get("file:///C:/Users/shaze/OneDrive/Desktop/listbox2.html");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	//driver.findElement(By.xpath("//div[@class='custom-select']/select")).click();
 WebElement car = driver.findElement(By.xpath("//div/select"));
 Actions act=new Actions(driver);
 Thread.sleep(2000);
 act.click(car).perform();
 Thread.sleep(1000);
 //driver.close();
 
 act.sendKeys(Keys.ARROW_DOWN).perform();
 Thread.sleep(1000);
 act.sendKeys(Keys.ENTER).perform();
 Thread.sleep(1000);
act.sendKeys(Keys.END).perform();;
act.sendKeys(Keys.ENTER).perform();
for(int i=1;i<=7;i++) 
{
	act.sendKeys(Keys.ARROW_UP).perform();
	 Thread.sleep(500);
}
act.sendKeys(Keys.HOME).perform();
Thread.sleep(500);
 
	
}
}
