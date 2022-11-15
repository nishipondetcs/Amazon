package Parameterisation;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Boolean_data_fetch {
public static void main(String[] args) throws Throwable {
	//fetch excel file from memory
	FileInputStream fis=new FileInputStream("D:\\VCTC class notes\\Book1.xlsx");
	boolean b=WorkbookFactory.create(fis).getSheet("Sheet1").getRow(2).getCell(4).getBooleanCellValue();
	System.out.println(b);
}
}
