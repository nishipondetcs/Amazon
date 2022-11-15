package Dynamic_elements;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Handle_dynamic {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","E:\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://covid19.who.int/region/searo/country/in");
		String cnfCase=driver.findElement(By.xpath("(//span[@class=\'sc-AxhCb jXrfEx\'])[1]")).getText();
System.out.println("Confirm cases: "+cnfCase);
	
String deaths=driver.findElement(By.xpath("(//span[@class=\'sc-AxhCb jXrfEx\'])[2]")).getText();
System.out.println("Deaths: "+deaths);
	}

}
