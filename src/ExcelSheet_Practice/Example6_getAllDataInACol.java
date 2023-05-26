package ExcelSheet_Practice;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Example6_getAllDataInACol 
{

	public static void main(String[] args) throws EncryptedDocumentException, IOException 
	{
		FileInputStream file=new FileInputStream("C:\\Users\\bvp13\\OneDrive\\Documents\\data.xlsx");
		Sheet sh = WorkbookFactory.create(file).getSheet("Sheet1");
		int lastrowindex = sh.getLastRowNum();
		
		for(int i=0; i<=lastrowindex; i++)
		{
			String value = sh.getRow(i).getCell(0).getStringCellValue();		
			System.out.println(value);
			
		}
	}
}
