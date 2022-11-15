package findElements;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class print_all_elements {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","E:\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.get("https://www.flipkart.com/");
	//dismiss the login popup
	driver.findElement(By.xpath("//button[text()=\'✕\']")).click();
// find all elements with tagname div and store them inside a reference variable with return type as List<WebElement>
	int count=0;
	List<WebElement> Element= driver.findElements(By.xpath("//div"));
	//Now we have to get  Text of each element on web page so use for loop to perform action on each element(without using actions class onject)
for(WebElement i: Element) {
	//get elements from List<WebElement> variable
	String str= i.getText();
	count++;
	//print elements one by one
	System.out.println(str);
}
//print count
System.out.println(count);
	
}
}
