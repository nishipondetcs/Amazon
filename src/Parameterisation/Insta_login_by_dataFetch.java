package Parameterisation;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.time.Duration;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Insta_login_by_dataFetch {
public static void main(String[] args) throws Throwable {
	
	//to fetch test data from excel file, create object of FileInputStream class
	FileInputStream fis=new FileInputStream("D:\\VCTC class notes\\Book1.xlsx");
Sheet sh1=WorkbookFactory.create(fis).getSheet("Sheet2");
String username=sh1.getRow(0).getCell(0).getStringCellValue();
System.out.println(username);
String pw=sh1.getRow(0).getCell(1).getStringCellValue();
System.out.println(pw);
System.setProperty("webdriver.chrome.driver","E:\\Selenium suppliments\\chromedriver_win32\\chromedriver.exe");	
WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.get("https://www.instagram.com/");
	Thread.sleep(3000);
	
	driver.findElement(By.xpath("//input[@class=\'_2hvTZ pexuQ zyHYP\']")).sendKeys(username);
	Thread.sleep(2000);
	driver.findElement(By.xpath("//input[@class=\'_2hvTZ pexuQ zyHYP\']")).sendKeys(pw,Keys.ENTER);
	Thread.sleep(20000);
	driver.findElement(By.xpath("//button[text()='Confirm']")).click();
}
}
