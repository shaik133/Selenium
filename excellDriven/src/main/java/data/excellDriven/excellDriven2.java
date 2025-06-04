package data.excellDriven;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class excellDriven2 {
	ExtentReports extent;
	public ArrayList<String> getData(String testcase) throws IOException
	{
		ExtentSparkReporter report = new ExtentSparkReporter(System.getProperty("user.dir")+"\\reports\\index.html");
		report.config().setReportName("Extent Reports");
		report.config().setDocumentTitle("Testing Reports");
		
		extent = new ExtentReports();
		extent.attachReporter(report);
		extent.setSystemInfo("SJS", "Tester");
		ArrayList<String> a= new ArrayList<String>();
		FileInputStream fis= new FileInputStream("F://Robots//Robot2_DataCapturing//customer.xlsx");
		XSSFWorkbook workbook = new XSSFWorkbook(fis);
		
		int sheets= workbook.getNumberOfSheets();
		
		for ( int i=0; i<sheets; i++)
		{
		if (workbook.getSheetName(i).equalsIgnoreCase("sheet1"))
		{
		XSSFSheet sheet=	workbook.getSheetAt(i);
	Iterator<Row> rows=	sheet.iterator();
Row r=rows.next();
Iterator<Cell> cell=r.cellIterator();
int k=0;
int column=0;
while(cell.hasNext())
{
	if (cell.next().getStringCellValue().equalsIgnoreCase("first name"))
	{
		column=k;
	}
	k++;
}
System.out.println(column);
while(rows.hasNext())
{
	if (rows.next().getCell(column).getStringCellValue().equalsIgnoreCase(testcase)) 
	{
	Iterator <Cell> ce= r.cellIterator();
	while(ce.hasNext())
	{
	a.add(ce.next().getStringCellValue());
	}
	}
}
		}
			
		}
		return a;
	}

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		
		
	}

}
