package Handling_of_Multiple_element;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sample1 
{
public static void main(String[] args) 
{
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.amazon.in");
	driver.manage().window().maximize();
	List<WebElement> alllink = driver.findElements(By.xpath("//a"));
	System.out.println(alllink.size());
	for( WebElement s1:alllink) 
	{
		System.out.println(s1.getText());
	}
}
}
