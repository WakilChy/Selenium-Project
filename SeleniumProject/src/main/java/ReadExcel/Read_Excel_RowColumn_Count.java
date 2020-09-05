package ReadExcel;
import java.io.IOException;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Read_Excel_RowColumn_Count {
	public static void main(String[] args) throws IOException {
		
		
		//Open workBook
		XSSFWorkbook wb = new XSSFWorkbook("./data/NameList1.xlsx");
		System.out.println(wb);
		
		
		//Get WorkSheet
		XSSFSheet sheet1=wb.getSheet("Sheet2");
		
		
		//Get Row Count
		int rowCount = sheet1.getLastRowNum();
		System.out.println(rowCount);
		
		//Column Count
		short columeCount = sheet1.getRow(0).getLastCellNum();
		System.out.println(columeCount);
		
		
		
		//For Loop inc 3/4/5
		for (int i = 1; i <=rowCount; i++) {
			//Get Row
			XSSFRow row = sheet1.getRow(i);
			
			//Loop for column
			for (int j = 0; j <columeCount; j++) {
				//Get column 
				XSSFCell cell = row.getCell(j);
				
				//Get cell
				String CellValue1 = cell.getStringCellValue();
				System.out.println(CellValue1);
			}
		}
		
	}

}
