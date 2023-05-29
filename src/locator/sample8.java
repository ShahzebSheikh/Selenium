package locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class sample8 
{
public static void main(String[] args) 
{
	WebDriver driver=new ChromeDriver();
	driver.get("https://meet.google.com/");
	String text=driver.findElement(By.xpath("//div[@class=['XEazBc adnwBd']")).getText();
	System.out.println(text);
}
}
