package locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class sample9 
{
public static void main(String[] args) 
{
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.flipkart.com/");
	String text=driver.findElement(By.xpath("//a[text()='New to Flipkart? Create an account']")).getText();
	System.out.println(text);
}
}
