package My_Project;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class CsvFile01 {

	public static void main(String[] args) throws IOException {
 
		FileInputStream File=new FileInputStream("C:\\Users\\Husenappa.M\\OneDrive\\Desktop\\Test_Data.xlsx");
		XSSFWorkbook Workbook= new XSSFWorkbook(File);
		XSSFSheet Sheet=Workbook.getSheet("Sheet1");
		int  totalRows=Sheet.getLastRowNum();
		int  totalcells=Sheet.getRow(0).getLastCellNum();
		
		System.out.println("Number of Rows:"+ totalRows);
		System.out.println("Number of Cells:"+ totalcells);
		
		for(int r=0;r<=totalRows;r++) {
			
			XSSFRow currentRow=Sheet.getRow(r);
			
		
		for(int c=0;c<totalcells;c++) {
			
		XSSFCell cell=currentRow.getCell(c);
		  
		  System.out.println(cell.toString()+"\t");
		}
		System.out.println();
		
	}

		Workbook.close();
		File.close();
}
}