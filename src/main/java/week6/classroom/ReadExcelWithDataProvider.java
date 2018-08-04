package week6.classroom;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class ReadExcelWithDataProvider {
	@Test
	public Object[][] readExcel (String fileName) throws IOException
	{
		XSSFWorkbook wBook = new XSSFWorkbook("./data/"+fileName+".xlsx");
		
		XSSFSheet sheet = wBook.getSheetAt(0);
		
		int rowCount = sheet.getLastRowNum();
		
		int cellCount = sheet.getRow(0).getLastCellNum();
		
		Object[][] data = new Object[rowCount][cellCount];
		
		for ( int i = 1 ; i <= rowCount; i++ )
		{
			XSSFRow row = sheet.getRow(i);
				for ( int j = 0 ; j< cellCount; j++)
				{
					try {
						XSSFCell cell = row.getCell(j);
						data[i-1][j] = cell.getStringCellValue();
					} catch (Exception e) {
						// TODO Auto-generated catch block
						data[i-1][j] = "";
					}
				
				}
		}
		wBook.close();
		
		return data ;
	}
	

}
