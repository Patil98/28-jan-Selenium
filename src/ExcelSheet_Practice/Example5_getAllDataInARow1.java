package ExcelSheet_Practice;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.poifs.filesystem.FilteringDirectoryNode;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Example5_getAllDataInARow1
{
	
	public static void main(String[] args) throws EncryptedDocumentException, IOException 
	{
		FileInputStream file=new FileInputStream("C:\\\\Users\\\\bvp13\\\\OneDrive\\\\Documents\\\\data.xlsx");
		Sheet sh = WorkbookFactory.create(file).getSheet("Sheet3");
     int  last = sh.getRow(0).getLastCellNum()-1;
		
		for(int i=0; i<=last; i++)
		{
			double ge = sh.getRow(0).getCell(i).getNumericCellValue();
			System.out.print(ge+" ");
		}
		
		
		
		
	}
}
