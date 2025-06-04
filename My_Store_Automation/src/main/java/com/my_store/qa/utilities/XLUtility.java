/**
 * 
 */
package com.my_store.qa.utilities;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

/**
 * @author Admin
 *
 */
public class XLUtility {

	public static FileInputStream fis;
	public static FileOutputStream fos;
	public static	XSSFWorkbook workbook;
	public static	XSSFSheet sheet;
	public static	XSSFRow row;
	public static	XSSFCell cell;
	
//path- System.getProperty("user.dir")+"\\ExcellFile\\document.xlsx"
	
	public static int getLastRow(String path, String sheet) throws IOException
	{
		fis= new FileInputStream(path);
		workbook= new XSSFWorkbook(fis);
		XSSFSheet sheetname=workbook.getSheet(sheet);
		int row=sheetname.getLastRowNum();
		workbook.close();
		fis.close();
		return row;
		
	}
	
	
	public static int getCellCount(String path, String sheet, int rownum) throws IOException
	{
		fis= new FileInputStream(path);
		workbook= new XSSFWorkbook(fis);
		XSSFSheet sheetname=workbook.getSheet(sheet);
		 row= sheetname.getRow(rownum);
		int cell= row.getLastCellNum();
		workbook.close();
		fis.close();
		return cell;	
		
	}
	
	public static String getCellData(String path, String sheet, int rownum, int cellnum) throws IOException
	{
		fis= new FileInputStream(path);
		workbook= new XSSFWorkbook(fis);
		XSSFSheet sheetname=workbook.getSheet(sheet);
		 row= sheetname.getRow(rownum);
		 cell=row.getCell(cellnum);
		 String data;
		 try {
			 DataFormatter format= new DataFormatter();
			String cellData= format.formatCellValue(cell);
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
	
	public static void setCellData(String path, String sheet, int rownum, int cellnum, String data) throws IOException
	
	{
		fis= new FileInputStream(path);
		workbook= new XSSFWorkbook(fis);
		XSSFSheet sheetname=workbook.getSheet(sheet);
		 row= sheetname.getRow(rownum);
		 cell=row.getCell(cellnum);
		cell.setCellValue(data);
		fos = new FileOutputStream(path);
		workbook.write(fos);
		fos.close();
		workbook.close();
		fis.close();
	}
}
