package Scrollup_down;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class scroll_action_move_to_element 
{
public static void main(String[] args) {

	WebDriver driver =new ChromeDriver();
	driver.get("https://www.flipkart.com");
	driver.manage().window().maximize();
	driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
	WebElement au = driver.findElement(By.xpath("//a[text()='About Us']"));
	Actions act=new Actions(driver);
	act.moveToElement(au).perform();
	
}

}
