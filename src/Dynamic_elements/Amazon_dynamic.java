package Dynamic_elements;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon_dynamic {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","E:\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.get("https://www.amazon.in/?&ext_vrnc=hi&tag=googhydrabk1-21&ref=pd_sl_4d1ohbptwj_e&adgrpid=58490306106&hvpone=&hvptwo=&hvadid=486391490878&hvpos=&hvnetw=g&hvrand=18178751908328045293&hvqmt=e&hvdev=c&hvdvcmdl=&hvlocint=&hvlocphy=1007788&hvtargid=kwd-298187295805&hydadcr=5657_2175734&gclid=EAIaIQobChMI2a34rujV-gIVf4NLBR06-wnAEAAYASAAEgKJAfD_BwE");
    
	driver.findElement(By.xpath("//input[@id=\'twotabsearchtextbox\']")).sendKeys("mobiles under 20000",Keys.ENTER);
    String phone= driver.findElement(By.xpath("(//div[@class=\'sg-col-inner\']/descendant::span)[75]")).getText();
    System.out.println("Phone Name: "+phone);
    
    String price=driver.findElement(By.xpath("(//div[@class=\'sg-col-inner\']/descendant::span)[85]")).getText();
System.out.println("Price: "+price);

}
}
