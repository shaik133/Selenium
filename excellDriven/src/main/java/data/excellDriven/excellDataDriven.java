package data.excellDriven;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class excellDataDriven {

	public ArrayList getData(String testcase) throws IOException
	{
		ArrayList<String> list = new ArrayList<String>();
		FileInputStream fis= new FileInputStream("F://Robots//Robot2_DataCapturing//customer.xlsx");
		XSSFWorkbook workbook= new XSSFWorkbook(fis);
		
	int sheets=	workbook.getNumberOfSheets();
	
	for (int i =0; i<sheets; i++)
	{
		if (workbook.getSheetName(i).equalsIgnoreCase("sheet1"))
		{
		XSSFSheet sheet=	workbook.getSheetAt(i);
		
	Iterator<Row>	rows= sheet.iterator();
	Row value= rows.next();
Iterator<Cell> cell=value.cellIterator();
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
while(rows.hasNext()) {
Row r= rows.next();
if (r.getCell(column).getStringCellValue().equalsIgnoreCase(testcase))
{
	Iterator<Cell> ce= r.cellIterator();
	while(ce.hasNext()) 
	{
		list.add(ce.next().getStringCellValue());
	}
}
		}
		}
		
	}
	return list;
		
	}
	
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

	}

}
