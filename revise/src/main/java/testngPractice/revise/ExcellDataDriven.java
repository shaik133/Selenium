package testngPractice.revise;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcellDataDriven {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		
		
		FileInputStream fis= new FileInputStream("F://Robots//Robot2_DataCapturing//customer.xlsx");
		XSSFWorkbook workbook = new XSSFWorkbook(fis);
		
		int sheets=workbook.getNumberOfSheets();
		for (int i=0; i<sheets;i++)
		{
			if(workbook.getSheetName(i).equalsIgnoreCase("sheet1")) {
				XSSFSheet sheet=workbook.getSheetAt(i);
				
			Iterator<Row>	row=sheet.iterator();
		Row value=	row.next();
		Iterator<Cell> cell=value.cellIterator();
		int k=0;
		int column = 0;
		while(cell.hasNext())
		{
		Cell ce=cell.next();
		if(ce.getStringCellValue().equalsIgnoreCase("first name"))
		{
			column=k;
		}
		k++;
		}
		System.out.println(column);
			}
		
		}
		
		
	
	}

}
