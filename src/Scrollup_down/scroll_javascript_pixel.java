package Scrollup_down;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class scroll_javascript_pixel 
{

public static void main(String[] args) throws InterruptedException 
{
	WebDriver driver =new ChromeDriver();
	driver.get("https://www.flipkart.com");
	driver.manage().window().maximize();
	driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
	Thread.sleep(2000);
	JavascriptExecutor js=((JavascriptExecutor)driver);
	//Thread.sleep(1000);
	js.executeScript("window.scrollBy(0,1600)");
	Thread.sleep(2000);
	js.executeScript("window.scrollBy(0,-500)");
	
	
}
}
