package ExcelSheet_Practice;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Example10_getAllDataInRowByVerifyingTypeOfCell 
{
public static void main(String[] args) throws EncryptedDocumentException, IOException 
{
	FileInputStream file=new FileInputStream("C:\\Users\\bvp13\\OneDrive\\Documents\\data.xlsx");
	Sheet sh = WorkbookFactory.create(file).getSheet("Sheet2");
	int lastcellindex = sh.getRow(0).getLastCellNum()-1;
	
	for(int i=0; i<=lastcellindex; i++)
	{
		Cell cellinfo = sh.getRow(0).getCell(i);
		CellType s1 = cellinfo.getCellType();
		
		if(s1==CellType.STRING)
		{
			String value = cellinfo.getStringCellValue();
			System.out.print(value+" ");
		}
		else if(s1==CellType.NUMERIC)
		{
			double value = cellinfo.getNumericCellValue();
			System.out.print(value+" ");
		}
		else if(s1==CellType.BOOLEAN)
		{
			boolean value = cellinfo.getBooleanCellValue();
			System.out.print(value+" ");
		}
	}
		
}
	
	
}
