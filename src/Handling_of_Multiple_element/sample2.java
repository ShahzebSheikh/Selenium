package Handling_of_Multiple_element;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class sample2 
{
public static void main(String[] args) throws InterruptedException {
	WebDriver driver=new ChromeDriver();
	driver.get("file:///C:/Users/shaze/OneDrive/Desktop/excel/multipleelement.html");
	List<WebElement> alllink = driver.findElements(By.xpath("//input[@type='checkbox']"));
	
	for(int i=0;i<=alllink.size()-1;i++) 
	{
		alllink.get(i).click();
		Thread.sleep(1000);
	}
	
	//for(WebElement s1:alllink) 
	//{
	//	s1.click();
	//	Thread.sleep(500);
	//}
	
	for(int i=alllink.size()-1;i>=0;i--) 
	{
		alllink.get(i).click();
		Thread.sleep(500);
	}
	
	
}
}
