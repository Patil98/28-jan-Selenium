package ExcelSheet;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Example1_getNumericData 
{
	
	public static void main(String[] args) throws EncryptedDocumentException, IOException 
	{
		
		FileInputStream file=new FileInputStream("C:\\Users\\bvp13\\OneDrive\\Documents\\data.xlsx");
		
		String get = WorkbookFactory.create(file).getSheet("Sheet2").getRow(1).getCell(0).getStringCellValue();
		System.out.println(get);
	}

}
