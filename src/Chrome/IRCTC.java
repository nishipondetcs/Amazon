package Chrome;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.tracing.Span;

public class IRCTC {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver","E:\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.irctc.co.in/nget/train-search");
	driver.manage().window().maximize();
	Thread.sleep(3000);
	driver.findElement(By.xpath("//button[@class='btn btn-primary']")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//a[text()=' REGISTER ']")).click();
	Thread.sleep(4000);
	driver.findElement(By.xpath("//input[@id='userName']")).sendKeys("Nishiponde123",Keys.TAB,"Nishi123@",Keys.TAB,"Nishi123@");
	Thread.sleep(2000);
	//driver.findElement(By.xpath("//input[@id='usrPwd']")).sendKeys("Nishi123@");
//	Thread.sleep(2000);
	//driver.findElement(By.xpath("//input[@id='cnfUsrPwd']")).sendKeys("Nishi123@");
//Thread.sleep(2000);
	
driver.findElement(By.cssSelector("div[class=\'ng-tns-c65-14 ui-dropdown ui-widget ui-state-default ui-corner-all\']")).click();
  driver.findElement(By.xpath("//span[text()=\'English\']")).click();
  Thread.sleep(2000);
  driver.findElement(By.xpath("//div[@class=\'ng-tns-c65-15 ui-dropdown ui-widget ui-state-default ui-corner-all\']")).click();
  driver.findElement(By.xpath("//span[text()=\'What is your pet name?\']")).click();
  
  
  
  
	
}
}
