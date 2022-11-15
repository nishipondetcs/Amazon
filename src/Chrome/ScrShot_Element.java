package Chrome;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class ScrShot_Element {
public static void main(String[] args) throws InterruptedException, IOException {
	System.setProperty("webdriver.chrome.driver","E:\\\\chromedriver_win32\\\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.primevideo.com/hp/video/offers/nonprimehomepage/ref=dvm_pds_amz_in_as_s_g_146/257-2767507-7025706?_encoding=UTF8&dvah=nonprimehomepage");
Thread.sleep(2000);
driver.manage().window().maximize();
WebElement parti= driver.findElement(By.xpath("//div[@class=\'pv-brand-logo\']"));
File scr=parti.getScreenshotAs(OutputType.FILE);
File dest=new File("C:\\Users\\USER\\Pictures\\Camera Roll\\Amazonlogo.jpg");
Files.copy(scr, dest);
Thread.sleep(2000);

WebElement parti1= driver.findElement(By.xpath("//div[@class=\'DVPAWebWidgetsCustomComponents_CustomMagnet__inner\']"));
File scr1=parti1.getScreenshotAs(OutputType.FILE);
File dest1=new File("C:\\Users\\USER\\Pictures\\Camera Roll\\Amazonlogo1.jpg");
Files.copy(scr1, dest1);
}
}
