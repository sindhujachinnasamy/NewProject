package week6.classroom;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class ReadExcel {
	@Test
	public void readExcel () throws IOException
	{
		XSSFWorkbook wBook = new XSSFWorkbook("./data/login.xlsx");
		
		XSSFSheet sheet = wBook.getSheetAt(0);
		
		int rowCount = sheet.getLastRowNum();
		
		int cellCount = sheet.getRow(0).getLastCellNum();
		
		for ( int i = 1 ; i <= rowCount; i++ )
		{
			XSSFRow row = sheet.getRow(i);
				for ( int j = 0 ; j< cellCount; j++)
				{
					XSSFCell cell = row.getCell(j);
					String data = cell.getStringCellValue();
					System.out.println(data);
				}
		}
		wBook.close();
		
		
	}
	

}
