package ExcelSheet_Practice;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Example6_getAllDataInACol1 
{
	public static void main(String[] args) throws EncryptedDocumentException, IOException
	{
		FileInputStream file=new FileInputStream("C:\\\\Users\\\\bvp13\\\\OneDrive\\\\Documents\\\\data.xlsx");
		Sheet sh = WorkbookFactory.create(file).getSheet("Sheet2");
		int lastindex = sh.getLastRowNum();
		
		for(int i=0; i<=lastindex; i++)
		{
			String all = sh.getRow(i).getCell(1).getStringCellValue();
			System.out.println(all);
		}
	}

}
