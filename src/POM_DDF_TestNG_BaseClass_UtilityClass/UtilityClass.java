package POM_DDF_TestNG_BaseClass_UtilityClass;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class UtilityClass 

{
	
	//@AuthorName:Bhushan
	//This method is use to get Test data from excel.
	//need to pass 2 inputs: 1-rowIndex, 2-colIndex
	
	public static String getTestData(int rowindex ,int colindex) throws EncryptedDocumentException, IOException 
	{
		FileInputStream file=new FileInputStream("C:\\\\Users\\\\bvp13\\\\OneDrive\\\\Documents\\\\data.xlsx");
		Sheet sh = WorkbookFactory.create(file).getSheet("DDF");
		String value = sh.getRow(rowindex).getCell(colindex).getStringCellValue();
		
		return value;
	}

	
}
