package Iframe;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class sample2 
{
public static void main(String[] args) throws InterruptedException 
{

	WebDriver driver=new ChromeDriver();
	driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_myfirst");
	driver.manage().window().maximize();
	Thread.sleep(2000);
	driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@id='iframeResult']")));
	//Thread.sleep(2000);
	driver.switchTo().defaultContent();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//a[@id='menuButton']")).click();
}
}
