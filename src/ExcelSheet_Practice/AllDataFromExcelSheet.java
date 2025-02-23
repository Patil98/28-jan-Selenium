package ExcelSheet_Practice;

import java.io.FileInputStream;
import java.io.IOException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class AllDataFromExcelSheet {

	public static void main(String[] args) throws Exception, IOException
	{
		FileInputStream file = new FileInputStream("C:\\\\Users\\\\bvp13\\\\OneDrive\\\\Documents\\\\data.xlsx");
		Sheet sheet = WorkbookFactory.create(file).getSheet("Sheet5");
		int rowcount = sheet.getLastRowNum();
		short cellcount = sheet.getRow(0).getLastCellNum();
		
		for(int i=0; i<=rowcount; i++)
		{
			for(int j=0; j<cellcount; j++)
			{
				Cell cell = sheet.getRow(i).getCell(j);
				switch (cell.getCellType()) 
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
