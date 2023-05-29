package screenshot;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Ss_facebook 
{
public static void main(String[] args) throws IOException 
{
	WebDriver driver =new ChromeDriver();
	driver.get("https://www.facebook.com");
	//driver.get("");
	File shazeb=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	System.out.println(shazeb);
	File dest =new File("C:\\Users\\shaze\\OneDrive\\Desktop\\Screenshot\\shazeb.jpg");
	FileHandler.copy(shazeb, dest);
	
	
}
}
