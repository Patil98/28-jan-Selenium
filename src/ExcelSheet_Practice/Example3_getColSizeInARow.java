package ExcelSheet_Practice;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Example3_getColSizeInARow 
{
	
	public static void main(String[] args) throws EncryptedDocumentException, IOException
	
	{
		FileInputStream file=new FileInputStream("C:\\Users\\bvp13\\OneDrive\\Documents\\data.xlsx");
		short get = WorkbookFactory.create(file).getSheet("sheet1").getRow(0).getLastCellNum();
		System.out.println(get);
		
	}

}
