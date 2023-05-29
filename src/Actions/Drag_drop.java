package Actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Drag_drop 
{
public static void main(String[] args) 
{

	WebDriver d1=new ChromeDriver();
	d1.get("https://demo.guru99.com/test/drag_drop.html");
	WebElement s1 = d1.findElement(By.xpath("(//a[@class='button button-orange'])[2]"));
	WebElement s2 = d1.findElement(By.xpath("(//div[@class='ui-widget-content'])[3]"));
	Actions act=new Actions(d1);
	act.dragAndDrop(s1, s2).perform();
}
}
