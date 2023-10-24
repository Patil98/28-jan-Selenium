package ExcelSheet_Practice;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.testng.annotations.Test;

public class getAllDataInARow 
{
	@Test
	public void DataInARow () throws EncryptedDocumentException, IOException 
	{
		FileInputStream file = new FileInputStream("C:\\\\Users\\\\bvp13\\\\OneDrive\\\\Documents\\\\data.xlsx");
		Sheet sh= WorkbookFactory.create(file).getSheet("Sheet5");
		int lastcellindex = sh.getRow(0).getLastCellNum()-1;
		
		for(int i=0; i<=lastcellindex; i++)
		{
			String stringCellValue = sh.getRow(0).getCell(i).getStringCellValue();
			System.out.print(stringCellValue+" | ");
		}
		
		
	}

}
