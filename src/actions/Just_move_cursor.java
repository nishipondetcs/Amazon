package actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Just_move_cursor {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","E:\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.facebook.com/");
	//inspect the element where we need to move the cursor
	WebElement element=driver.findElement(By.xpath("//a[text()=\'Create a Page\']"));
	// now creat object of the actions class
	Actions act=new Actions(driver);
	act.moveToElement(element).perform();
}
}

