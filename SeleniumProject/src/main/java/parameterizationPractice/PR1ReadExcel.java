package parameterizationPractice;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class PR1ReadExcel {
	
	public String[][] excelMethod() throws IOException {
		
		
		
		XSSFWorkbook workB=new XSSFWorkbook("./data/NameList1.xlsx");
		XSSFSheet sheet=workB.getSheetAt(1);
		
		int lastRow = sheet.getLastRowNum();
		short lastCell = sheet.getRow(0).getLastCellNum();
		
		
		
		String [][] data=new String[lastRow][lastCell];
		
		
		
		for (int i = 1; i <=lastRow; i++) {
			XSSFRow row = sheet.getRow(i);
			
			
			
			for (int j = 0; j <lastCell; j++) {
				XSSFCell cell = row.getCell(j);
				String cellValue = cell.getStringCellValue();
				
				
				data[i-1][j]=cellValue;
			}
		}
		
		return data;
	}

}
