package Frameworks;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Check_title {
public static void main(String[] args) throws Throwable, IOException {
	FileInputStream fis=new FileInputStream("D:\\VCTC class notes\\Book1.xlsx");
	Sheet sh=WorkbookFactory.create(fis).getSheet("sheet1");
	
	System.setProperty("webdriver.chrome.driver","E:\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().deleteAllCookies();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	driver.get("https://learn.planet-geology.com/collections/upsc-cse-and-ifos-geology-optional");
	
	String expT=sh.getRow(3).getCell(0).getStringCellValue();
	String actT=driver.getTitle();
	System.out.println(actT);
	System.out.println(expT);
	if(actT.equals(expT)) {
		System.out.println("TC is Passed");
	}
	else {
		System.out.println("TC failed");
	}
}
}
