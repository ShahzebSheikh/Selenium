package mock_21;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class ss 
{
public static void main(String[] args) throws IOException 
{
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.amazon.in");
	File ts=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	File dest=new File("C:\\Users\\shaze\\OneDrive\\Desktop\\Screenshot\\amazon.jpg");
FileHandler.copy(ts, dest);
	
}
}
