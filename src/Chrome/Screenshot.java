package Chrome;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class Screenshot {
public static void main(String[] args) throws InterruptedException, IOException {
	System.setProperty("webdriver.chrome.driver","E:\\\\chromedriver_win32\\\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.flipkart.com/");
	Thread.sleep(2000);
	//how to take screenshot:
	// first perform typecasting of takesScreenshot 
	TakesScreenshot ts=(TakesScreenshot)driver;
	//use getScreenshotAs method and store file in src
	File src=ts.getScreenshotAs(OutputType.FILE);
	 //create folder where we need to store screenshot and give the path of folder with proper name and extension
File dest=new File("D:\\byjus notes\\flipkart.jpg");
//copy screenshot from src to dest
Files.copy(src, dest);

}
}
