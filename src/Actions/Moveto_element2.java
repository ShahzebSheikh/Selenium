package Actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


public class Moveto_element2 
{
public static void main(String[] args) throws InterruptedException 
{
	
	WebDriver d1=new ChromeDriver();
	d1.get("https://www.amazon.in");
	d1.manage().window().maximize();
	Thread.sleep(2000);
	d1.findElement(By.xpath("//div[text()='EN']")).click();
	WebElement tw = d1.findElement(By.xpath("//div[text()='EN']"));
	Thread.sleep(2000);
	Actions act=new Actions(d1);
	act.moveToElement(tw).perform();
//	Thread.sleep(2000);
//	
//	WebElement tw2 = d1.findElement(By.xpath("//a[text()='Electric Vehicles']"));
//	//act.moveToElement(tw2).click().perform();
//	act.click(tw2).perform();
}
}
