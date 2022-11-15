package Chrome;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;



public class Day_Dropdown {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver","E:\\\\chromedriver_win32\\\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();                                                                                                                                                                     
	driver.get("https://www.facebook.com/");
	Thread.sleep(2000);
	driver.manage().window().maximize();
	Thread.sleep(1000);
	driver.findElement(By.xpath("//a[@class=\'_42ft _4jy0 _6lti _4jy6 _4jy2 selected _51sy\']")).click();
	Thread.sleep(3000);
	WebElement day= driver.findElement(By.xpath("//select[@id=\'day\']"));
	Thread.sleep(2000);
	Select s=new Select(day);
	s.selectByVisibleText("3");
	//Thread.sleep(2000);
	//s.selectByValue("21");
	//Thread.sleep(2000);
	//s.selectByIndex(6);
	
	WebElement Month= driver.findElement(By.xpath("//select[@id=\'month\']"));
	Thread.sleep(2000);

	Select s1=new Select(Month);
	s1.selectByVisibleText("Jun");
	Thread.sleep(2000);
WebElement Year=driver.findElement(By.xpath("//select[@id=\'year\']"));
Select s2=new Select(Year);
Thread.sleep(2000);
s2.selectByVisibleText("1995");
Thread.sleep(2000);
driver.findElement(By.xpath("//label[text()='Male']")).click();


	
	
}
}
