/**
 * 
 */
package com.academy.qa.utilities;

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
public class Excell {

	FileInputStream fis;
	FileOutputStream fos;
	XSSFWorkbook workbook;
	XSSFSheet sheet;
	XSSFRow row;
	XSSFCell cell;
	
	Excell excell;
	
	public int getLastRow(String path, String sheetName) throws IOException
	{
		fis= new FileInputStream(path);
		workbook=new XSSFWorkbook(fis);
		sheet=workbook.getSheet(sheetName);
		int row=sheet.getLastRowNum();
		workbook.close();
		fis.close();
		return row;
	}
	
	public int getLastCell(String path, String sheetName, int rownum) throws IOException
	{
		fis= new FileInputStream(path);
		workbook=new XSSFWorkbook(fis);
		sheet=workbook.getSheet(sheetName);
		row=sheet.getRow(rownum);
		int cell= row.getLastCellNum();
		workbook.close();
		fis.close();
		return cell;
	}
	
	public String getCellData(String path, String sheetName, int rownum, int cellnum) throws IOException
	{
		fis= new FileInputStream(path);
		workbook=new XSSFWorkbook(fis);
		sheet=workbook.getSheet(sheetName);
		row=sheet.getRow(rownum);
		cell= row.getCell(cellnum);
		String data;
			try
			{
				DataFormatter format= new DataFormatter();
				String cellData=format.formatCellValue(cell);
				return cellData;
			}
			catch(Exception e)
			{
				e.printStackTrace();
				data="";
				
				fis.close();
				workbook.close();
				return data;
			}
	}
	
	
	@DataProvider(name="loginData")
	public String[][] getData() throws IOException
	{
		String path=System.getProperty("user.dir")+"\\ExcellFile\\document (4).xlsx";
		excell= new Excell();
		int rownum=excell.getLastRow(path, "Sheet1");
		int cellnum=excell.getLastCell(path, "Sheet1", rownum);
		
		String data[][]= new String[rownum][cellnum];
		
		for (int i=1; i<rownum;i++)
		{
			for (int j=0; j<cellnum;j++)
			{
				 data[i-1][j]= excell.getCellData(path, "Sheet1", i, j);
			}
		}
		return data;
		
	}
	
}
