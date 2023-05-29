package locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class sample2 
{
public static void main(String[] args) throws InterruptedException 
{
	WebDriver driver= new ChromeDriver();
	driver.get("https://www.google.com");
	driver.findElement(By.xpath("//textarea[@id='APjFqb']")).sendKeys("w3schools");
	
	Thread.sleep(4000);
	driver.findElement(By.xpath("input[@value='Google search']")).click();
}
}
