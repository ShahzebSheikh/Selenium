package locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class sample1 
{
  public static void main(String[] args) throws InterruptedException 
  {
	WebDriver  driver=new ChromeDriver();
	driver.get("https://www.facebook.com/");
	driver.manage().window().maximize();
	driver.findElement(By.xpath("//input[@name='email']")).sendKeys("9561364225");
	//driver.findElement(By.xpath("//a[text()='Forgotten password?']")).click();
    Thread.sleep(3000);
    driver.findElement(By.xpath("//input[contains(@placeholder,'or mobile number')]")).sendKeys("9561364225");
    driver.quit();
  //  Thread.sleep(3000);
  //  driver.findElement(By.xpath("//button[(text()='Search')]")).click();
   // driver.manage().window().minimize();;
    driver.findElement(By.xpath("//input[@name='pass']")).sendKeys("9860919305");
    //driver.findElement(By.xpath("//button[@name='login']")).click();
   // Thread.sleep(2000);
    driver.findElement(By.xpath("//span[@class='x1lliihq x6ikm8r x10wlt62 x1n2onr6']")).click();
    
    //driver.findElement(By.xpath("x193iq5w xeuugli x13faqbe x1vvkbs x1xmvt09 x1lliihq x1s928wv xhkezso x1gmr53x x1cpjm7i x1fgarty x1943h6x xudqn12 x3x7a5m x6prxxf xvq8zen xk50ysn xzsf02u x1yc453h")).click();
  }
}
