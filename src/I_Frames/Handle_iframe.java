package I_Frames;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Handle_iframe {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver","E:\\\\chromedriver_win32\\\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.selenium.dev/selenium/docs/api/java/index.html?org/openqa/selenium/package-summary.html");
Thread.sleep(2000);
driver.manage().window().maximize();
//switch control of selenium to right frame
driver.switchTo().frame("packageListFrame");//control switched to desired iframe
Thread.sleep(2000);
driver.findElement(By.xpath("//a[text()=\'org.openqa.selenium\']")).click();//xpath for element on desired iframe is given to perform action on the element

// now we want to shift to another iframe. 
//But, for that we have to first switch to main web page,
driver.switchTo().defaultContent();// now our control is on main web page.

// now we can switch to 2nd frame
driver.switchTo().frame("packageFrame");
Thread.sleep(2000);
// now find any element on 2nd frame and print it.
String text1= driver.findElement(By.xpath("//span[text()=\'By.Remotable\']")).getText();
System.out.println(text1);
Thread.sleep(2000);

// now again switch control to main web page
driver.switchTo().defaultContent();

//now switch to 3rd iframe
driver.switchTo().frame("classFrame");
Thread.sleep(2000);
driver.findElement(By.xpath("//a[text()=\'Capabilities\']")).click();
}
}
