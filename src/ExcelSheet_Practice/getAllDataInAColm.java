package ExcelSheet_Practice;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.testng.annotations.Test;

public class getAllDataInAColm 
{
	@Test
	public void DataInACol() throws EncryptedDocumentException, IOException 
	{
		FileInputStream file= new FileInputStream("C:\\Users\\bvp13\\OneDrive\\Documents\\data.xlsx");
		Sheet sh = WorkbookFactory.create(file).getSheet("Sheet5");
		int lastRowindex = sh.getLastRowNum()+1;

		for(int i=1; i<lastRowindex; i++)
		{
			double numericCellValue = sh.getRow(i).getCell(5).getNumericCellValue();
			System.out.println(numericCellValue);
		}





	}
}
