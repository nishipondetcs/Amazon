package PopUps;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert_PopUp {
	//Alert PopUp freezes the screen so we have to use switchTo method to perform action on that pop up
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver","E:\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://demo.guru99.com/test/delete_customer.php");
	Thread.sleep(2000);
	driver.findElement(By.xpath("//input[@name=\'cusid\']")).sendKeys("123456",Keys.ENTER);
	//now switch control to alert pop up
	Alert alt= driver.switchTo().alert();
	Thread.sleep(2000);
	//To print the text on the alert popUp use the following method
	String txt= alt.getText();
	System.out.println(txt);
	//use accept() for selecting "OK"
    alt.accept();
    
	//use dismiss() for selecting "Cancel" option
//	alt.dismiss();
	Thread.sleep(1000);
	alt.accept();
//	
}
}
