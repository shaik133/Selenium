package Practice.E2E;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class xlUtility {

	public static FileInputStream fis;
	public static FileOutputStream fos;
	public static XSSFWorkbook workbook;
	public static XSSFSheet sheet;
	public static XSSFRow row;
	public static XSSFCell cell;
	
	public static int getRowCount(String path, String xlsheet) throws IOException
	{
	fis= new FileInputStream(path);
	workbook= new XSSFWorkbook (fis);
	sheet=workbook.getSheet(xlsheet);
	int row=sheet.getLastRowNum();
	workbook.close();
	fis.close();
	return row;
}
	
	public static int getcolCount(String path, String xlsheet, int rownum) throws IOException
	{
		fis= new FileInputStream(path);
		workbook= new XSSFWorkbook (fis);
		sheet=workbook.getSheet(xlsheet);
		 row=sheet.getRow(rownum);
		int cell = row.getLastCellNum();
		workbook.close();
		fis.close();
		return cell;
	}
	
	public static String getCellData(String path, String xlsheet, int rownum, int colnum) throws IOException
	{
		fis= new FileInputStream(path);
		workbook= new XSSFWorkbook (fis);
		sheet=workbook.getSheet(xlsheet);
		row= sheet.getRow(rownum);
		cell=row.getCell(colnum);
		String data;
		try
		{
			DataFormatter formater = new DataFormatter();
			String cellData= formater.formatCellValue(cell);
			return cellData;
		}
		catch(Exception e)
		{
			data="";
			
		}
		
		workbook.close();
		fis.close();
		return data;
		
	}
	
	public static void setCellData(String path, String xlsheet, int rownum, int colnum, String data) throws IOException
	{
		fis= new FileInputStream(path);
		workbook= new XSSFWorkbook (fis);
		sheet= workbook.getSheet(xlsheet);
		row= sheet.getRow(rownum);
		cell= row.getCell(colnum);
		cell.setCellValue(data);
		fos= new FileOutputStream(path);
		workbook.write(fos);
		workbook.close();
		fis.close();
		fos.close();
		
		
	}
	
	
}

