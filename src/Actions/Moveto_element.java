package Actions;

import java.awt.Desktop.Action;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Moveto_element 
{
public static void main(String[] args) throws InterruptedException 
{
	WebDriver d1=new ChromeDriver();
	d1.get("https://www.flipkart.com");
	d1.manage().window().maximize();
	Thread.sleep(2000);
	d1.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
	WebElement tw = d1.findElement(By.xpath("//div[text()='Two Wheelers']"));
	Thread.sleep(2000);
	Actions act=new Actions(d1);
	act.moveToElement(tw).perform();
	Thread.sleep(2000);
	
	WebElement tw2 = d1.findElement(By.xpath("//a[text()='Electric Vehicles']"));
	//act.moveToElement(tw2).click().perform();
	act.click(tw2).perform();
	
}
}
