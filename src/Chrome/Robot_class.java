package Chrome;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Robot_class {
public static void main(String[] args) throws AWTException, InterruptedException {
System.setProperty("webdriver.chrome.driver","E:\\Selenium suppliments\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.amazon.in/ref=ap_frn_logo");
	driver.manage().window().maximize();
	Robot rob=new Robot();
	rob.keyPress(KeyEvent.VK_PAGE_DOWN);
	rob.keyRelease(KeyEvent.VK_PAGE_DOWN);
	Thread.sleep(2000);
	rob.keyPress(KeyEvent.VK_PAGE_DOWN);
	rob.keyRelease(KeyEvent.VK_PAGE_DOWN);
	rob.keyPress(KeyEvent.VK_PAGE_UP);
	rob.keyPress(KeyEvent.VK_PAGE_UP);
	}
}
