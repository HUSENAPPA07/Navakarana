package My_Project;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class CsvFile02 {

	public static FileInputStream fis;
	public static FileOutputStream fo;
	public static XSSFWorkbook book;
	public static XSSFSheet sheet;
	public static XSSFRow row;
	public static XSSFCell cell;

	public static int getRowCount(String xlfile, String xlsheet) throws Exception {

		fis = new FileInputStream(xlfile);
		book = new XSSFWorkbook(fis);
		sheet = book.getSheet(xlsheet);
		int lastRow = sheet.getLastRowNum();

		book.close();
		fis.close();
		return lastRow;

	}

	public static int getcellCount(String xlfile, String xlsheet, int rowNUm) throws Exception {

		fis = new FileInputStream(xlfile);
		book = new XSSFWorkbook(fis);
		sheet = book.getSheet(xlsheet);
		row = sheet.getRow(rowNUm);
		int lastCell = row.getLastCellNum();

		book.close();
		fis.close();
		return lastCell;

	}
public static String getCellData(String xlfile, String xlsheet,int rowNUm,int celldata) throws Exception {
		
		fis = new FileInputStream(xlfile);
		book = new XSSFWorkbook(fis);
		sheet = book.getSheet(xlsheet);
	    row = sheet.getRow(rowNUm);
	    cell = row.getCell(celldata);
	    
	    String data;
	    try {
	    	
	    	data=cell.toString();
	    }
	    catch(Exception e) {
	    	data = "";
	    }
	    book.close();
		fis.close();
	 return data;
}
	
public static void setCellData (String xlfile, String xlsheet,int rowNUm,int celldata,String data) throws Exception {
fis = new FileInputStream(xlfile);
book = new XSSFWorkbook(fis);
sheet = book.getSheet(xlsheet);
row = sheet.getRow(rowNUm);

cell = row.createCell(celldata);
cell.setCellValue(data);

fo = new FileOutputStream(xlfile);
book.write(fo);
book.close();
fis.close();
fo.close();

}
}
