package actions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Double_click {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","E:\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.get("https://www.google.com/search?q=google&source=lmns&bih=568&biw=1242&hl=en&sa=X&ved=2ahUKEwj6-qa709X6AhVFjtgFHYePDpMQ_AUoAHoECAEQAA");
WebElement target=driver.findElement(By.xpath("//a[text()='Images']"));
Actions act=new Actions(driver);
act.moveToElement(target).doubleClick().build().perform();
}
}
