package collection;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class mock 
{
public static void main(String[] args) throws InterruptedException 
{
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.makemytrip.com");
	driver.manage().window().maximize();
	Thread.sleep(3000);
	//driver.findElement(By.xpath("//span[@class='tabsCircle appendRight5']")).click();
	//li[text()='Round Trip']
	driver.findElement(By.xpath("//li[text()='Round Trip']")).click();
}
}
