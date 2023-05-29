package Popup;

import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Window;
import org.openqa.selenium.chrome.ChromeDriver;

public class Class_window 
{
	public static void main(String[] args) 
	{
		WebDriver driver=new ChromeDriver(); 
		driver.get("https://skpatro.github.io/demo/links/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@name='NewTab']")).click();
		Set<String> allid = driver.getWindowHandles();
		ArrayList<String>  ar=new ArrayList<String> (allid);
		 String child = ar.get(1);
		
		
		
		driver.switchTo().window(child);
		
		driver.findElement(By.xpath("//span[text()='Training']")).click();
		//driver.quit();
		
		driver.switchTo().window(ar.get(0));
		
		driver.findElement(By.xpath("//input[@name='NewWindow']")).click();
		((Window) driver.switchTo().window(child)).maximize();
		
	}

}
