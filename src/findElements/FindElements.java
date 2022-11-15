package findElements;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElements {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","E:\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.facebook.com/");
	driver.manage().window().maximize();
	int count=0;
	List<WebElement> Element = driver.findElements(By.xpath("//div"));
	for(WebElement i: Element) {
		String str=i.getText();
		count++;
		System.out.println(str);
	
	}
	System.out.println(count);
}
}
