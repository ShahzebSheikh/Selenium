package mock_21;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ex2 
{
public static void main(String[] args) throws InterruptedException 
{

	WebDriver driver=new ChromeDriver();
	driver.get("https://www.facebook.com");
	driver.manage().window().maximize();
	WebElement s1 = driver.findElement(By.xpath("//input[@name='email']"));
	s1.sendKeys("abc");
	Thread.sleep(1000);
	s1.clear();
	Thread.sleep(1000);
	s1.sendKeys("xyz");
	String text = driver.findElement(By.xpath("//a[text()='Forgotten password?']")).getText();
	System.out.println(text);
	boolean res = driver.findElement(By.xpath("//button[@name='login']")).isEnabled();
	System.out.println(res);
	boolean res1 = driver.findElement(By.xpath("//img[@class='fb_logo _8ilh img']")).isDisplayed();
	System.out.println(res1);
	driver.findElement(By.xpath("//a[text()='Create new account']")).click();
	Thread.sleep(2000);
	boolean res2 = driver.findElement(By.xpath("(//label[text()='Female']")).isSelected();
	System.out.println(res2);
	
}
}
