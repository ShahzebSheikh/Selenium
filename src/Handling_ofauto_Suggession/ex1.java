package Handling_ofauto_Suggession;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ex1 
{
public static void main(String[] args) throws InterruptedException 
{
WebDriver driver=new ChromeDriver();	
driver.get("https://www.google.com/");
//driver.manage().window().maximize();

driver.findElement(By.xpath("//textarea[@class='gLFyf']")).sendKeys("toys");
Thread.sleep(2000);
   
List<WebElement> alloptions = driver.findElements(By.xpath("//ul[@class='G43f7e']/li"));
Thread.sleep(2000);
    String exptext = "toys for kids";
    Thread.sleep(2000);
    for(WebElement s1:alloptions) 
    {
    	String actualtext = s1.getText();
    	System.out.println(actualtext);
    	
    	
    	if(actualtext.equals(exptext)) 
    	{	
    		s1.click();
    		break;
    		
   
    	}
    }
}
}
