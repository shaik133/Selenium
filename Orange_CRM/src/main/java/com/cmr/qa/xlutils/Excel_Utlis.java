/**
 * 
 */
package com.cmr.qa.xlutils;

import java.io.FileInputStream;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;


import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;


/**
 * @author Admin
 *
 */
public class Excel_Utlis {

	
//	public static ArrayList<String> xlData() throws IOException 
//	{
//		HashMap<String, String> data = new HashMap<String, String>();
//		ArrayList<String> li = new ArrayList<String>();
//		String filePath=System.getProperty("user.dir")+"\\src\\main\\java\\com\\cmr\\qa\\xlutils\\document (4) (2).xlsx";
//		FileInputStream fis = new FileInputStream(filePath);
//		XSSFWorkbook workbook = new XSSFWorkbook(fis);
//		XSSFSheet sheet= workbook.getSheetAt(0);
//		int row=sheet.getLastRowNum();
//		for (int r =1; r<row;r++) {
//			
//			XSSFRow rowNum=sheet.getRow(r);
//			String key=rowNum.getCell(0).getStringCellValue();
//			li.add(key);
//			XSSFRow rowNum1=sheet.getRow(r);
//			String value=rowNum1.getCell(1).getStringCellValue();
//			li.add(value);
//		}
//		
//		return li;
//		
//	}
	
static 	FileInputStream fis;
static 	XSSFWorkbook workbook;
	static XSSFSheet sheet;
	static XSSFRow row;
	static XSSFCell cell;
	
	public static int getRow(String path,String sheetName) throws IOException 
	{
		fis= new FileInputStream(path);
		workbook= new XSSFWorkbook(fis);
		sheet=workbook.getSheet(sheetName);
		int row=sheet.getLastRowNum();
		workbook.close();
		fis.close();
		
		return row;
	}
	
	public static int getCell(String path,String sheetName, int rowNum) throws IOException 
	{
		fis= new FileInputStream(path);
		workbook= new XSSFWorkbook(fis);
		sheet=workbook.getSheet(sheetName);
		XSSFRow row=sheet.getRow(rowNum);
		int cell= row.getLastCellNum();
		workbook.close();
		fis.close();
		
		return cell;
	}
	
	public static String getData(String path,String sheetName, int rowNum, int cellNum) throws IOException 
	{
		fis= new FileInputStream(path);
		workbook= new XSSFWorkbook(fis);
		sheet=workbook.getSheet(sheetName);
		XSSFRow row=sheet.getRow(rowNum);
		XSSFCell cell= row.getCell(cellNum);
		
		
		String data;
		try {
			DataFormatter formate = new DataFormatter();
		String dataValue=formate.formatCellValue(cell);
		return dataValue;
		}
		catch(Exception e) {
			e.printStackTrace();
			data="";
		}
		workbook.close();
		fis.close();
		return data;
	}
}
