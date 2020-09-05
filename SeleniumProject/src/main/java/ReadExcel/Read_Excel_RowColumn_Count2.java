package ReadExcel;

import java.io.IOException;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;




public class Read_Excel_RowColumn_Count2 {

	public static void main(String[] args) throws IOException {
		
		//Workbook
		XSSFWorkbook wb =new XSSFWorkbook("./data/NameList1.xlsx");
		System.err.println(wb);
		
		//Sheet
		XSSFSheet sheet1=wb.getSheet("Sheet2");
		
		
		int lastRow = sheet1.getLastRowNum();
		System.out.println("LastRow : "+lastRow);
		
		short lastCell = sheet1.getRow(0).getLastCellNum();
		System.out.println("LastCell :"+lastCell);
		
				
		
		
		
		//Loop for Row
		for (int i = 1; i<=lastRow ; i++) {
			//Row
			XSSFRow row1 = sheet1.getRow(i);
			
			
			//Loop for column 
			for (int j = 0; j <lastCell; j++) {
				//Cell
				XSSFCell cell1 = row1.getCell(j);
				//Cell Value
				String cellValue = cell1.getStringCellValue();
				
				
				System.out.println(cellValue);
			}
		}

		
		
	}

}
