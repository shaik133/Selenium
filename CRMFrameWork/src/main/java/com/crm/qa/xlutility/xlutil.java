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
public class xlutil {
	
	static FileInputStream fis;
	static FileOutputStream fos;
	static XSSFWorkbook workbook;
	static XSSFSheet sheet;
	static XSSFRow row;
	static XSSFCell cell;
	

	public static int getRowCount(String path, String xlfile) throws IOException
	{
		fis= new FileInputStream(path);
		workbook= new XSSFWorkbook(fis);
		XSSFSheet sheet=workbook.getSheet(xlfile);
		int row= sheet.getLastRowNum();
		
		workbook.close();
		fis.close();
		return row;
	}
	
	public static int getCellCount(String path, String xlfile,int rowcount) throws IOException 
	{

		fis= new FileInputStream(path);
		workbook= new XSSFWorkbook(fis);
		XSSFSheet sheet=workbook.getSheet(xlfile);
		XSSFRow row=sheet.getRow(rowcount);
		int cell= row.getLastCellNum();
		workbook.close();
		fis.close();
		return cell;
	}
	
	
	public static String getCellData(String path, String xlfile, int rownum, int cellnum) throws IOException
	{
		fis= new FileInputStream(path);
		workbook= new XSSFWorkbook(fis);
		XSSFSheet sheet=workbook.getSheet(xlfile);
		XSSFRow row=sheet.getRow(rownum);
		XSSFCell cell= row.getCell(cellnum);
		
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
	
	public static String setCellData(String path, String xlfile,int rownum, int cellnum, String data, String data1) throws IOException
	{
		fis= new FileInputStream(path);
		workbook= new XSSFWorkbook(fis);
		XSSFSheet sheet=workbook.getSheet(xlfile);
		row=sheet.getRow(rownum);
		cell=row.getCell(cellnum);
		cell.setCellValue(data);
		fos=new FileOutputStream(path);
		workbook.write(fos);
		fos.close();
		workbook.close();
		fis.close();
		return data;
		
	}
	
	
	@DataProvider(name="loginData")
	public String[][] getData() throws IOException
	{
		String path = null;
		try {
		 path= System.getProperty("user.dir")+"\\excellFile\\Misconceptions.xlsx";
		 
		}
		catch(Exception e)
		{
			e.printStackTrace();
			
		}
		
		int TotalRow= xlutil.getRowCount(path, "Misconceptions.xlsx");
		int TotalCell=xlutil.getCellCount(path, "Misconceptions.xlsx", 1);
		
		String loginData[][]= new String[TotalRow][TotalCell];
		for (int i=1;i<=TotalRow;i++)
		{
			for (int j=0;j<TotalCell;j++)
			{
				//loginData[i-1][j]=xlutil.getCellData(path, "Misconceptions.xlsx", i, j);
				
			}
		}
		return loginData;
	}
}
