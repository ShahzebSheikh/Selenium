package Actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Right_click
{
public static void main(String[] args) 
{

	WebDriver d1=new ChromeDriver();
	d1.get("https://demo.guru99.com/test/simple_context_menu.html");
	 WebElement s1 = d1.findElement(By.xpath("//span[text()='right click me']"));
	 Actions act=new Actions(d1);
	 act.moveToElement(s1).contextClick().perform();
	// act.contextClick(s1).perform();
}
}
