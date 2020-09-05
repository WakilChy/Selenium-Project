package ReadExcel;
import java.io.IOException;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Read_Excel_Cell {
	public static void main(String[] args) throws IOException {
		
		
		//Open workBook
		XSSFWorkbook wb = new XSSFWorkbook("./data/NameList1.xlsx");
		System.out.println(wb);
		
		//find sheet by name 
		XSSFSheet sheet1=wb.getSheet("Sheet2");
		
		
		//Go to ROW from data to be reed
		XSSFRow row=sheet1.getRow(4);
		
		
		//Go to column where data to read
		XSSFCell cell=row.getCell(1);
		
		
		//Read the selected value of cell
		String CellValue1 = cell.getStringCellValue();
		System.out.println(CellValue1);
		
	}

}
