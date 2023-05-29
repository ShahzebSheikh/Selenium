package Actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Double_click

{
public static void main(String[] args) 
{

	WebDriver d1=new ChromeDriver();
	d1.get("https://demo.guru99.com/test/simple_context_menu.html");
	WebElement dc = d1.findElement(By.xpath("//button[text()='Double-Click Me To See Alert']"));
	Actions act=new Actions(d1);
	act.doubleClick(dc).perform();
}
}
