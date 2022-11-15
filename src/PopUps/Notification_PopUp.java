package PopUps;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Notification_PopUp {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver","E:\\chromedriver_win32\\chromedriver.exe");
	
	//To disable the notification popup, we have to create the object of the ChromeOptions class.
	ChromeOptions c=new ChromeOptions();//object created
	c.addArguments("disable-notifications");
	c.addArguments("start-maximized");
	
	WebDriver driver=new ChromeDriver(c);
	Thread.sleep(2000);
	driver.manage().window().maximize();
	driver.get("https://www.hdfc.com/");
	
}

}
