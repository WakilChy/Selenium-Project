package parameterization;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class IntegateDProvExcel_1_Exl   {

	//Change retun type void to String 
	public String[] [] IntegrateExcel() throws IOException  {
		
		
		
		//Open workBook
		XSSFWorkbook wb=new XSSFWorkbook("./data/NameList1.xlsx");
		//System.out.println(wb);
		
		//Get WorkSheet 
		//XSSFSheet sheet=wb.getSheet("Sheet2"); //Call sheet by name
		XSSFSheet sheet=wb.getSheetAt(1); //Call sheet by index
		
		
		//RowCount
		int rowcount = sheet.getLastRowNum();
		System.out.println("Number of Row : "+rowcount);
		
		
		//ColumnCount
		short columnCount= sheet.getRow(0).getLastCellNum();
		System.out.println("Number of Column : "+columnCount);
	
		//Copy array from DataProv /Strole value Row columnCount
		String [][] data=new String[rowcount][columnCount];
		
		
		//1st Loop, including 3/4/5
		for (int i = 1; i <=rowcount; i++) {
			//Get Row   
			XSSFRow row = sheet.getRow(i);
			
			
			//2nd Loop/ including 4/5
			for (int j = 0; j <columnCount; j++) {
				
				//Get Column 
				XSSFCell cell = row.getCell(j);
				
				//Get Cell
				String cellValue = cell.getStringCellValue();
				System.out.println(cellValue);
				
				
				data[i-1][j]=cellValue;
				
			}//End Column Loop
		}//End Row Loop
		return data;
	}

}
