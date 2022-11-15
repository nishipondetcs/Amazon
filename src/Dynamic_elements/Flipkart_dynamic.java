package Dynamic_elements;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Flipkart_dynamic {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","E:\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
driver.get("https://www.flipkart.com/");
driver.findElement(By.xpath("//button[text()='✕']")).click();
driver.findElement(By.xpath("//input[@class=\'_3704LK\']")).sendKeys("Mobiles under 20000",Keys.ENTER);

String phone=driver.findElement(By.xpath("(//div[@class=\'col col-7-12\']/descendant::div)[1]")).getText();
System.out.println("Phone Name: "+phone);

String price=driver.findElement(By.xpath("(//div[@class=\'col col-5-12 nlI3QM\']/descendant::div)[3]")).getText();
System.out.println("Price: "+price);

String rating=driver.findElement(By.xpath("(//div[@class=\'col col-7-12\']/descendant::div)[3]")).getText();
System.out.println("Rating: "+rating);

	}

}
