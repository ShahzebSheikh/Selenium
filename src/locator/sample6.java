package locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class sample6 
{
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com");
		Thread.sleep(2000);
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//a[contains(text(),'account')]")).click();
		Thread.sleep(3000);
//		WebElement fn =driver.findElement(By.xpath("//input[@class='inputtext _58mg _5dba _2ph-'][1]"));
//		fn.sendKeys("pramod");
//		Thread.sleep(3000);
//		WebElement ln =driver.findElement(By.xpath("//input[@name='lastname']"));
//		ln.sendKeys("gawade");
//		
//		driver.findElement(By.xpath("//input[@name='reg_email__']")).sendKeys("9767246170");
//		Thread.sleep(3000);
//		driver.findElement(By.xpath("//input[@name='reg_passwd__']")).sendKeys("pramod@1994");
//		Thread.sleep(3000);
//		Select sc=new Select(driver.findElement(By.xpath("//select[@name='birthday_day']")));
//		   sc.selectByValue("19");
//		   Thread.sleep(2000);
//		   Select sc1=new Select(driver.findElement(By.xpath("//select[@name='birthday_month']")));
//		   sc1.selectByValue("10");
//		   Thread.sleep(2000);
//		   Select sc2=new Select(driver.findElement(By.xpath("//select[@name='birthday_year']")));
//		   sc2.selectByValue("1994");
//		   Thread.sleep(2000);
//		   driver.findElement(By.xpath("//input[@value='2']")).click();
		   driver.findElement(By.xpath("//button[@name='websubmit']")).click();
		   
		   
	}

}
