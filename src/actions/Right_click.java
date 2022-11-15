package actions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.interactions.Actions;

public class Right_click {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver","E:\\chromedriver_win32\\chromedriver.exe");
	
WebDriver driver=new ChromeDriver();
Thread.sleep(2000);
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
driver.manage().window().maximize();
driver.get("https://www.amazon.in/Test-TST_Exclusive1002_dummy-Exclusive-1002_Dummy/dp/B084456PC2?ref_=Oct_DLandingS_D_1d98ff53_63&smid=A14CZOWI0VEHLG&th=1");
WebElement target= driver.findElement(By.xpath("//div[@id=\'titleSection\']"));

Actions act=new Actions(driver);
act.moveToElement(target).contextClick().build().perform();

driver.findElement(By.xpath("//input[@name=\'field-keywords\']")).sendKeys("Samsung M23",Keys.ENTER);


}
}
