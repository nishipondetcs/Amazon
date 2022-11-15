package Chrome;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class Scroll_down_up {//typecasting is required
public static void main(String[] args) throws InterruptedException, IOException {
	System.setProperty("webdriver.chrome.driver","E:\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.flipkart.com/");
	driver.manage().window().maximize();
	driver.findElement(By.xpath("//button[@class=\'_2KpZ6l _2doB4z\']")).click();
	JavascriptExecutor jse=(JavascriptExecutor)driver;
//scroll down
	Thread.sleep(2000);
	jse.executeScript("window.scrollBy(0,2000);");
	//scrollup
	Thread.sleep(1000);
	jse.executeScript("window.scrollBy(0,-1000);");

/*	Thread.sleep(2000);
TakesScreenshot ts=(TakesScreenshot)driver;
//use getScreenshotAs Method
File src=ts.getScreenshotAs(OutputType.FILE);
//Creat folder where we want to store screenshot
File dest=new File("E:\\Notes\\Flipkart.jpg");
Files.copy(src, dest);
*/





}
}
