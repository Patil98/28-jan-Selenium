package ExcelSheet_Practice;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.examples.xssf.eventusermodel.XLSX2CSV;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Example9_getDataByVerifyingTypeOfCell 
{
	public static void main(String[] args) throws EncryptedDocumentException, IOException
	{
		FileInputStream file=new FileInputStream("C:\\Users\\bvp13\\OneDrive\\Documents\\data.xlsx");
		Sheet sh = WorkbookFactory.create(file).getSheet("Sheet1");
		Cell cellinfo = sh.getRow(0).getCell(0);
		CellType s1 = cellinfo.getCellType();
		
		if(s1==CellType.STRING)
		{
			String value = cellinfo.getStringCellValue();
			System.out.println(value);
		}
		else if(s1==CellType.NUMERIC)
		{
	      double value = cellinfo.getNumericCellValue();
	      	System.out.println(value);
		}
		else if (s1==CellType.BOOLEAN) 
		{
			boolean value = cellinfo.getBooleanCellValue();
			System.out.println(value);
		}				

		
	}

}
