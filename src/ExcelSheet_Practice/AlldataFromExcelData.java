package ExcelSheet_Practice;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class AlldataFromExcelData 
{
	public static void main(String[] args) throws IOException 
	{
		FileInputStream file = new FileInputStream("C:\\\\Users\\\\bvp13\\\\OneDrive\\\\Documents\\\\data.xlsx");
		XSSFWorkbook xss = new XSSFWorkbook(file);
		XSSFSheet sh = xss.getSheet("Sheet6");
		int rowcount = sh.getLastRowNum();
		short cellcount = sh.getRow(0).getLastCellNum();
		
		for(int i=1; i<=rowcount; i++)
		{
			for(int j=0; j<cellcount; j++)
			{
				XSSFCell cell = sh.getRow(i).getCell(j);
				switch(cell.getCellType())
				{
				case STRING:System.out.print(cell.getStringCellValue());break;
				case NUMERIC:System.out.print(cell.getNumericCellValue());break;
				case BOOLEAN:System.out.print(cell.getBooleanCellValue());break;
				}
				System.out.print(" | ");
			}
			System.out.println();	
		}
	}
}
