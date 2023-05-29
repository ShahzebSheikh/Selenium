package collection;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class sample1 
{
public static void main(String[] args) throws InterruptedException 
{
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.amazon.in");
	driver.manage().window().maximize();
	Thread.sleep(2000);
	//driver.findElement(By.xpath("//*[@class='nav-a  '][2]and [text()='Sell']")).click();
	driver.findElement(By.xpath("//*@id='twotabsearchtextbox' and @type='text'")).sendKeys("abc");
}
}
