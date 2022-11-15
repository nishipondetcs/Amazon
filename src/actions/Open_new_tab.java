package actions;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Open_new_tab {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","E:\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.manage().window().maximize();
	driver.get("https://www.culturalindia.net/indian-architecture/ancient-architecture/cave-architecture.html");

driver.switchTo().newWindow(WindowType.TAB);//it will open a new tab
driver.get("https://www.google.com/");
System.out.println("after switching title is"+driver.getTitle());
}
}
