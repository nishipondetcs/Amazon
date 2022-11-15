package Dynamic_elements;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class clock {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","E:\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.get("https://www.clocktab.com/");
	String time=driver.findElement(By.xpath("//td[@id=\'time_text\']")).getText();
	System.out.println("Time is: "+time);
}
}
