package ExcelSheet_Practice;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.testng.annotations.Test;

public class getAlldatafromExcel 
{
	@Test
	public void alldata() throws EncryptedDocumentException, IOException 
	{
		FileInputStream file = new FileInputStream("C:\\Users\\bvp13\\OneDrive\\Documents\\data.xlsx");
		Sheet sh = WorkbookFactory.create(file).getSheet("Sheet5");
		int lastindex = sh.getLastRowNum();	

		for(int i=0; i<=lastindex; i++)
		{
			int lastCellindex = sh.getRow(i).getLastCellNum()-1;

			for(int j=0; j<=lastCellindex; j++)
			{
				CellType cellType = sh.getRow(i).getCell(j).getCellType();

				if(cellType==cellType.STRING)
				{
					String stringCellValue = sh.getRow(i).getCell(j).getStringCellValue();
					System.out.print(stringCellValue+" | ");
				}
				else if(cellType==cellType.NUMERIC)
				{
					double numericCellValue = sh.getRow(i).getCell(j).getNumericCellValue();
					System.out.print(numericCellValue+" | ");
				}
				else if(cellType==CellType.BOOLEAN)
				{
					boolean booleanCellValue = sh.getRow(i).getCell(j).getBooleanCellValue();
					System.out.print(booleanCellValue+" | ");
				}

			}
			System.out.println();
		}


	}

}
