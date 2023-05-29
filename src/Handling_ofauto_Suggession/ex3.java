package Handling_ofauto_Suggession;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ex3 
{
public static void main(String[] args) throws InterruptedException 
{
	WebDriver driver=new ChromeDriver();
    driver.get("https://www.amazon.in/");

driver.findElement(By.xpath("//input[@type='text']")).sendKeys("mens shirt");
Thread.sleep(3000);
List<WebElement> alloption = driver.findElements(By.xpath("//div[@class='left-pane-results-container']/div"));

String exptext="mens shirt cotton";

for(WebElement s1:alloption)
{
String acttext = s1.getText();
System.out.println(acttext);
if(acttext.equals(exptext))
{
s1.click();
break;
}
}
}
	
}

