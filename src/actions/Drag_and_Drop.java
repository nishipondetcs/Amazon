package actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Drag_and_Drop {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","E:\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://jqueryui.com/resources/demos/droppable/default.html");
	WebElement elt1= driver.findElement(By.xpath("//div[@id=\'draggable\']"));
	WebElement elt2=driver.findElement(By.xpath("//div[@id=\"droppable\"]"));
	Actions act=new Actions(driver);
	act.dragAndDrop(elt1, elt2).perform();
}
}
