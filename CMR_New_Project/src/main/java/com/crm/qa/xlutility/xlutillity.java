/**
 * 
 */
package com.crm.qa.xlutility;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.DataProvider;

/**
 * @author Admin
 *
 */
public class xlutillity {

	public static FileInputStream fis;
	public static FileOutputStream fos;
	public static XSSFWorkbook workbook;
	public static XSSFSheet sheet;
	public static  XSSFRow row;
	public static XSSFCell cell;
	
	
	
	
	
	public static int  getRowCount(String filepath,String Sheet) throws IOException
	{
		
		 fis = new FileInputStream(filepath);
		 workbook = new XSSFWorkbook(fis);
		XSSFSheet sheet=workbook.getSheet(Sheet);
		 int row = sheet.getLastRowNum();
		workbook.close();
		fis.close();
		return row;
}
	
	public static int getCellCount(String filepath, String Sheet, int rownum) throws IOException
	{
		 fis = new FileInputStream(filepath);
		 workbook = new XSSFWorkbook(fis);
		XSSFSheet sheet=workbook.getSheet(Sheet);
		row=sheet.getRow(rownum);
		int cell=row.getLastCellNum();
		workbook.close();
		fis.close();
		return cell;
	}
	
	public static String getCellData(String filepath,String Sheet, int rowcount,int cellcount ) throws IOException {
		fis = new FileInputStream(filepath);
		 workbook = new XSSFWorkbook(fis);
		XSSFSheet sheet=workbook.getSheet(Sheet);
		XSSFRow row=sheet.getRow(rowcount);
		XSSFCell cell=row.getCell(cellcount);
		
		String data;
		try
		{
			DataFormatter format= new DataFormatter();
			String cellData=format.formatCellValue(cell);
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
	public static void setCellData(String filepath,String Sheet, int rownum,int cellnum,String data) throws IOException
	{
		fis = new FileInputStream(filepath);
		 workbook = new XSSFWorkbook(fis);
		XSSFSheet sheet=workbook.getSheet(Sheet);
		XSSFRow row= sheet.getRow(rownum);
		XSSFCell cell=row.createCell(cellnum);
		cell.setCellValue(data);
		fos= new FileOutputStream(filepath);
		workbook.write(fos);
		workbook.close();
		fos.close();
		fis.close();
	}
	
	
	
	
	@DataProvider(name="loginData")
	public static String[][] getData() throws IOException
	{
		String filepath = System.getProperty("user.dir")+"\\src\\main\\java\\com\\crm\\qa\\xlutility\\Misconceptions.xlsx";
		int totalRow=xlutillity.getRowCount(filepath, "Sheet1");
		int totalcell= xlutillity.getCellCount(filepath, "Sheet1", 1);
		String loginData[][]= new String[totalRow][totalcell];
		for(int i=1;i<=totalcell;i++)
		{
			for(int j=0; j<totalcell;j++)
			{
				loginData[i-1][j]=xlutillity.getCellData(filepath, "Sheet1", i, j);
			}
		}
		return loginData;
	}
//	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}