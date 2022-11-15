package Parameterisation;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.ss.usermodel.WorkbookFactory;

public class String_data_fetching {
public static void main(String[] args) throws Throwable {
	//Create object of FileInputStream class
	FileInputStream fis=new FileInputStream("D:\\Notes\\Book1.xlsx");
	//use create method to open excel sheet
	String value=WorkbookFactory.create(fis).getSheet("Sheet2").getRow(0).getCell(1).getStringCellValue();
	// [Note] : it will fetch combination of alpha-numeric and special chars as String value
	
	System.out.println(value);
}
}
