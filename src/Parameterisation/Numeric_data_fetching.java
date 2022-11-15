package Parameterisation;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.ss.usermodel.WorkbookFactory;



public class Numeric_data_fetching {
public static void main(String[] args) throws Throwable {
	FileInputStream fis=new FileInputStream("D:\\VCTC class notes\\Book1.xlsx");
	double value=WorkbookFactory.create(fis).getSheet("Sheet1").getRow(1).getCell(2).getNumericCellValue();
	System.out.println(value);
}
}
