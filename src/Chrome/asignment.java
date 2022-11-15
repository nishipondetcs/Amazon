package Chrome;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class asignment {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver","E:\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.facebook.com/");
	Thread.sleep(2000);
	driver.manage().window().maximize();
	driver.findElement(By.xpath("//a[@class=\'_42ft _4jy0 _6lti _4jy6 _4jy2 selected _51sy\']")).click();
	Thread.sleep(1000);
WebElement day=	driver.findElement(By.xpath("//select[@id=\'day\']"));
	Select s=new Select(day);
s.selectByVisibleText("15");
}}
